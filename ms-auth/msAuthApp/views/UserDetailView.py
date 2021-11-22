from rest_framework import generics

from msAuthApp.models.User import User
from msAuthApp.serializers.UserSerializer import UserSerializer


class UserDetailView(generics.RetrieveAPIView):
    queryset = User.objects.all()
    serializer_class = UserSerializer
