FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn install -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
