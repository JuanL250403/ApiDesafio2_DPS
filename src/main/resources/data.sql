-- =========================
-- INSERTS PARA producto
-- =========================
INSERT INTO producto (id, nombre, descripcion, precio, stock) VALUES
                                                                  (1, 'Laptop Lenovo', 'Laptop Core i5 8GB RAM', 750.00, 10),
                                                                  (2, 'Mouse Logitech', 'Mouse inalámbrico', 25.50, 50),
                                                                  (3, 'Teclado Redragon', 'Teclado mecánico RGB', 60.00, 30),
                                                                  (4, 'Monitor Samsung', 'Monitor 24 pulgadas Full HD', 180.00, 20),
                                                                  (5, 'Audífonos Sony', 'Audífonos con cancelación de ruido', 120.00, 15);

-- =========================
-- INSERTS PARA users
-- =========================
INSERT INTO users (id, username, email, password, firstname, lastname, age) VALUES
                                                                                (1, 'juan123', 'juan@gmail.com', '123456', 'Juan', 'Pérez', 25),
                                                                                (2, 'maria456', 'maria@gmail.com', '123456', 'María', 'López', 30),
                                                                                (3, 'carlos789', 'carlos@gmail.com', '123456', 'Carlos', 'Gómez', 28),
                                                                                (4, 'ana321', 'ana@gmail.com', '123456', 'Ana', 'Martínez', 22),
                                                                                (5, 'luis654', 'luis@gmail.com', '123456', 'Luis', 'Hernández', 35);
