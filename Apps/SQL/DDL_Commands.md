
### DDL (Data Definition Language) Commands

1. **Create Table:**

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    Department VARCHAR(50),
    Salary DECIMAL(10, 2)
);
```

2. **Alter Table (Add Column):**

```sql
ALTER TABLE Employees
ADD Email VARCHAR(100);
```

3. **Drop Table:**

```sql
DROP TABLE Employees;
```

4. **Create Index:**

```sql
CREATE INDEX idx_department ON Employees (Department);
```

5. **Add Primary Key:**

```sql
ALTER TABLE Employees
ADD CONSTRAINT PK_EmployeeID PRIMARY KEY (EmployeeID);
```
