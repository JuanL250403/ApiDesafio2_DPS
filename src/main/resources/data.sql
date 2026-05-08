-- =========================
-- INSERTS PARA producto
-- =========================
INSERT INTO producto (id, nombre, descripcion, precio, stock)
VALUES (1, 'Laptop Lenovo', 'Laptop Core i5 8GB RAM', 750.00, 10),
       (2, 'Mouse Logitech', 'Mouse inalámbrico', 25.50, 50),
       (3, 'Teclado Redragon', 'Teclado mecánico RGB', 60.00, 30),
       (4, 'Monitor Samsung', 'Monitor 24 pulgadas Full HD', 180.00, 20),
       (5, 'Audífonos Sony', 'Audífonos con cancelación de ruido', 120.00, 15),
       (6, 'Impresora HP', 'Impresora multifuncional WiFi', 145.99, 12),
       (7, 'Disco SSD Kingston', 'SSD 1TB SATA', 89.50, 25),
       (8, 'Memoria USB Sandisk', 'USB 64GB 3.0', 12.99, 80),
       (9, 'Tablet Samsung', 'Tablet Android 10 pulgadas', 220.00, 18),
       (10, 'Webcam Logitech', 'Webcam Full HD 1080p', 55.75, 22),
       (11, 'Silla Gamer', 'Silla ergonómica reclinable', 199.99, 8),
       (12, 'Router TP-Link', 'Router inalámbrico dual band', 65.00, 16),
       (13, 'Smartphone Xiaomi', 'Smartphone 128GB 6GB RAM', 310.00, 14),
       (14, 'Cable HDMI', 'Cable HDMI 2 metros', 8.50, 100),
       (15, 'Power Bank Xiaomi', 'Batería portátil 20000mAh', 35.99, 28),
       (16, 'Parlante JBL', 'Parlante Bluetooth portátil', 75.00, 19),
       (17, 'Cámara Canon', 'Cámara digital profesional', 850.00, 5),
       (18, 'Smartwatch Huawei', 'Reloj inteligente deportivo', 95.00, 24),
       (19, 'Micrófono HyperX', 'Micrófono USB para streaming', 110.00, 11),
       (20, 'Base Refrigerante', 'Base para laptop con ventiladores RGB', 27.90, 35);
-- =========================
-- INSERTS PARA users
-- =========================
INSERT INTO users (id, username, email, password, firstname, lastname, age)
VALUES (1, 'juan', 'juan@gmail.com', '$2a$12$zazYsKEcufv72LXbMEWdkOYS6Nnu4qoOX9V6CRE8deITWUQVbaYj2', 'Juan', 'Leiva',
        25),
       (2, 'vale', 'vale@gmail.com', '$2a$12$zazYsKEcufv72LXbMEWdkOYS6Nnu4qoOX9V6CRE8deITWUQVbaYj2', 'Vale', 'Montano',
        30);

