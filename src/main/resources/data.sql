-- Insertar Autores
INSERT INTO autor (nombre, nacionalidad, biografia) 
VALUES ('Miguel de Cervantes', 'Española', 'Famoso escritor español, autor del Quijote.');
INSERT INTO autor (nombre, nacionalidad, biografia) 
VALUES ('Gabriel García Márquez', 'Colombiana', 'Escritor y periodista, Nobel de Literatura.');

-- Insertar Libros (asumiendo IDs 1 y 2 para los autores anteriores)
-- Columnas: titulo, isbn, anopublicacion, estado, autor_id, numero_paginas, peso, dimensiones, veces_prestado, ultima_fecha
INSERT INTO libro (titulo, isbn, anopublicacion, estado, autor_id, numero_paginas, peso, dimensiones, veces_prestado, ultima_fecha) 
VALUES ('Don Quijote de la Mancha', '978-1234567890', 1605, 'DISPONIBLE', 1, 1000, 1200, 25, 0, NULL);

INSERT INTO libro (titulo, isbn, anopublicacion, estado, autor_id, numero_paginas, peso, dimensiones, veces_prestado, ultima_fecha) 
VALUES ('Cien años de soledad', '978-0987654321', 1967, 'PRESTADO', 2, 450, 600, 20, 5, '2026-02-01 10:00:00');