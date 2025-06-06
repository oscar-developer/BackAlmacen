# BackAlmacen

Backend del sistema de almacén desarrollado con **Spring Boot 3**, integrado con una base de datos **PostgreSQL**.

---

## 🧱 Compilación del JAR

Para generar el archivo `.jar`:

- **En Windows**:

```bash
./mvnw.cmd clean package
```

- **En Linux/macOS**:

```bash
./mvnw clean package
```

---

## 🚀 Ejecutar el JAR localmente

Ubícate en la carpeta donde se generó el `.jar` y ejecuta:

```bash
java -jar springboot-api-0.0.1-SNAPSHOT.jar
```

---

## 🐳 Construcción multiplataforma con Docker

> Para crear imágenes compatibles con distintas arquitecturas, asegúrate de tener `buildx` configurado.

1. Crear el builder (solo la primera vez):

```bash
docker buildx create --name mybuilder --driver docker-container --bootstrap
```

2. Usar el builder creado:

```bash
docker buildx use mybuilder
```

3. Verificar el builder activo:

```bash
docker buildx inspect
```

---

## 🔐 Iniciar sesión en Docker Hub

Verifica si estás autenticado:

```bash
docker login
```

- Si ves `Login Succeeded`, ya estás autenticado.
- Si no, ingresa tu usuario y contraseña (o token).

---

## 📦 Construir y subir imagen Docker a Docker Hub

Ejecuta el siguiente comando para compilar la imagen para múltiples plataformas y subirla:

```bash
docker buildx build --platform linux/amd64,linux/arm64,linux/arm/v7 -t oscardev7/backalmacen:1.0.0 --push .
```

> ⚠️ Asegúrate de que el nombre del repositorio en Docker Hub esté en minúsculas (`backalmacen`).

---

## 📌 Notas adicionales

- Este proyecto requiere **Java 21** y **Docker** instalado.
- Asegúrate de tener acceso a **Docker Hub** para publicar imágenes.
- Se recomienda usar el JDK Temurin (`eclipse-temurin`) como base para las imágenes.

---

## ✍️ Autor

Oscar Dev – [@oscardev7](https://hub.docker.com/u/oscardev7)
