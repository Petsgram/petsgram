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
    id = models.BigAutoField(primary_key=True)
    username = models.CharField("Username", max_length=50)
    password = models.CharField('Password', max_length=50)
    email = models.EmailField('Email', max_length=50)
    first_name = models.CharField('first_name', max_length=50)
    last_name = models.CharField('last_name', max_length=50)
    profile_pic = models.ImageField('profile_pic', max_length=50, default='default.jpg',
                                    upload_to='profile_pics/%Y/%m/%d/')
    birth_date = models.DateField('birth_date')

    def save(self, **kwargs):
        some_salt = 'mMuJ0DrIK6vgtdIYepkIxF'
        self.password = make_password(self.password, some_salt)
        super().save(**kwargs)

    objects = UserManager()
    USERNAME_FIELD = 'email'
