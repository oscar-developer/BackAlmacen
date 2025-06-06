# Imagen base con Java 21 (solo JRE)
# Usa una imagen multiplataforma de Java 21
FROM eclipse-temurin:21-jdk-alpine-3.21

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el .jar generado desde tu PC al contenedor
COPY target/springboot-api-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que usa tu app
EXPOSE 8090

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]