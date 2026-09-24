# Write your MySQL query statement below
SELECT product_id ,first_year , quantity ,price 
FROM(
    SELECT *, FIRST_VALUE(year) OVER(
        PARTITION BY product_id
        ORDER BY year
        ) AS first_year
    FROM Sales
) T1
WHERE year = first_year;