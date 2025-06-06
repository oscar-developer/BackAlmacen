# Imagen base con Java 21 (solo JRE)
#FROM --platform=linux/amd64  eclipse-temurin:21-jre
FROM --platform=$BUILDPLATFORM eclipse-temurin:21-jre
# FROM eclipse-temurin:21-jre

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el .jar generado desde tu PC al contenedor
COPY target/springboot-api-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que usa tu app
EXPOSE 8090

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]