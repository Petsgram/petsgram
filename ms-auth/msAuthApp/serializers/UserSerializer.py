from rest_framework import serializers

from msAuthApp.models.User import User


class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['username', 'password', 'email', 'first_name', 'last_name', 'profile_pic', 'birth_date']

    def to_representation(self, instance):
        user = User.objects.get(id=instance.id)
        return {
            'username': user.username,
            'email': user.email,
            'first_name': user.first_name,
            'last_name': user.last_name,
            'profile_pic': user.profile_pic,
            'birth_date': user.birth_date
        }
