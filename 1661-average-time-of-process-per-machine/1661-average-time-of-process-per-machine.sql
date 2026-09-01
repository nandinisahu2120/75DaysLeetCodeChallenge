# Write your MySQL query statement below
SELECT machine_id ,
    ROUND(
        SUM(timestamp * (IF(activity_type = "end", 1, -1))) / (COUNT(*) / 2),
        3
        ) AS processing_time 
FROM Activity 
GROUP BY machine_id ;