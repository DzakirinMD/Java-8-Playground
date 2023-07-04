/*
https://www.linkedin.com/posts/hanu-koshti-3636511a0_sql-cheat-sheet-activity-7057021581058879488-uKPb/
*/

select *
from employees
where salary < 55000;

/*
Given the database of a football tournament, sort the countries by the number of goals scored by that country, descending,
The number of goals scored by a country is the sum of the goals scored by its players.
If two or more countries have the same number of goals scored, order them ascending by countries.id.
The output should be in the format of: countries.name, goals scored

Refer to Football Tournament in the Playground DDL for its table structure
*/

SELECT c.name, SUM(g.goals) AS goals_scored
FROM Countries c
JOIN Goals g ON c.id = g.country_id
GROUP BY c.id, c.name
ORDER BY goals_scored DESC, c.id;

-- this is for sales
SELECT CONCAT(e.FirstName, ' ', e.LastName) AS EmployeeName, COALESCE(SUM(s.Quantity), 0) AS SalesQuantity
FROM Employees e
         LEFT JOIN Sales s ON e.EmployeeID = s.EmployeeID
GROUP BY e.EmployeeID, e.FirstName, e.LastName
ORDER BY SalesQuantity DESC, e.EmployeeID;


-- Write a query to return a list of professor names and their
-- associated courses for all courses outside of their departments.
-- There should be no duplicate rows, but they can be in any order.
-- The output should contain two columns: professor.name, course.name.