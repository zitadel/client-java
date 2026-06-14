FROM maven:3-eclipse-temurin-25@sha256:01ef98a139ed64622c086bac54d1e167453d0f2ff68b69d00978f26d8736215c

WORKDIR /app

COPY . .

RUN mvn install -DskipErrorProne=true -Dspotbugs.skip=true --batch-mode -DskipTests

CMD ["jshell", "--class-path", "target/classes:target/lib/*"]
