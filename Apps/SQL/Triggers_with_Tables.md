
# MySQL Triggers

## 1. Create Tables

### `employees` Table

This table stores the employee details such as employee ID, first name, last name, and salary.

```sql
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2)
);
```

### `salary_changes` Table

This table logs the changes in employee salary, including the old and new salary, and the date of change.

```sql
CREATE TABLE salary_changes (
    change_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    old_salary DECIMAL(10, 2),
    new_salary DECIMAL(10, 2),
    change_date DATETIME,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);
```

---

## 2. Log Changes in Salary (AFTER UPDATE)

The following trigger logs the old and new salary of an employee when an update occurs on the `employees` table.

```sql
DELIMITER $$

CREATE TRIGGER after_salary_update
AFTER UPDATE ON employees
FOR EACH ROW
BEGIN
    IF OLD.salary != NEW.salary THEN
        INSERT INTO salary_changes (employee_id, old_salary, new_salary, change_date)
        VALUES (NEW.employee_id, OLD.salary, NEW.salary, NOW());
    END IF;
END$$

DELIMITER ;
```

---

## 3. Prevent Deleting Employees with High Salary (BEFORE DELETE)

This trigger prevents deletion of employees who have a salary greater than `100,000`, raising an error if the deletion is attempted.

```sql
DELIMITER $$

CREATE TRIGGER prevent_high_salary_delete
BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
    IF OLD.salary > 100000 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Cannot delete employees with salary above 100,000';
    END IF;
END$$

DELIMITER ;
```

---

## 4. Insert a Default Value for Salary (BEFORE INSERT)

This trigger automatically inserts a default salary of `50,000` if no salary is specified while inserting a new employee.

```sql
DELIMITER $$

CREATE TRIGGER before_employee_insert
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
    IF NEW.salary IS NULL THEN
        SET NEW.salary = 50000;
    END IF;
END$$

DELIMITER ;
```

---

## 5. Testing the Triggers

Here are some sample queries to test the triggers created above.

### Insert an Employee with No Salary:
This will trigger the `before_employee_insert` and set the salary to `50,000` by default.

```sql
INSERT INTO employees (employee_id, first_name, last_name) 
VALUES (1, 'John', 'Doe');
```

### Update an Employee's Salary:
This will trigger the `after_salary_update` and log the change in the `salary_changes` table.

```sql
UPDATE employees 
SET salary = 60000 
WHERE employee_id = 1;
```

### Attempt to Delete an Employee with High Salary:
If the employee has a salary above `100,000`, the `prevent_high_salary_delete` trigger will prevent the deletion and raise an error.

```sql
DELETE FROM employees 
WHERE employee_id = 1;
```

### The common syntax for creating triggers in MySQL is as follows:

General Syntax:
```sql
CREATE TRIGGER trigger_name
trigger_time trigger_event
ON table_name
FOR EACH ROW
BEGIN
-- Trigger Logic (actions to be performed)
END;
```
