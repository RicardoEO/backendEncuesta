# Instrucciones


* Abrir el proyecto con su IDE favorito.
* Abrir la terminal del IDE y ejecutar el siguiente comando para instalar dependencias.
```
./gradlew dependencies
```
* Iniciar el proyecto mediante el siguiente comando o diriguiendose a la clase Main del programa.
```
./gradlew bootRun
```

# Base de datos
La base de datos es una base de datos en memoria, en este caso estamos usando H2.
Para ver la consola de la base de datos se debe ingresar al siguiente enlace.
```
http://localhost:8090/h2-console/
```

En la conexión JDBC debe ir lo siguiente
```
jdbc:h2:mem:test
```

En password debe ir
```
password
```

Finalmente dar a conectar.