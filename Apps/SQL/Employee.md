
# Employee Database - SQL Query Reference

This document provides a collection of SQL queries commonly used to interact with an employee database.

## Table Structure
Assume we have an `employees` table with the following columns:
- `employee_id`: Unique identifier for each employee.
- `employee_name`: Name of the employee.
- `department_id`: ID of the department where the employee works.
- `salary`: Salary of the employee.
- `hire_date`: The date the employee was hired.

---

## Queries

### 1. Find the nth Highest Salary

**Description:** Retrieve the nth highest salary from the employees' table.

```sql
SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET (n-1);
```
- Replace `n` with the desired rank (e.g., `n = 3` for the 3rd highest salary).

---

### 2. Find the Employee(s) with Minimum Salary in Each Department

**Description:** Get the employee(s) with the lowest salary for each department.

```sql
SELECT e.employee_id, e.employee_name, e.department_id, e.salary
FROM employees e
JOIN (
    SELECT department_id, MIN(salary) AS min_salary
    FROM employees
    GROUP BY department_id
) d ON e.department_id = d.department_id AND e.salary = d.min_salary;
```

---

### 3. Find the Employee(s) with Maximum Salary in Each Department

**Description:** Get the employee(s) with the highest salary in each department.

```sql
SELECT e.employee_id, e.employee_name, e.department_id, e.salary
FROM employees e
JOIN (
    SELECT department_id, MAX(salary) AS max_salary
    FROM employees
    GROUP BY department_id
) d ON e.department_id = d.department_id AND e.salary = d.max_salary;
```

---

### 4. Find the Total Number of Employees in Each Department

**Description:** Count the number of employees in each department.

```sql
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;
```

---

### 5. Find the Average Salary in Each Department

**Description:** Get the average salary of employees for each department.

```sql
SELECT department_id, AVG(salary) AS average_salary
FROM employees
GROUP BY department_id;
```

---

### 6. Find the Total Salary Paid by Each Department

**Description:** Calculate the total salary paid by each department.

```sql
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id;
```

---

### 7. List All Employees Hired in the Last Year

**Description:** Retrieve all employees who were hired in the last 12 months.

```sql
SELECT employee_id, employee_name, hire_date
FROM employees
WHERE hire_date >= CURDATE() - INTERVAL 1 YEAR;
```

---

### 8. List Employees Without a Department

**Description:** Find employees who are not assigned to any department.

```sql
SELECT employee_id, employee_name
FROM employees
WHERE department_id IS NULL;
```

---

### 9. Find the Employee with the Longest Tenure

**Description:** Get the employee who has been working the longest (earliest hire date).

```sql
SELECT employee_id, employee_name, hire_date
FROM employees
ORDER BY hire_date ASC
LIMIT 1;
```

---

### 10. List Employees with Salaries Above Average

**Description:** Retrieve employees who earn more than the average salary.

```sql
SELECT employee_id, employee_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);
```

---

### 11. Find the 2nd Highest Salary in the Company

**Description:** Get the employee(s) with the second highest salary.

```sql
SELECT employee_id, employee_name, salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;
```

---

### 12. Find Employees with the Same Salary

**Description:** List employees who have the same salary.

```sql
SELECT employee_name, salary
FROM employees
GROUP BY salary
HAVING COUNT(employee_id) > 1;
```

---

### 13. Find the Number of Employees Earning More Than a Specific Amount

**Description:** Count the employees earning more than a given salary.

```sql
SELECT COUNT(*)
FROM employees
WHERE salary > 50000;
```
- Replace `50000` with the desired salary threshold.

---