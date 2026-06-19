CREATE TABLE PERSONS (
    name VARCHAR(50),
    surname VARCHAR(50),
    age INT,
    phone_number VARCHAR(20),
    city_of_living VARCHAR(100),
    PRIMARY KEY (name, surname, age)
);

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living) VALUES
('Ivan', 'Ivanov', 25, '11111', 'Moscow'),
('Petr', 'Petrov', 18, '22222', 'Spb'),
('Alex', 'Alexeev', 30, '33333', 'Moscow');
