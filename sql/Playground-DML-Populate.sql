-- Insert sample data into "Employees" table
INSERT INTO Employees (FirstName, LastName, Email, HireDate, Salary, CommissionRate)
VALUES ('John', 'Doe', 'john.doe@example.com', '2023-01-01', 50000.00, 0.05),
       ('Jane', 'Smith', 'jane.smith@example.com', '2023-02-01', 60000.00, 0.08),
       ('Michael', 'Johnson', 'michael.johnson@example.com', '2023-03-01', 55000.00, 0.06),
       ('Emily', 'Davis', 'emily.davis@example.com', '2023-04-01', 52000.00, 0.04),
       ('David', 'Wilson', 'david.wilson@example.com', '2023-05-01', 58000.00, 0.07);

-- Insert sample data into "Products" table
INSERT INTO Products (ProductName, UnitPrice, UnitsInStock)
VALUES ('Product A', 10.00, 100),
       ('Product B', 20.00, 50),
       ('Product C', 15.00, 75),
       ('Product D', 25.00, 120),
       ('Product E', 30.00, 80);

-- Insert sample data into "Sales" table
INSERT INTO Sales (EmployeeID, ProductID, SaleDate, Quantity, Price)
VALUES (1, 1, '2023-01-05', 2, 20.00),
       (1, 2, '2021-01-10', 3, 40.00),
       (2, 1, '2022-02-05', 4, 40.00),
       (2, 3, '2023-02-10', 2, 30.00),
       (3, 2, '2022-03-05', 1, 20.00),
       (3, 4, '2020-03-10', 3, 75.00);


-- Football Tournament
INSERT INTO Players (name)
VALUES ('Lionel Messi'),
       ('Cristiano Ronaldo'),
       ('Neymar Jr.'),
       ('Kylian Mbappé'),
       ('Robert Lewandowski'),
       ('Mohamed Salah'),
       ('Harry Kane'),
       ('Kevin De Bruyne'),
       ('Sergio Ramos'),
       ('Luka Modric');

INSERT INTO Countries (name)
VALUES ('Argentina'),
       ('Portugal'),
       ('Brazil'),
       ('France'),
       ('Poland'),
       ('Egypt'),
       ('England'),
       ('Belgium'),
       ('Spain'),
       ('Croatia');

INSERT INTO Goals (player_id, country_id, goals)
VALUES (1, 1, 79),
       (2, 2, 109),
       (3, 3, 68),
       (4, 4, 40),
       (5, 5, 55),
       (6, 6, 80),
       (7, 7, 40),
       (8, 8, 30),
       (9, 9, 100),
       (10, 10, 20);