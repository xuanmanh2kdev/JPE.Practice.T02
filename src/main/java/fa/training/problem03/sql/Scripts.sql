CREATE DATABASE InventorySystem;

USE InventorySystem;

CREATE TABLE Orders
(
    order_id      INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    customer_id   VARCHAR(5) NOT NULL,
    order_date    DATETIME NOT NULL,
    required_date DATETIME NOT NULL CHECK,
    shipped_date  DATETIME NOT NULL CHECK,
    ship_address  VARCHAR(100) NOT NULL,
    CONSTRAINT ck_required_date CHECK (required_date >= order_date),
    CONSTRAINT ck_shipped_date CHECK (shipped_date >= order_date )
);

CREATE TABLE OrderDetails
(
    order_id   INT NOT NULL FOREIGN KEY REFERENCES Orders (order_id)
    product_id INT PRIMARY KEY IDENTITY(1,1),
    unit_price DECIMAL(10, 2) NOT NULL,
    quantity   TINYINT NOT NULL,
    discount   FLOAT NOT NULL,
);
