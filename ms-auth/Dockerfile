FROM python:3
ENV PYTHONONBUFFERED 1
RUN mkdir /users
WORKDIR /users
ADD . /users/
ARG PORT=8000
EXPOSE $PORT
RUN pip3 install -r requirements.txt
CMD python3 manage.py runserver 0.0.0.0:$PORT
