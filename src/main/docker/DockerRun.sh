#!/bin/bash
docker run --restart=always --name ms-demandflow-organization --network host -d -p 9311:9311 harbor.server64.cn/business/ms-demandflow-organization:1.0.0-SNAPSHOT  >/dev/null 2>&1