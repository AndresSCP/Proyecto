/*CREAR DATABASE proyectobdTEST;*/
DROP DATABASE IF EXISTS proyectobdTEST;
CREATE DATABASE proyectobdTEST;

/*USAR TABLA proyectobdTEST*/
USE proyectobdTEST;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
  idUsuario INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  password VARCHAR(50),
  enabled TINYINT NOT NULL DEFAULT 1,
  role VARCHAR(50) NOT NULL CHECK (role IN ('cliente', 'administrativo'))
);ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Creación de la tabla Cliente que extiende de Usuarios
CREATE TABLE Cliente (
  idUsuario INT PRIMARY KEY,
  nombreCliente VARCHAR(50),
  apellidoCliente VARCHAR(50),
  genero VARCHAR(10),
  emailCliente VARCHAR(50),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Creación de la tabla Administrativo que extiende de Usuarios
CREATE TABLE Administrativo (
  idUsuario INT PRIMARY KEY,
  nombreAdmin VARCHAR(50),
  emailAdmin VARCHAR(50),
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Creación de la tabla Mensaje
CREATE TABLE Mensaje (
  idMensaje INT PRIMARY KEY AUTO_INCREMENT,
  lugar VARCHAR(50),
  mensaje TEXT,
  referencia VARCHAR(50),
  fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  idUsuario INT,
  FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (username, password, role)
VALUES ('Usuario1', '123456', 'cliente'),
       ('Usuario2', 'abcdef', 'cliente'),
       ('Admin1', 'qwerty', 'administrativo'),
       ('Admin2', 'uiopjk', 'administrativo');

-- Insertar datos en la tabla Cliente
INSERT INTO Cliente (idUsuario, nombreCliente, apellidoCliente, genero, emailCliente)
VALUES (1, 'Juan', 'Pérez', 'Masculino', 'juan.perez@example.com'),
       (2, 'María', 'González', 'Femenino', 'maria.gonzalez@example.com');

-- Insertar datos en la tabla Administrativo
INSERT INTO Administrativo (idUsuario, nombreAdmin, emailAdmin)
VALUES (3, 'Ana', 'ana@example.com'),
       (4, 'Pedro', 'pedro@example.com');

-- Insertar datos en la tabla Mensaje
INSERT INTO Mensaje (lugar, mensaje, referencia, idUsuario)
VALUES ('Viña del Mar', 'Accidente de transito', 'Mall Marina', 1),
       ('Quillota', 'Incendio', 'Camino San Isidro', 2),
       ('Valparaiso', 'Necesito ayuda', 'Mensaje anterior', 1);

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

SELECT Usuarios.*, Cliente.nombreCliente, Cliente.apellidoCliente, Cliente.genero, Cliente.emailCliente, Administrativo.nombreAdmin, Administrativo.emailAdmin
FROM Usuarios
LEFT JOIN Cliente ON Usuarios.idUsuario = Cliente.idUsuario
LEFT JOIN Administrativo ON Usuarios.idUsuario = Administrativo.idUsuario;