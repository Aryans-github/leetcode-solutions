# Write your MySQL query statement below
Select score, 
Dense_rank() Over(order by score desc) as `rank`
from Scores;