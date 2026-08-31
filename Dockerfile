FROM maven:3-eclipse-temurin-26@sha256:6ce830fe4c216ab9baaf63d3899d8d178432658bdeb9092cca2bf573475b6b6e

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
