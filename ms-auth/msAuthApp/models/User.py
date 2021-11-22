import os
from uuid import uuid4

from django.contrib.auth.hashers import make_password
from django.contrib.auth.models import BaseUserManager, PermissionsMixin, AbstractBaseUser
from django.db import models


class UserManager(BaseUserManager):
    def create_user(self, email, password=None):
        if not email:
            raise ValueError('Users must have an email address')
        user = self.model(email=self.normalize_email(email))
        user.set_password(password)
        user.save(using=self._db)
        return user

    def create_superuser(self, email, password):
        user = self.create_user(email, password=password)
        user.is_admin = True
        user.save(using=self._db)
        return user


class User(AbstractBaseUser, PermissionsMixin):
    def get_name_to_pic(path):
        def create_path(instance, filename):
            ext = filename.split('.')[-1]
            filename = '{}.{}'.format(uuid4().hex, ext)
            return os.path.join(path, filename)
        return create_path

    id = models.BigAutoField('id', primary_key=True)
    username = models.CharField("Username", max_length=50, unique=True)
    password = models.CharField('Password', max_length=128)
    email = models.EmailField('Email', max_length=50, unique=True)
    first_name = models.CharField('first_name', max_length=50)
    last_name = models.CharField('last_name', max_length=50)
    profile_pic = models.ImageField('profile_pic', default='default.jpg',
                                    upload_to="get_name_to_pic(path='profile_pics/')", blank=True)
    birth_date = models.DateField('birth_date')

    def save(self, **kwargs):
        some_salt = 'mMuJ0DrIK6vgtdIYepkIxF'
        self.password = make_password(self.password, some_salt)
        super().save(**kwargs)

    objects = UserManager()
    USERNAME_FIELD = 'email'
