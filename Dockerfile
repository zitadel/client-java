FROM maven:3-eclipse-temurin-24@sha256:312fa2399c102b3cb171e1467b87f6cb8aac647c2b8ee63f1eb6ffefc0374b04

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
