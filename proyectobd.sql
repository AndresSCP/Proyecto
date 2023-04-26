/*CREAR DATABASE proyectobd;*/
DROP DATABASE IF EXISTS proyectobd;
CREATE DATABASE proyectobd;

/*USAR TABLA proyectobd*/
USE proyectobd;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
  idUsuario INT PRIMARY KEY,
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

