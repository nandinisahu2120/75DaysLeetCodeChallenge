SELECT person_name
FROM (
    SELECT *, SUM(weight) OVER(ORDER BY turn) AS running_total
    FROM Queue
) t
WHERE running_total <= 1000
ORDER BY running_total DESC
LIMIT 1 OFFSET 0;