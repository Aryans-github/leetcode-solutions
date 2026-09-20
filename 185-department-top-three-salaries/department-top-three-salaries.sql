# Write your MySQL query statement below
-- Select d.name as Department,e.name as Employee,e.salary as Salary
-- from Employee e join Department d 
-- on e.departmentId=d.id
-- where 3 > (select Count(distinct e2.salary) from Employee e2 where e2.departmentId=e.departmentId and e2.salary>e.salary);
   
With ranked as(
    Select id,name,salary,departmentId,
    dense_rank() over(partition by departmentId order by salary desc) as ranking
    from Employee
)
Select d.name as Department,r.name as Employee,r.salary as Salary
from ranked r join department d
on r.departmentId=d.id
and r.ranking<=3;