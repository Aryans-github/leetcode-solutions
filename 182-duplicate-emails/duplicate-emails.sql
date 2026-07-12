# Write your MySQL query statement below
Select email from Person 
                Group By email 
                having Count(email)>1;