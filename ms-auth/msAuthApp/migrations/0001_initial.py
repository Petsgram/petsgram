# Generated by Django 3.2.9 on 2021-11-13 04:32

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('auth', '0012_alter_user_first_name_max_length'),
    ]

    operations = [
        migrations.CreateModel(
            name='User',
            fields=[
                ('last_login', models.DateTimeField(blank=True, null=True, verbose_name='last login')),
                ('is_superuser', models.BooleanField(default=False, help_text='Designates that this user has all permissions without explicitly assigning them.', verbose_name='superuser status')),
                ('id', models.BigAutoField(primary_key=True, serialize=False, verbose_name='id')),
                ('username', models.CharField(max_length=50, verbose_name='Username')),
                ('password', models.CharField(max_length=50, verbose_name='Password')),
                ('email', models.EmailField(max_length=50, unique=True, verbose_name='Email')),
                ('first_name', models.CharField(max_length=50, verbose_name='first_name')),
                ('last_name', models.CharField(max_length=50, verbose_name='last_name')),
                ('profile_pic', models.ImageField(default='default.jpg', max_length=50, upload_to='profile_pics/%Y/%m/%d/', verbose_name='profile_pic')),
                ('birth_date', models.DateField(verbose_name='birth_date')),
                ('groups', models.ManyToManyField(blank=True, help_text='The groups this user belongs to. A user will get all permissions granted to each of their groups.', related_name='user_set', related_query_name='user', to='auth.Group', verbose_name='groups')),
                ('user_permissions', models.ManyToManyField(blank=True, help_text='Specific permissions for this user.', related_name='user_set', related_query_name='user', to='auth.Permission', verbose_name='user permissions')),
            ],
            options={
                'abstract': False,
            },
        ),
    ]
