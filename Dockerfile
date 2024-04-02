FROM openjdk:17
WORKDIR /app
<<<<<<< HEAD
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8083
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
=======
COPY ./target/SpringBoot-0.0.1-SNAPSHOT.jar /app
EXPOSE 8099
CMD ["java", "-jar", "SpringBoot-0.0.1-SNAPSHOT.jar"]
>>>>>>> bd728d621f979d030bcea06b30efe2ce77c68f99
