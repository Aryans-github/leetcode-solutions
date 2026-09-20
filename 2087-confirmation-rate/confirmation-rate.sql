# Write your MySQL query statement below
-- Select user_id,Round((Select Count(user_id) from Confirmations group by user_id having action='confirmed')/(Count(user_id)),2) as confirmation_rate
-- from Confirmations
-- group by user_id;

Select s.user_id,Round(COALESCE(Sum(( case when action='confirmed' then 1 else 0 end))/Count(c.user_id),0),2) as confirmation_rate
from Signups s Left Join Confirmations c on s.user_id=c.user_id
group by s.user_id;