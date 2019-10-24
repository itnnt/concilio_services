docker run --name postgres -e POSTGRES_USER=dbapplication_user -e POSTGRES_PASSWORD=sOKJuhssuyUY -d -p 5432:5432 postgres
docker run --detach --name mysql -e MYSQL_ROOT_PASSWORD=justapassword --publish 3306:3306 mysql
docker run --detach --name=mysql --env="MYSQL_ROOT_PASSWORD=justapassword" -p 3306:3306 mysql