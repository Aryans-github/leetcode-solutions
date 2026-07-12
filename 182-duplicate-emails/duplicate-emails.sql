# Write your MySQL query statement below
Select distinct(email) from Person
where email in (Select email from Person 
                Group By email 
                having Count(*)>1);