DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

CREATE TABLE fabricantes (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(115)
);

INSERT INTO fabricantes (nombre) VALUES ('Samsung');
INSERT INTO fabricantes (nombre) VALUES ('Apple');
INSERT INTO fabricantes (nombre) VALUES ('Aliexpress');

CREATE TABLE articulos (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(115),
precio INT,
id_fabricante INT ,
FOREIGN KEY (id_fabricante) REFERENCES fabricantes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO articulos (nombre, precio, id_fabricante) VALUES ('Samsung S23', 525, 1);
INSERT INTO articulos (nombre, precio, id_fabricante) VALUES ('MacOs', 600, 2);
INSERT INTO articulos (nombre, precio, id_fabricante) VALUES ('Reloj Inteligente Z3', 163, 3);
INSERT INTO articulos (nombre, precio, id_fabricante) VALUES ('SmartTV', 320, 1);
INSERT INTO articulos (nombre, precio, id_fabricante) VALUES ('iPhone11', 1050, 2);