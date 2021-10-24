CREATE TABLE product (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  name VARCHAR(100),
  description VARCHAR(255),
  price DECIMAL(16, 2),
  CONSTRAINT pk_product PRIMARY KEY (id)
);