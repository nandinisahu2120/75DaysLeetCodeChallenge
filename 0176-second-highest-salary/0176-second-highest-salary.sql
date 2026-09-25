# Write your MySQL query statement below
SELECT IF(COUNT(T1.SAL) < 1 , null, SAL) AS SecondHighestSalary 
FROM (
    SELECT DISTINCT salary AS SAL 
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1 
) T1
 