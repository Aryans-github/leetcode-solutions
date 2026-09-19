# Write your MySQL query statement below
-- SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
-- FROM Employee e
-- JOIN (
--     SELECT departmentId, MAX(salary) AS max_salary
--     FROM Employee
--     GROUP BY departmentId
-- ) AS max_salaries
-- ON e.departmentId = max_salaries.departmentId AND e.salary = max_salaries.max_salary
-- JOIN Department d
-- ON e.departmentId = d.id;


With max_salary as(
    Select d.id as department_id,Max(e.salary) as max_sal from Employee e join Department d on e.departmentId=d.id group by d.id
)
Select d.name as Department,e.name as Employee,e.salary as Salary
from Employee e join Department d on e.departmentId=d.id 
join max_salary m on e.departmentId=m.department_id And e.salary=m.max_sal;

