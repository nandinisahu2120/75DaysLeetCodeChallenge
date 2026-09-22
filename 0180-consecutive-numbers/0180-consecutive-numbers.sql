# Write your MySQL query statement below
SELECT DISTINCT(l1.num) AS ConsecutiveNums 
FROM Logs l1 
CROSS JOIN Logs l2
ON l1.num = l2.num AND L2.id - l1.id = 1
CROSS JOIN Logs l3
ON l1.num = l3.num  AND L3.id - l1.id = 2
ORDER BY l1.id;