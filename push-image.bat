echo off
SETLOCAL enableDelayedExpansion

set AWS_PROFILE=poc
set AWS_REGION=ap-south-1
set DOCKER_IMAGE=demo
set REPOSITORY_NAME=demo
set AWS_ACCOUNT_ID=522166593626

aws ecr get-login-password --region %AWS_REGION% | docker login --username AWS --password-stdin %AWS_ACCOUNT_ID%.dkr.ecr.%AWS_REGION%.amazonaws.com

aws configure set region %AWS_REGION%
docker tag %DOCKER_IMAGE% %AWS_ACCOUNT_ID%.dkr.ecr.%AWS_REGION%.amazonaws.com/%REPOSITORY_NAME%
docker push %AWS_ACCOUNT_ID%.dkr.ecr.%AWS_REGION%.amazonaws.com/%REPOSITORY_NAME%
