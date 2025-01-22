# Write your MySQL query statement below
Select class
from Courses
Group by class
Having COUNT(student)>=5