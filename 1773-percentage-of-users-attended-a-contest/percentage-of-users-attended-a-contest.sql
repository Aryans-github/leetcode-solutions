# Write your MySQL query statement below
Select contest_id,Round((((Count(distinct r.user_id))/(Select Count(user_id) from Users))*100),2) as percentage
from Register r 
group by contest_id
order by percentage desc,contest_id asc;