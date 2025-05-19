FROM maven:3-eclipse-temurin-24@sha256:a13d3969087457f33a4e19db666b7f936e31734d7c1f08b6965afe9ebfc87840

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
