#!/bin/bash
docker exec -it mysql bash
mysql -uroot -p123456
create database demo;
