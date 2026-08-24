# Write your MySQL query statement below
-- SELECT name FROM Employee WHERE id IN (SELECT managerId FROM Employee WHERE managerId IS NOT NULL GROUP BY managerId HAVING COUNT(managerId) >= 5);
SELECT b.name FROM Employee a JOIN Employee b ON a.managerId = b.id GROUP BY a.managerId HAVING COUNT(*) >= 5; 