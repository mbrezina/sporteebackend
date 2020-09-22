
== Development environment

=== Database - MariaDB

You can run MariaDB instance using this command:
```
docker run --name sporteezone-mariadb -e MYSQL_ROOT_PASSWORD=root-pw -e MYSQL_DATABASE=Sporteezone -e MYSQL_USER=student -e MYSQL_PASSWORD=password -p 3306:3306 mariadb:10.5.5
```


You can connect to this instance using CLI:
```
docker run -it --rm mariadb mysql -hhost.docker.internal -ustudent -p
```