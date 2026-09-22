# Write your MySQL query statement below
-- SELECT DISTINCT(p1.produ)
-- FROM Products p1 
-- LEFT JOIN Products p2 
-- ON p1.product_id  = p2.product_id AND p1.new_price != p2.new_price AND p2.change_date <= "2019-08-16"
-- ORDER BY p1.product_id, p2.change_date DESC;
SELECT product_id, new_price AS price
FROM Products 
WHERE (product_id ,change_date) IN(
    SELECT product_id ,MAX(change_date) 
    FROM Products
    WHERE change_date <= "2019-08-16"
    GROUP BY product_id
)
UNION 
SELECT product_id, 10 AS price
FROM Products 
WHERE product_id NOT IN(
    SELECT DISTINCT product_id 
    FROM Products
    WHERE change_date <= "2019-08-16"

)
;

