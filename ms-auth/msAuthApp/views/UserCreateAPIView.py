# Django Rest Framework (generics) for to create the view, user register
from rest_framework import generics, response, status

# Import the token pair serializer
from rest_framework_simplejwt.serializers import TokenObtainPairSerializer

# Imported user serializer
from msAuthApp.serializers import UserSerializer


# CreateAPIView (method: POST)
# This method allows craete a user


class UserCreateAPIView(generics.CreateAPIView):
    serializer_class = UserSerializer

    def post(self, request, *args, **kwargs):
        serializer = UserSerializer(data=request.data)
        serializer.is_valid(raise_exception=True)
        serializer.save()

        tokenData = {"email": request.data["email"],
                     "password": request.data["password"]}
        tokenSerializer = TokenObtainPairSerializer(data=tokenData)
        tokenSerializer.is_valid(raise_exception=True)

        return response.Response(tokenSerializer.validated_data, status=status.HTTP_201_CREATED)
