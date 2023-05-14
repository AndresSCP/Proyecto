# Proyecto MyAlert
---

Este proyecto fue desarrollado como parte de un portafolio para un bootcamp de Desarrollador Java Full Stack Trainee, con el objetivo de demostrar las habilidades y conocimientos adquiridos durante el programa de formación y presentarlos a posibles empleadores y/o clientes.

Se presenta como aplicación web para que los usuarios posteen mensajes relacionados con temas de seguridad, tales como accidentes, incendios, robos, entre otros. La aplicación está diseñada bajo el patrón de arquitectura Modelo-Vista-Controlador (MVC), utilizando java y formato maven con Spring MVC como framework para la implementación.

El objetivo principal de la aplicación es proporcionar a los usuarios un medio seguro y fácil de usar para compartir información sobre situaciones de riesgo y alertar a otros usuarios en su área. La plataforma permite a los usuarios crear publicaciones con detalles de la situación de seguridad que están experimentando, así como proporcionar información útil, como ubicación y fotografías, para ayudar a otros usuarios a identificar y evitar posibles peligros.

La aplicación está diseñada con una interfaz de usuario intuitiva y fácil de usar, lo que permite a los usuarios publicar y visualizar contenido de manera rápida y sencilla. Tambien cuenta con un modulo administrativo para que este tipo de usuarios pueda obtener informacion relevante de la aplicacion, como cantidad de usuarios,mensajes su actividad e informacion de la cuenta.

## Indice
1. Caracteristicas tecnicas del proyecto.
2. Instrucciones de instalacion.
3. Documentacion del proyecto segun la rubrica de evaluacion.

### Caracteristicas tecnicas del proyecto

- El proyecto fue realizado con IDE Eclipse Enterprise.
- Se utilizo el server Apache Tomcat 9.
- Para tener mejoras en el estilo visual y funcionalidad se utilizo la biblicoteca y script de Boostrap y estilos personalizados Css, asi como tambien Jquery y JavaScript.
- Se integro la api de Google Maps para uso de localizacion de direcciones.
- Se añadió un feed de twitter, este contiene informacion acorde a el tema de la aplicacion.
- La base de datos (proyectobdTEST) se encuentra dentro del proyecto y se construyo en MySQL, dentro de esta se encuentra el script que construye las tablas y se insertan datos de prueba para su visualizacion, asi como tambien distintas queries que sirven para observar el correcto funcionamiento y relacion entre las tablas.

### Instrucciones de instalacion

- Iniciar el script de MySQL de la base de datos que esta dentro del proyecto llamado proyectobdTEST.sql y seleccionar el esquema si es que no se ha seleccionado automaticamente.
- En el IDE iniciar el proyecto y el servidor Tomcat 9.
- La aplicacion inicia con la vista de Login.
- Para ingresa a la aplicacion se puede ingresar los usuarios que se encuentra en la base de datos, ej:
  
    - Usuario tipo cliente:
  
        - Nombre de usuario: Usuario 1.
        - Contraseña: qwerty
  
    - Usuario tipo Administrativo:

        - Nombre de usuario: Admin1
        - Contraseña: 123456
  
- Para navegar dentro de la aplicacion se puede utilizar el navbar presente.
- Puede cambiar la cuenta de usuario con la opcion salir en presente en el menu desplegable del navbar y volver ingresar con otro login.
 
A continuacion se demuestra la evidencia de acuerdo a la rubrica de evaluacion del proyecto:

### Documentacion del proyecto segun la rubrica de evaluacion.

#### Consulta a la base de datos

1. Selecciona las columnas requeridas para presentar la información solicitada. 

![rb1](https://github.com/AndresSCP/Proyecto/assets/121947963/43ee6459-b990-49e5-a644-b5e48d8d62df)

[Ejemplo, Ver ubicacion del codigo 1](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/AdministrativoController.java#LL55C2-L55C2)

2. Utiliza JOIN para relacionar la información de distintas tablas.

![rb2](https://github.com/AndresSCP/Proyecto/assets/121947963/1d00ca04-4166-4d5a-85b9-7e7ead7f5a20)

[Ejemplo, Ver ubicacion del codigo 2](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/AdministrativoController.java#LL64C1-L67C42)

3. Utiliza WHERE para filtrar la información requerida.

![rb3](https://github.com/AndresSCP/Proyecto/assets/121947963/a02122c7-3f8d-4581-ae3f-565511ff3ac7)

[Ejemplo, Ver ubicacion del codigo 3](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/AdministrativoController.java#LL69C1-L69C1)

4. Utiliza cláusulas de ordenamiento para presentar la información.

![rb4](https://github.com/AndresSCP/Proyecto/assets/121947963/5c72b27d-14b3-4665-b182-6492a126d026)

[Ejemplo, Ver ubicacion del codigo 4](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/AdministrativoController.java#LL64C126-L64C126)

5. Utiliza cláusulas de agrupación de información para obtener datos agregados.

![rb5](https://github.com/AndresSCP/Proyecto/assets/121947963/8c19d3ab-480f-48d4-9f48-21342b54bb24)

[Ejemplo, Ver ubicacion del codigo 5](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/AdministrativoController.java#LL51C8-L51C8)

#### Algoritmo de cálculo y unidades de prueba

6. Utilización general del lenguaje, sintaxis, selección de tipos de datos, sentencias lógicas, expresiones, operaciones, comparaciones.

![rb6](https://github.com/AndresSCP/Proyecto/assets/121947963/4c841b58-ad01-4857-a7ac-9f5eb76b86a7)

[Ejemplo, Ver ubicacion del codigo 6](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller/LoginController.java#L32)

7. Utilización de sentencias repetitivas.

[Ejemplo, Ver ubicacion del codigo 7](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/administrativo.jsp#L60)

8. Utilización de clases, encapsulamiento y resposabilidad única. 

[Ejemplo, Ver ubicacion del codigo 8, clase cliente](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/Cliente.java#L6)

9. Se utilizan correctamente interfaces o relaciones de herencia para hacer polimorfismo donde fuese necesario. 

[Interfaz](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/ClienteDAO.java#L1)

[Implementacion interfaz](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

10. Convenciones y estilos de programación.

Se utilizaron varias convenciones en programacion para la creacion del codigo, camel case, nombres apropiados para las clases, atributos, orden, etc.

11. Utilización de unidades de prueba.

[Prueba JUnit conexion](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/test/ConexionBDTest.java#LL1C1-L1C1)

- Página web html y css

12. Utilización de tags html, estilos y responsividad.

[Ejemplo de utilizacion de tags, estilos y responsividad en vista de login](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/login.jsp#L1)

[Carpeta con archivos para la personalizacion de las vistas, css, js, e imagenes](https://github.com/AndresSCP/Proyecto/tree/main/src/main/webapp/resources)

13. Utilización de Bootstrap.

[Ejemplo de utilizacion Boostrap en login](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/login.jsp#L1)

- Spring MVC

14. Utilización de Controllers.

[Referirse al package de Models donde se encuentran todos los Controllers](https://github.com/AndresSCP/Proyecto/tree/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller)

15. Utilización de vistas JSP y Taglib.

[Implementacion taglib Jstl](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/main.jsp#L3)

[Ejemplo Uso Taglib](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/main.jsp#LL95C10-L95C10)

16. Creación Servicio Spring.

Se creo el proyecto utilizando un archetype de maven con spring-mvc en Eclipse, se descargaron las dependencias utilizando el pom.xml luego de la creacion para obtener el formato necesario para su funcionamiento.

[POM](https://github.com/AndresSCP/Proyecto/blob/main/pom.xml)

17. Creación DAO acceso a datos.

[Ejemplo Interfaz DAO](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

[Ejemplo Implementacion DAO](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

18. Creación del proyecto y configuración.

[Configuracion y formato se puede ver en la raiz del proyecto](https://github.com/AndresSCP/Proyecto)

19. Funcionamiento general del aplicativo.

El proyecto esta configurado con maven y spring mvc, y utiliza tomcat 9 como server.
[Referirse al proyecto personal y clonarlo para luego  probar la funcionaliad del mismo](https://github.com/AndresSCP/Proyecto)
















