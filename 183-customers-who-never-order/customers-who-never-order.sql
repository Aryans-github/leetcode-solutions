Select c.name AS Customers from Customers c
where c.id NOT IN (Select customerId from Orders);
