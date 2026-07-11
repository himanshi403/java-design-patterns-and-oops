CREATE TABLE MARKS(
    id INT PRIMARY KEY,
    marks int,
    FOREIGN KEY (id) REFERENCES Students(id)
);

INSERT INTO Students(name,cgpa,city) VALUES
('John Doe', 8.5, 'New York'),
('Jane Smith', 9.8, 'Los Angeles'),
('Alice Johnson', 7.2, 'Chicago'),
('Bob Brown', 7.9, 'Houston');

INSERT INTO MARKS VALUES
(1, 85),
(2, 98),
(3, 72),
(4, 79);

--Inner Join
SELECT s.name, s.id, m.marks
FROM Students s
INNER JOIN MARKS m
ON s.id = m.id;

--Left Join
SELECT s.name, s.id, m.marks
FROM Students s
LEFT JOIN MARKS m
ON s.id = m.id; 