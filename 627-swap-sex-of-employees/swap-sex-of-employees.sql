# Write your MySQL query statement below
-- Select id,name,
--     Case 
--         when sex='m' then 'f'
--         when sex='f' then 'm'
--     End as sex,
-- salary from Salary;

UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    WHEN sex = 'f' THEN 'm'
END;