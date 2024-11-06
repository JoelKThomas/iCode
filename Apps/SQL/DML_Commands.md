
### DML (Data Manipulation Language) Commands

1. **Insert Data:**

```sql
INSERT INTO Employees (EmployeeID, FirstName, LastName, Age, Department, Salary)
VALUES (1, 'John', 'Doe', 30, 'Engineering', 75000.00);
```

2. **Update Data:**

```sql
UPDATE Employees
SET Salary = 80000.00
WHERE EmployeeID = 1;
```

3. **Delete Data:**

```sql
DELETE FROM Employees
WHERE EmployeeID = 1;
```

4. **Select Data:**

```sql
SELECT * FROM Employees;
```

5. **Select Data with Conditions:**

```sql
SELECT FirstName, LastName, Salary
FROM Employees
WHERE Department = 'Engineering' AND Age > 25;
```
