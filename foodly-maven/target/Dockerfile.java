# Usa un'immagine base Java 19 LTS
FROM adoptopenjdk:19-jre-hotspot

# Crea una directory per l'applicazione
WORKDIR /app

# Copia il file jar dell'applicazione nella directory del container
COPY foodly-maven.jar /app/

# Comando predefinito per avviare l'applicazione
CMD ["java", "-jar", "foodly-maven.jar"]
