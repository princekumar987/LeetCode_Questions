# Write your MySQL query statement below
SELECT e2.name as Employee
FROM Employee  e1
Inner JOIN Employee  e2
ON e1.id=e2.managerId
WHERE e1.salary<e2.salary;
