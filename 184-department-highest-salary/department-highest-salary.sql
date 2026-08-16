# Write your MySQL query statement below
SELECT Department.name AS Department,
Employee.name AS Employee,
Employee.salary AS Salary
FROM Employee 
INNER JOIN Department 
ON Employee.departmentId=Department.id
WHERE (Department.id, Employee.salary) IN
(SELECT departmentId, max(salary)
FROM Employee
GROUP BY departmentId);