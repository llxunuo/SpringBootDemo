#!/bin/bash
docker rm -f $(docker ps -a  | grep "harbor.server64.cn/business/ms-demandflow-organization:1.0.0-SNAPSHOT"| awk '{ print $1 }')  >/dev/null 2>&1
docker rmi -f harbor.server64.cn/business/ms-demandflow-organization:1.0.0-SNAPSHOT  >/dev/null 2>&1