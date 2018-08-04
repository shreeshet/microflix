from mysql:latest

ENV MYSQL_ROOT_PASSWORD=super
ENV MYSQL_DATABASE=sakila
ENV MYSQL_USER=sakilaflix
ENV MYSQL_PASSWORD=thappu

#image automaticaly executes files in docker-entrypoint-initdb.d
# RUN mkdir /docker-entrypoint-initdb.d
#files are executed alphabetical order.
ADD ./sakila-schema.sql /docker-entrypoint-initdb.d/a_schema.sql
ADD ./sakila-data.sql /docker-entrypoint-initdb.d/b_data.sql

CMD ["mysqld","--default-authentication-plugin=mysql_native_password"]
