# kafka-events

## Stack
* Java 17
* maven 3.8.6
* docker-compose
* docker swarm

### Start do projeto
sh start.sh 
    ou 
docker-compose up -d
mvn spring-boot:run

### Acessar ao console
http://localhost:19000/

### Ver as mensagens
http://localhost:19000/topic/tcc_topic/messages?partition=0&offset=0&count=100&keyFormat=DEFAULT&format=DEFAULT
