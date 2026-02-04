Select E1.name AS Employee from Employee E1
where E1.salary>(Select E2.salary from Employee E2 where E1.managerId=E2.id); 