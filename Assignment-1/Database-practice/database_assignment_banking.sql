-- Indian Union Bank

-- Customers Table
CREATE TABLE Customers(
	customer_id BIGINT PRIMARY KEY,
	customer_name VARCHAR(50) NOT NULL,
	customer_email VARCHAR(50),
	customer_phoneno BIGINT NOT NULL,
	customer_address VARCHAR(100) NOT NULL,
	user_name VARCHAR(50) NOT NULL UNIQUE,
	password VARCHAR(20) NOT NULL UNIQUE CHECK(LENGTH(password) > 6),
	date_become_customer DATE NOT NULL DEFAULT CURRENT_DATE
);

-- Accounts Table
CREATE TABLE Accounts(
	account_id BIGINT PRIMARY KEY,
	account_type VARCHAR(50) NOT NULL,
	date_opened DATE NOT NULL DEFAULT CURRENT_DATE,
	customer_id BIGINT NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES Customers (customer_id)
);

-- Transactions Table
CREATE TABLE Transactions(
	transaction_id BIGINT PRIMARY KEY,
	date_of_transaction TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	transaction_type VARCHAR(30) NOT NULL,
	amount_of_transaction NUMERIC(10,2) NOT NULL,
	account_id BIGINT NOT NULL,
	FOREIGN KEY (account_id) REFERENCES Accounts (account_id)
);

-- Inserting in Customers table
INSERT INTO Customers (customer_id,customer_name,customer_email,
					   customer_phoneno,customer_address,user_name,password)
VALUES (1234567809,'Ajith','ajith1103@gmail.com',8056636927,'marathahali,bengaluru.','ajith1122','password');

-- Inserting in Accounts Table
INSERT INTO Accounts (account_id,account_type,customer_id)
VALUES (5552021221,'savings',1234567809);

-- Inserting in Transactions Table
INSERT INTO Transactions (transaction_id,transaction_type,amount_of_transaction,account_id)
VALUES (088880011111,'deposit',30000,5552021221);

-- Selecting all the data together
SELECT
*
FROM Customers
INNER JOIN Accounts USING (customer_id)
INNER JOIN Transactions USING (account_id);