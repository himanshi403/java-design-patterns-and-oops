Topics:

CREATE DATABASE
CREATE TABLE
INSERT
UPDATE
DELETE
DROP
TRUNCATE
PRIMARY KEY
FOREIGN KEY
UNIQUE
NOT NULL
AUTO_INCREMENT

--Create a database
CREATE DATABASE CollegeDB;

USE CollegeDB;

--Create a table
CREATE TABLE Students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    cgpa DECIMAL(3, 2) ,
    city VARCHAR(30),
);

--Insert data
INSERT INTO Students(name,cgpa,city) VALUES
('John Doe', 8.5, 'New York'),
('Jane Smith', 9.8, 'Los Angeles'),
('Alice Johnson', 7.2, 'Chicago'),
('Bob Brown', 7.9, 'Houston');

--Update
UPDATE Students
Set cgpa=9.0
WHERE name='Alice Johnson';

--Delete
DELETE FROM Students
WHERE id=4;