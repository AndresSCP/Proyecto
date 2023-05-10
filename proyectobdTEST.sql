/*CREAR DATABASE proyectobdTEST;*/
DROP DATABASE IF EXISTS proyectobdTEST;
CREATE DATABASE proyectobdTEST;

/*USAR TABLA proyectobdTEST*/
USE proyectobdTEST;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
  idUsuario INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) UNIQUE,
  password VARCHAR(50),
  enabled TINYINT NOT NULL DEFAULT 1,
  role VARCHAR(50) NOT NULL CHECK (role IN ('cliente', 'administrativo'))
);

-- Creación de la tabla Cliente que extiende de Usuarios
CREATE TABLE Cliente (
  idUsuario INT PRIMARY KEY,
  nombreCliente VARCHAR(50),
  apellidoCliente VARCHAR(50),
  genero VARCHAR(10),
  emailCliente VARCHAR(50) UNIQUE,
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

-- Creación de la tabla Administrativo que extiende de Usuarios
CREATE TABLE Administrativo (
  idUsuario INT PRIMARY KEY,
  nombreAdmin VARCHAR(50) UNIQUE,
  emailAdmin VARCHAR(50) UNIQUE,
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

-- Creación de la tabla Mensaje
CREATE TABLE Mensaje (
  idMensaje INT PRIMARY KEY AUTO_INCREMENT,
  lugar VARCHAR(150),
  mensaje TEXT,
  referencia VARCHAR(50),
  fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  idUsuario INT,
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (username, password, role)
VALUES ('Admin1', '123456', 'administrativo'),
       ('Admin2', 'abcdef', 'administrativo'),
       ('Usuario1', 'qwerty', 'cliente'),
       ('Usuario2', 'uiopjk', 'cliente'),
       ('Usuario3', 'qwertyuiop', 'cliente'),
		('Usuario4', 'asdfghjkl', 'cliente'),
		('Usuario5', 'zxcvbnm', 'cliente'),
		('Usuario6', '123qwe', 'cliente'),
		('Usuario7', '456rty', 'cliente'),
		('Usuario8', '789uio', 'cliente');
		
-- Insertar datos en la tabla Cliente
INSERT INTO Cliente (idUsuario, nombreCliente, apellidoCliente, genero, emailCliente)
VALUES  (3, 'Jose', 'Fernandez', 'Masculino', 'jose.fernandez@yahoo.com'),
		(4, 'Gabriela', 'Ruiz', 'Femenino', 'gabriela.ruiz@google.com'),
		(5, 'Andres', 'Gutierrez', 'Masculino', 'andres.gutierrez@google.com'),
		(6, 'Laura', 'Gomez', 'Femenino', 'laura.gomez@google.com'),
		(7, 'Juan', 'Perez', 'Masculino', 'juan.perez2@google.com'),
		(8, 'Marcela', 'Lopez', 'Femenino', 'marcela.lopez@yahoo.com'),
        (9,'Andres', 'Contreras', 'Masculino', 'andres.contreras@gmail.com'),
        (10,'Pedro', 'Fuentes', 'Otro','pedro.f@hotmail.com');

-- Insertar datos en la tabla Administrativo
INSERT INTO Administrativo (idUsuario, nombreAdmin, emailAdmin)
VALUES (1, 'Ana', 'ana@example.com'),
       (2, 'Pedro', 'pedro@example.com');

-- Insertar datos en la tabla Mensaje
INSERT INTO Mensaje (lugar, mensaje, referencia, idUsuario)
VALUES ('Viña del Mar', 'Accidente de transito', 'Mall Marina', 3),
       ('Quillota', 'Incendio', 'Camino San Isidro', 5),
       ('Valparaiso', 'Necesito ayuda', 'Mensaje anterior', 5),
       ('Concepcion', 'Fuga de gas', 'Calle Los Pinos', 3),
		('Santiago', 'Robo a mano armada', 'Estacion Central', 4),
		('Viña del Mar', 'Necesito ayuda', 'Mensaje anterior', 7),
		('Valparaiso', 'Inundacion', 'Calle Quillota', 6),
		('Rancagua', 'Terremoto', 'Zona Norte', 3),
		('Los Angeles', 'Incendio forestal', 'Calle Principal', 4);

-- Mostrar los registros de cada tabla
SELECT * FROM Usuarios;
SELECT * FROM Cliente;
SELECT * FROM Administrativo;
SELECT * FROM Mensaje;

/*Mostrar los mensajes con la información del usuario que los envió*/
SELECT c.idUsuario, c.nombreCliente, m.lugar, m.mensaje, m.referencia
FROM Cliente c
INNER JOIN Mensaje m ON c.idUsuario = m.idUsuario;

SELECT m.idMensaje,u.username, m.lugar, m.mensaje, m.referencia, m.fechaCreacion 
FROM Mensaje m
INNER JOIN Usuarios u ON m.idUsuario = u.idUsuario;

SELECT c.idUsuario, c.nombreCliente, m.lugar, m.mensaje, m.referencia
FROM Cliente c
INNER JOIN Mensaje m ON c.idUsuario = m.idUsuario;

SELECT c.nombreCliente, c.apellidoCliente, c.genero, c.emailCliente, u.username, u.idUsuario
FROM Cliente c
INNER JOIN Usuarios u ON c.idUsuario = u.idUsuario;

SELECT a.nombreAdmin, a.emailAdmin, u.username, a.idUsuario
FROM Administrativo a
INNER JOIN Usuarios u ON a.idUsuario = u.idUsuario;

SELECT m.idMensaje, m.lugar, m.mensaje, m.referencia, m.fechaCreacion, u.username, u.idUsuario, 
CASE
   WHEN u.role = 'cliente' THEN 'Cliente'
   WHEN u.role = 'administrativo' THEN 'Administrativo'
   ELSE 'Desconocido'
END AS TipoUsuario
FROM Mensaje m
INNER JOIN Usuarios u ON m.idUsuario = u.idUsuario
ORDER BY TipoUsuario, m.fechaCreacion DESC;

SELECT *
FROM Usuarios U
JOIN Cliente C ON U.idUsuario = C.idUsuario;

SELECT Usuarios.*, Cliente.nombreCliente, Cliente.apellidoCliente, Cliente.genero, Cliente.emailCliente, Administrativo.nombreAdmin, Administrativo.emailAdmin
FROM Usuarios
LEFT JOIN Cliente ON Usuarios.idUsuario = Cliente.idUsuario
LEFT JOIN Administrativo ON Usuarios.idUsuario = Administrativo.idUsuario;

SELECT COUNT(*) AS total_mensajes FROM Mensaje