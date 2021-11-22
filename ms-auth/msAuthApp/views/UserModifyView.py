from rest_framework import generics, status
from rest_framework.response import Response

from msAuthApp.models import User
from msAuthApp.serializers import UserSerializer


class UserModifyView(generics.UpdateAPIView):
    serializer_class = UserSerializer
    queryset = User.objects.all()

    def patch(self, request, *args, **kwargs):
        user = self.queryset.get(pk=kwargs['pk'])
        serializer = self.get_serializer(instance=user, data=request.data, partial=True)

        if serializer.is_valid():
            serializer.save()
            return Response(status=status.HTTP_200_OK, data=serializer.data)
        return Response(status=400, data="wrong parameters")
