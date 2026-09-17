FROM maven:3-eclipse-temurin-26@sha256:4e980a3c7def35292c12ce1a1dc7872f02165f11717204c7b1c2dc477e40c1b8

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
