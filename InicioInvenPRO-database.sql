-- Crear una base de datos principal
CREATE DATABASE InicioInvenPRO;

-- Usar la base de datos
USE InicioInvenPRO;

-- Crear tabla para Mesas
CREATE TABLE Mesas (
    ID_mesa INT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Estado VARCHAR(45) NOT NULL
);

-- Crear tabla para Productos
CREATE TABLE Productos (
    ID_producto INT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Precio DECIMAL(10,2) NOT NULL,
    Categoria VARCHAR(45) NOT NULL
);

-- Crear tabla para Cuentas
CREATE TABLE Cuentas (
    ID_cuenta INT PRIMARY KEY,
    ID_mesa INT,
    ID_producto INT,
    Cantidad INT,
    Total DECIMAL(10,2),
    MetodoPago VARCHAR(45),
    FOREIGN KEY (ID_mesa) REFERENCES Mesas(ID_mesa),
    FOREIGN KEY (ID_producto) REFERENCES Productos(ID_producto)
);

GRANT ALL PRIVILEGES ON InicioInvenPRO.* TO 'Yedy'@'localhost' IDENTIFIED BY 'tu_contraseña';
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'Yedy'@'localhost';
