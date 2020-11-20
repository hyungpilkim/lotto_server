FROM mariadb:latest as builder

COPY ./backup/*.sql /docker-entrypoint-initdb.d/

VOLUME ["./log",  "/var/log/maria"]
VOLUME ["./data",  "/var/lib/mysql"]
VOLUME ["./config/mariadb.cnf", "/etc/mysql/conf.d"]