FROM openjdk:17
ADD target/ParaCasa-0.0.1-SNAPSHOT.jar ParaCasa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ParaCasa-0.0.1-SNAPSHOT.jar"]