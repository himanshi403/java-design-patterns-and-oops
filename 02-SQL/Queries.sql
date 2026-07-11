-- Display all students
SELECT * FROM Students;

SELECT *
FROM Students
WHERE cgpa > 8.0;

--Order by
SELECT *
FROM Students
ORDER BY cgpa DESC;

--top 2
SELECT *
FROM Students
ORDER BY cgpa DESC
LIMIT 2;

--avg cgpa
SELECT AVG(cgpa) AS average_cgpa
FROM Students;

--count students
SELECT COUNT(*) AS total_students
FROM Students;
