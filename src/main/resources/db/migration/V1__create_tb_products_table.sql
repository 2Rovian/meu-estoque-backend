CREATE TABLE tb_products(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255),
    quantity INTEGER NOT NULL,
    price NUMERIC(10, 2) NOT NULL
);