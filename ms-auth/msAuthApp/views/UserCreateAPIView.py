# Django Rest Framework (generics) for to create the view, user register
from rest_framework import generics

# Imported user serializer
from msAuthApp.serializers import UserSerializer

# CreateAPIView (method: POST)
# This method allows craete a user
class UserCreateAPIView(generics.CreateAPIView):
    serializer_class = UserSerializer