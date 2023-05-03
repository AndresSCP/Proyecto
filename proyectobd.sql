/*CREAR DATABASE proyectobd;*/
DROP DATABASE IF EXISTS proyectobd;
CREATE DATABASE proyectobd;

/*USAR TABLA proyectobd*/
USE proyectobd;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
  idUsuario INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  password VARCHAR(50),
  rol VARCHAR(50) NOT NULL
);
-- Creación de la tabla Cliente que extiende de Usuarios
CREATE TABLE Cliente (
  idUsuario INT PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50),
  rol VARCHAR(50) null,
  nombreCliente VARCHAR(50),
  apellidoCliente VARCHAR(50),
  genero VARCHAR(10),
  emailCliente VARCHAR(50),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

CREATE TABLE Administrativo (
  idUsuario INT PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50),
  rol VARCHAR(50) NULL,
  nombreAdmin VARCHAR(50),
  emailAdmin VARCHAR(50),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

-- Creación de la tabla Mensaje
CREATE TABLE Mensaje (
  idMensaje INT PRIMARY KEY AUTO_INCREMENT,
  lugar VARCHAR(50),
  mensaje TEXT,
  referencia VARCHAR(50),
  fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  idUsuario INT,
  FOREIGN KEY (idUsuario) REFERENCES Cliente(idUsuario)
);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (username, password, rol)
VALUES ('Usuario1', '123456', "Cliente"),
       ('Usuario2', 'abcdef', "Cliente"),
       ('Admin1', 'qwerty', "Admin"),
       ('Admin2', 'uiopjk', "Admin");

-- Insertar datos en la tabla Cliente
INSERT INTO Cliente (idUsuario, username, password, rol, nombreCliente, apellidoCliente, genero, emailCliente)
VALUES (1, 'Usuario1', '123456', "Cliente", 'Juan', 'Pérez', 'Masculino', 'juan.perez@example.com'),
       (2, 'Usuario2', 'abcdef', "Cliente", 'María', 'González', 'Femenino', 'maria.gonzalez@example.com');

-- Insertar datos en la tabla Administrativo
INSERT INTO Administrativo (idUsuario, username, password, rol, nombreAdmin, emailAdmin)
VALUES (3, 'Admin1', 'qwerty', "Admin", 'Ana', 'ana@example.com'),
       (4, 'Admin2', 'uiopjk', "Admin", 'Pedro', 'pedro@example.com');

-- Insertar datos en la tabla Mensaje
INSERT INTO Mensaje (lugar, mensaje, referencia, idUsuario)
VALUES ('Viña del Mar', 'Accidente de transito', "Mall Marina", 1),
       ('Quillota', 'Incendio', "Camino San Isidro", 2),
       ('Valparaiso', 'Necesito ayuda', 'Mensaje anterior', 1);
       
select * from Usuarios;

select * from Cliente;

select * from Administrativo;

select * from mensaje;

SELECT c.idUsuario, c.nombreCliente, m.lugar, m.mensaje, m.referencia
FROM Cliente c
INNER JOIN Mensaje m ON c.idUsuario = m.idUsuario;