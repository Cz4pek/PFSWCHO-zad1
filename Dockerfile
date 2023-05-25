FROM openjdk:17-jdk-alpine as builder
MAINTAINER Cezary_Płatek
#ustawienie folderu roboczego
WORKDIR /app
#przekopiwowanie niezbędnych plików źródłowych projektu
COPY demo/.mvn/ .mvn
COPY demo/mvnw demo/pom.xml ./
COPY demo/src ./src
#nadanie uprawnień do wykonywania dla pliku mvnw 
RUN chmod +x mvnw
#zbudowanie jar na podstawie plików źródłowych 
RUN ./mvnw clean package

FROM openjdk:17-jdk-alpine as runner
MAINTAINER Cezary_Płatek
#przekopiowanie pliku jar z aplikacją z buildera
COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar 
#ustawienie folderu roboczego
WORKDIR /app
#uruchomienie aplikacji
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
