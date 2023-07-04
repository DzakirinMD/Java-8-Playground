/*
Create Tables
This script creates the tables needed for the playground schema.

*/

CREATE DATABASE playground;

-- Create "Employees" table
CREATE TABLE Employees
(
    EmployeeID     SERIAL PRIMARY KEY,
    FirstName      VARCHAR(50) NOT NULL,
    LastName       VARCHAR(50) NOT NULL,
    Email          VARCHAR(100) UNIQUE,
    HireDate       DATE,
    Salary         DECIMAL(10, 2),
    CommissionRate DECIMAL(4, 2)
);

-- Create "Products" table
CREATE TABLE Products
(
    ProductID    SERIAL PRIMARY KEY,
    ProductName  VARCHAR(100) NOT NULL,
    UnitPrice    DECIMAL(10, 2),
    UnitsInStock INT
);

-- Create "Sales" table
CREATE TABLE Sales
(
    SaleID     SERIAL PRIMARY KEY,
    EmployeeID INT NOT NULL,
    ProductID  INT NOT NULL,
    SaleDate   DATE,
    Quantity   INT,
    Price      DECIMAL(10, 2),
    FOREIGN KEY (EmployeeID) REFERENCES Employees (EmployeeID),
    FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);


-- Football Tournament
-- Create "Players" table
CREATE TABLE Players
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

-- Create "Countries" table
CREATE TABLE Countries
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

-- Create "Goals" table
CREATE TABLE Goals
(
    player_id  INT NOT NULL PRIMARY KEY,
    country_id INT NOT NULL,
    goals      INT,
    FOREIGN KEY (player_id) REFERENCES Players (id),
    FOREIGN KEY (country_id) REFERENCES Countries (id)
);



CREATE TABLE department
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE professor
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50),
    dept_id  INT NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES department (id)
);

CREATE TABLE course
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50),
    dept_id  INT NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES department (id)
);

CREATE TABLE schedule
(
    professor_id SERIAL PRIMARY KEY,
    course_id SERIAL,
    semester  INT NOT NULL,
    year  INT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES course (id),
    FOREIGN KEY (professor_id) REFERENCES professor (id)
);

SELECT DISTINCT pr.name AS professor_name, c.name AS course_name
FROM professor pr
JOIN course c ON pr.dept_id <> c.dept_id
JOIN schedule s ON pr.id = s.professor_id AND c.id = s.course_id
order by professor_name, course_name;
