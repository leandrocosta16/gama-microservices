FROM adoptopenjdk/openjdk11:armv7l-centos-jre-11.0.11_9
#RUN mvn clean package -DskipTests
COPY ./target/gama-shoppingcartservice-0.0.1-SNAPSHOT.jar gama-shoppingcartservice.jar
ENTRYPOINT ["java","-jar","/gama-shoppingcartservice.jar"]