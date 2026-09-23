# Write your MySQL query statement below
-- SELECT ROUND(SUM(T3.sum), 2) AS tiv_2016 
-- FROM(
--     SELECT * , COUNT(*) AS cnt, SUM(T2.tiv_2016 ) AS sum
--     FROM(
        
--     ) T2
--     GROUP BY T2.tiv_2015 
-- )T3
-- WHERE T3.cnt > 1

SELECT ROUND(SUM(T1.tiv_2016 ), 2) AS tiv_2016
FROM (
    SELECT * ,
    COUNT(*) OVER(PARTITION BY lat , lon ) AS freq,
    COUNT(*) OVER(PARTITION BY tiv_2015 ) AS tiv_2015_freq 
    FROM Insurance
) T1
WHERE T1.freq = 1 AND T1.tiv_2015_freq > 1