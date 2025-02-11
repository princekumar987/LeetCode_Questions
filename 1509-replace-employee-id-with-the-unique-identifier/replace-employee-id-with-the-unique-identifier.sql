# Write your MySQL query statement below

Select  e2.unique_id, e1.name from Employees as e1
left join EmployeeUNI as e2
on e1.id=e2.id