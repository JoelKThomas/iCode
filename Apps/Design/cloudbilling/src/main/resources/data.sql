-- Insert sample data into Customer table
INSERT INTO Customer (name, email) VALUES
('Alice Smith', 'alice.smith@example.com'),
('Bob Johnson', 'bob.johnson@example.com'),
('Charlie Brown', 'charlie.brown@example.com'),
('Diana Prince', 'diana.prince@example.com'),
('Ethan Hunt', 'ethan.hunt@example.com');

-- Insert sample data into Subscription table
INSERT INTO Subscription (service_name, pricing_model, customer_id) VALUES
('Cloud Storage', 'Pay-as-you-go', 1),
('Compute Service', 'Reserved', 1),
('Data Transfer', 'Savings Plan', 2),
('Web Hosting', 'Pay-as-you-go', 3),
('API Access', 'Reserved', 3),
('Database Service', 'Savings Plan', 4),
('Machine Learning', 'Pay-as-you-go', 5),
('Backup Service', 'Pay-as-you-go', 1),
('Monitoring Service', 'Reserved', 2),
('Email Service', 'Savings Plan', 4);

-- Insert sample data into Invoice table
INSERT INTO Invoice (issue_date, total_amount, customer_id) VALUES
('2024-10-01', 250.00, 1),
('2024-10-05', 400.00, 2),
('2024-10-10', 150.00, 3),
('2024-10-15', 300.00, 4),
('2024-10-20', 120.00, 5),
('2024-10-25', 180.00, 1),
('2024-10-30', 220.00, 3),
('2024-11-01', 280.00, 2);

-- Insert sample data into InvoiceItem table
INSERT INTO InvoiceItem (description, amount, invoice_id) VALUES
('Storage Fees (October)', 100.00, 1),
('Data Retrieval Fees (October)', 50.00, 1),
('Compute Instance Fees (October)', 100.00, 2),
('Data Transfer Fees (October)', 150.00, 2),
('Web Hosting Fees (October)', 80.00, 3),
('API Access Fees (October)', 70.00, 3),
('Database Hosting Fees (October)', 150.00, 4),
('Backup Fees (October)', 100.00, 1),
('Monitoring Service Fees (October)', 200.00, 2),
('Email Service Fees (October)', 120.00, 5),
('Storage Fees (November)', 100.00, 6),
('Data Retrieval Fees (November)', 80.00, 6),
('Compute Instance Fees (November)', 50.00, 7),
('Web Hosting Fees (November)', 90.00, 8);

-- Insert sample data into Usage table
INSERT INTO Usage (amount_used, usage_date, subscription_id) VALUES
(20.5, '2024-10-01', 1),
(15.0, '2024-10-02', 1),
(30.0, '2024-10-03', 2),
(50.0, '2024-10-04', 2),
(12.5, '2024-10-01', 3),
(25.0, '2024-10-05', 4),
(8.0, '2024-10-06', 5),
(5.0, '2024-10-02', 6),
(10.0, '2024-10-07', 7),
(15.0, '2024-10-10', 8),
(6.5, '2024-10-12', 9),
(22.0, '2024-10-15', 3),
(18.0, '2024-10-20', 5),
(20.0, '2024-10-25', 2);
