desc employees;
select * from employees;


# JOIN 
SELECT e.employee_id, e.first_name , d.department_id, d.department_name  
FROM employees e 
JOIN departments d on d.department_id  = e.department_id
ORDER BY e.employee_id;

# Multiple JOIN 
SELECT e.employee_id, e.first_name , d.department_id, d.department_name  
FROM employees e 
JOIN departments d on d.department_id  = e.department_id
ORDER BY e.employee_id;

SELECT *
FROM departments d ;