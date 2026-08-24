# Write your MySQL query statement below
SELECT a.product_id , IFNULL(ROUND(SUM(b.units * a.price) / SUM(b.units), 2) , 0)   AS average_price  FROM Prices a LEFT JOIN
UnitsSold b ON a.product_id = b.product_id  AND  b.purchase_date >= start_date AND  b.purchase_date <= end_date GROUP BY product_id ;