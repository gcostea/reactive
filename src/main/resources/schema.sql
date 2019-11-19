CREATE TABLE COUNTRIES(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR,
    population INT NOT NULL DEFAULT 0
);

INSERT INTO COUNTRIES(name, population) VALUES ('Romania', 19530000);
INSERT INTO COUNTRIES(name, population) VALUES ('United States of America', 327200000);
INSERT INTO COUNTRIES(name, population) VALUES ('Botswana', 2292000);