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

![rb7](https://github.com/AndresSCP/Proyecto/assets/121947963/c8f93c33-0182-425d-9ede-b17218994781)
[Ejemplo, Ver ubicacion del codigo 7](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/administrativo.jsp#L60)

8. Utilización de clases, encapsulamiento y resposabilidad única. 

![rb8-1](https://github.com/AndresSCP/Proyecto/assets/121947963/7d82dfb4-b721-4936-9353-b466b6f640c5)
![rb8-2](https://github.com/AndresSCP/Proyecto/assets/121947963/d24e718e-b45a-496b-854b-7d4dc35084a4)
![rb8-9](https://github.com/AndresSCP/Proyecto/assets/121947963/4fcbe996-96f7-47e7-a0b3-d0dd6486e889)

[Ejemplo, Ver ubicacion del codigo 8, clase cliente](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/Cliente.java#L6)

9. Se utilizan correctamente interfaces o relaciones de herencia para hacer polimorfismo donde fuese necesario. 

![rb9-1](https://github.com/AndresSCP/Proyecto/assets/121947963/8c849239-5e84-426b-8b3d-56899ed64022)
![rb9-3](https://github.com/AndresSCP/Proyecto/assets/121947963/77f42b92-f8e7-456c-bcc5-53500485b4a8)

[Interfaz](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/ClienteDAO.java#L1)

[Implementacion interfaz](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

10. Convenciones y estilos de programación.

![rb10-1](https://github.com/AndresSCP/Proyecto/assets/121947963/318477dd-44c0-4f5e-ada8-252b21d72270)
![rb10-2](https://github.com/AndresSCP/Proyecto/assets/121947963/c8e78ffc-a635-48ba-8086-985b672b0428)

Se utilizaron varias convenciones en programacion para la creacion del codigo, camel case, nombres apropiados para las clases, atributos, orden, etc.

11. Utilización de unidades de prueba.

[Prueba JUnit conexion](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/test/ConexionBDTest.java#LL1C1-L1C1)

#### Página web html y css

12. Utilización de tags html, estilos y responsividad.

![rb11-1](https://github.com/AndresSCP/Proyecto/assets/121947963/db05ecc2-c21c-48a2-8e3a-ce31f86fa821)

[Ejemplo de utilizacion de tags, estilos y responsividad en vista de login](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/login.jsp#L1)

[Carpeta con archivos para la personalizacion de las vistas, css, js, e imagenes](https://github.com/AndresSCP/Proyecto/tree/main/src/main/webapp/resources)

13. Utilización de Bootstrap.

![rb13-1](https://github.com/AndresSCP/Proyecto/assets/121947963/6d83b546-8bd7-4531-976c-6ce6bcc9ea7b)
![rb13-2](https://github.com/AndresSCP/Proyecto/assets/121947963/7727b4c8-c274-4944-b2a9-1a3e9da4015f)

[Ejemplo de utilizacion Boostrap en login](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/login.jsp#L1)

#### Spring MVC

14. Utilización de Controllers.

![rb14-1](https://github.com/AndresSCP/Proyecto/assets/121947963/2253da19-99fa-4d98-86bf-75463f4a5ef3)
![rb14-2](https://github.com/AndresSCP/Proyecto/assets/121947963/f2365fd2-3d3e-4bcc-8a60-2ba159f9b4bc)
![rb14-3](https://github.com/AndresSCP/Proyecto/assets/121947963/d762f984-1936-44f4-a1a4-7b614d1d801b)

[Referirse al package de Models donde se encuentran todos los Controllers](https://github.com/AndresSCP/Proyecto/tree/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/controller)

15. Utilización de vistas JSP y Taglib.

![rb15-1](https://github.com/AndresSCP/Proyecto/assets/121947963/80b01322-ce32-4baf-975a-a1bdeba0656a)
![rb15-2](https://github.com/AndresSCP/Proyecto/assets/121947963/4c82dae8-db20-41ac-8d95-22206a62d047)

[Implementacion taglib Jstl](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/main.jsp#L3)

[Ejemplo Uso Taglib](https://github.com/AndresSCP/Proyecto/blob/main/src/main/webapp/WEB-INF/views/main.jsp#LL95C10-L95C10)

16. Creación Servicio Spring.

Se creo el proyecto utilizando un archetype de maven con spring-mvc en Eclipse, se descargaron las dependencias utilizando el pom.xml luego de la creacion para obtener el formato necesario para su funcionamiento.

![rb16-1](https://github.com/AndresSCP/Proyecto/assets/121947963/3bcd383d-e9d7-40bb-83c8-c665a0cb86c3)

[POM](https://github.com/AndresSCP/Proyecto/blob/main/pom.xml)

17. Creación DAO acceso a datos.

![rb17-1](https://github.com/AndresSCP/Proyecto/assets/121947963/d148b5a9-eaac-4e0b-b225-47f329d58632)

[Ejemplo Interfaz DAO](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

[Ejemplo Implementacion DAO](https://github.com/AndresSCP/Proyecto/blob/main/src/main/java/cl/bootcamp/maven/proyectoPersonal/models/dao/impl/ClienteDAOImpl.java#L1)

18. Creación del proyecto y configuración.

[Configuracion y formato se puede ver en la raiz del proyecto](https://github.com/AndresSCP/Proyecto)

19. Funcionamiento general del aplicativo.

El proyecto esta configurado con maven y spring mvc, y utiliza tomcat 9 como server.

[Referirse al proyecto personal y clonarlo para luego  probar la funcionaliad del mismo](https://github.com/AndresSCP/Proyecto)
















