FROM openjdk:11-jre-slim
COPY target/bank-transactions.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
ENV SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/banktransaction
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root