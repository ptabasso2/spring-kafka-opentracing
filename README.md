# spring-kafka-opentracing

[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=com.codenotfound%3Aspring-kafka-hello-world&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.codenotfound%3Aspring-kafka-hello-world)

A detailed step-by-step tutorial on how to implement an Apache Kafka Consumer and Producer using Spring Kafka and Spring Boot.

Based on the following project
[https://codenotfound.com/spring-kafka-consumer-producer-example.html](https://codenotfound.com/spring-kafka-consumer-producer-example.html)


Start Zookeeper

`COMP10619:Kafka pejman.tabassomi$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
`

Start kafka server

`COMP10619:Kafka pejman.tabassomi$ kafka-server-start /usr/local/etc/kafka/server.properties
`

Create a Topic

`COMP10619:Kafka pejman.tabassomi$ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users
`

List all Topics

`COMP10619:Kafka pejman.tabassomi$ kafka-topics --list --zookeeper localhost:2181
`

Check if data is landing in kafka

`COMP10619:Kafka pejman.tabassomi$ kafka-console-consumer --bootstrap-server localhost:9092 --topic users --from-beginning
`