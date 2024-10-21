-- Drop existing tables if they exist
DROP TABLE IF EXISTS InvoiceItem CASCADE;
DROP TABLE IF EXISTS Usage CASCADE;
DROP TABLE IF EXISTS Invoice CASCADE;
DROP TABLE IF EXISTS Subscription CASCADE;
DROP TABLE IF EXISTS Customer CASCADE;

-- Create Customer table
CREATE TABLE Customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Create Subscription table
CREATE TABLE Subscription (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    service_name VARCHAR(255) NOT NULL,
    pricing_model VARCHAR(255) NOT NULL,
    customer_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

-- Create Invoice table
CREATE TABLE Invoice (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    issue_date DATE NOT NULL,
    total_amount DOUBLE NOT NULL,
    customer_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

-- Create InvoiceItem table
CREATE TABLE InvoiceItem (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL,
    invoice_id BIGINT,
    FOREIGN KEY (invoice_id) REFERENCES Invoice(id)
);

-- Create Usage table
CREATE TABLE Usage (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    amount_used DOUBLE NOT NULL,
    usage_date DATE NOT NULL,
    subscription_id BIGINT,
    FOREIGN KEY (subscription_id) REFERENCES Subscription(id)
);
