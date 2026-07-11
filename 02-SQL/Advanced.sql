
CREATE TABLE Employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL
   
    
);
ALTER TABLE Employee
ADD  department VARCHAR(80);
INSERT INTO Employee(name,salary) VALUES
('John Doe', 80000),
('Jane Smith', 90000),
('Alice Johnson', 750000),
('Bob Brown', 790000);


UPDATE employee 
SET department = 'HR' 
WHERE id = 1;


UPDATE employee 
SET department = 'IT' 
WHERE id = 2;

UPDATE employee 
SET department = 'IT' 
WHERE id = 3;

UPDATE employee 
SET department = 'SALES' 
WHERE id = 4;
-- Second Highest Salary

SELECT MAX(salary)
FROM Employee
WHERE salary<
(
SELECT MAX(salary)
FROM Employee
);

-- View

CREATE VIEW ITEmployees AS
SELECT *
FROM Employee
WHERE department='IT';

-- Transaction

START TRANSACTION;

UPDATE Account
SET balance=balance-500
WHERE id=1;

UPDATE Account
SET balance=balance+500
WHERE id=2;

COMMIT;

-- Rollback Example

ROLLBACK;