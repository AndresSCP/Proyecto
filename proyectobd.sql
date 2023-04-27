/*CREAR DATABASE proyectobd;*/
DROP DATABASE IF EXISTS proyectobd;
CREATE DATABASE proyectobd;

/*USAR TABLA proyectobd*/
USE proyectobd;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
  idUsuario INT PRIMARY KEY AUTO_INCREMENT,
  nombreUsuario VARCHAR(50),
  password VARCHAR(50),
  tipoUsuario INT
);
-- Creación de la tabla Cliente que extiende de Usuarios
CREATE TABLE Cliente (
  idUsuario INT PRIMARY KEY,
  nombreUsuario VARCHAR(50),
  password VARCHAR(50),
  tipoUsuario INT,
  nombreCliente VARCHAR(50),
  apellidoCliente VARCHAR(50),
  genero VARCHAR(10),
  emailCliente VARCHAR(50),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

CREATE TABLE Administrativo (
  idUsuario INT PRIMARY KEY,
  nombreUsuario VARCHAR(50),
  password VARCHAR(50),
  tipoUsuario INT,
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
  idUsuario INT,
  FOREIGN KEY (idUsuario) REFERENCES Cliente(idUsuario)
);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (nombreUsuario, password, tipoUsuario)
VALUES ('usuario1', '123456', 1),
       ('usuario2', 'abcdef', 1),
       ('usuario3', 'qwerty', 2),
       ('usuario4', 'uiopjk', 2);

-- Insertar datos en la tabla Cliente
INSERT INTO Cliente (idUsuario, nombreUsuario, password, tipoUsuario, nombreCliente, apellidoCliente, genero, emailCliente)
VALUES (1, 'usuario1', '123456', 1, 'Juan', 'Pérez', 'M', 'juan.perez@example.com'),
       (2, 'usuario2', 'abcdef', 1, 'María', 'González', 'F', 'maria.gonzalez@example.com');

-- Insertar datos en la tabla Administrativo
INSERT INTO Administrativo (idUsuario, nombreUsuario, password, tipoUsuario, nombreAdmin, emailAdmin)
VALUES (3, 'usuario3', 'qwerty', 2, 'Ana', 'ana@example.com'),
       (4, 'usuario4', 'uiopjk', 2, 'Pedro', 'pedro@example.com');

-- Insertar datos en la tabla Mensaje
INSERT INTO Mensaje (lugar, mensaje, referencia, idUsuario)
VALUES ('México', 'Hola, ¿cómo estás?', NULL, 1),
       ('Argentina', 'Buenos días', NULL, 2),
       ('Colombia', 'Necesito ayuda', 'Mensaje anterior', 1);

select * from Administrativo;

select * from Usuarios;

select * from Cliente;

select * from mensaje;