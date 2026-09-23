# Write your MySQL query statement below
SELECT t1.visited_on , (
    SELECT SUM(t2.fsum)
    FROM (
        SELECT * , SUM(amount) AS fsum
        FROM Customer 
        GROUP BY visited_on  
        ORDER BY  visited_on
    )  t2
    WHERE DATEDIFF(t1.visited_on , t2.visited_on) BETWEEN 0 AND 6
) AS amount, ROUND(
(SELECT avg(t3.fsum)
    FROM (
        SELECT * , SUM(amount) AS fsum
        FROM Customer 
        GROUP BY visited_on  
        ORDER BY  visited_on
    )  t3
    WHERE DATEDIFF(t1.visited_on , t3.visited_on) BETWEEN 0 AND 6), 2
) AS average_amount 
FROM Customer t1
WHERE DATEDIFF(t1.visited_on , 
    (
    SELECT visited_on  
    FROM Customer 
    ORDER BY visited_on
    LIMIT 1
    )
) >= 6
GROUP BY t1.visited_on
