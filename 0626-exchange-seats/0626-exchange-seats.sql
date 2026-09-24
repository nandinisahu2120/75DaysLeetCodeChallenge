# Write your MySQL query statement below
SELECT id ,
CASE 
    WHEN id % 2 = 1 THEN 
        COALESCE( LEAD(student) OVER(ORDER BY id), student)
    ELSE 
        COALESCE( LAG(student) OVER(ORDER BY id), student)
END AS student
FROM Seat;