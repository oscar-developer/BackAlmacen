# BackAlmacen
Backend de sistema de almacén desarrollado con Spring Boot 3, integrado con una base de datos PostgreSQL.



# *****  NOTAS ADICIONALES ******
# para crear el JAR se ejecuta el siguiente comando
# en windows 
./mvnw.cmd clean package
# en linux
./mvnw clean package


# PARA PROBAR EL .JAR EN LOCAL
# ir "cd" a la carpeta donde esta el .jar
java -jar .\springboot-api-0.0.1-SNAPSHOT.jar



# ojo para compilar en multiples plataformas usar(docker buildx use mybuilder)
docker buildx create --name mybuilder --driver docker-container  --bootstrap
# user el buildx creado
docker buildx use
# para vera las propiedades del buildx instalado
docker buildx inspect 


# parta Verifica si estás logueado en Docker Hub
# Si ya estás logueado, verás algo como:
# Login Succeeded
# Si no lo estás, te pedirá tu usuario y contraseña (o token de acceso de Docker Hub).
docker login

# para compilar o crear una imagen y desplegarlo a dockerhub
docker buildx build --platform linux/amd64,linux/arm64,linux/arm/v7 -t oscardev7/backalmacen:1.0.0 --push .
