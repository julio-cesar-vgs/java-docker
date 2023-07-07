FROM openjdk:17-jdk

WORKDIR /app

COPY . /app

ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/rest_with_spring_boot?useTimezone=true&serverTimezone=America/Sao_Paulo&allowPublicKeyRetrieval=true&useSSL=false&createDatabaseIfNotExist=true
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=p@ssword

CMD ["bash", "-c", "./mvnw spring-boot:run"]
