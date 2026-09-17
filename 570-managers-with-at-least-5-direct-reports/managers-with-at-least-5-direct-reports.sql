# Write your MySQL query statement below
-- SELECT NAME FROM EMPLOYEE 
-- WHERE ID IN (SELECT MANAGERID FROM EMPLOYEE GROUP BY MANAGERID HAVING COUNT(MANAGERID)>=5 );

Select  e.name from Employee e join Employee m 
on e.id = m.managerId  
group by e.id,e.name 
having Count(m.managerId)>=5;