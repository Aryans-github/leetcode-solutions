-- Select c.name AS Customers from Customers c
-- where c.id NOT IN (Select customerId from Orders);

Select c.name as Customers 
from Customers c left join Orders o
on c.id=o.customerId 
where o.customerId is null;