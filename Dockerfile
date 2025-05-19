FROM maven:3.9-eclipse-temurin-17@sha256:75c4d813eab02660a1dd7c5af04c2531db326b2b2998fa48082303cb28c1022c

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
