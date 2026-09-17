# Write your MySQL query statement below
Select u.unique_id,e.name from 
Employees e Left Join EmployeeUNI u 
on u.id=e.id;