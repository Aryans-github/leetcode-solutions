# Write your MySQL query statement below
With consecutiveNums as (
    Select id,num,
    lag(num,1) over() as prev1,
    lag(num,2) over() as prev2
    from Logs
)
Select Distinct l.num as ConsecutiveNums from Logs l 
join consecutiveNums cN on l.id=cN.id
where l.num=prev1 and l.num=prev2;