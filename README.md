The main objective of the Electricity Billing System is to manage the details of customers and electricity bill. It manages all the information about customers and bills.

create tables:
	-1)customers:
		-customer_id (Primary Key)
		-full_name
		-address
		-contact_number
		-email
		
		CREATE TABLE customers
		(
		   customer_id INT PRIMARY KEY AUTO_INCREMENT,
		   full_name VARCHAR(50),
		   address VARCHAR(100),
		   contact_number VARCHAR(15),
		   email VARCHAR(50)
		);
		
	2)bill:
		-bill_id (Primary Key)
		-customer_id (Foreign Key to the customers table)
		-bill_date
		-bill_due_date
		-reading_value
		-bill_amount
		
		CREATE TABLE bill 
		(
		   bill_id INT PRIMARY KEY AUTO_INCREMENT,
		   customer_id INT,
		   bill_date DATE,
		   bill_due_date DATE,
		   reading_value int,
		   bill_amount DECIMAL(10,2),
		   FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
		);
 -------------------------------------------------------------------------
 1)create dynamic web project on eclipes 
 2)covert it into mavean project
 3)add servlet and mysql dependencies.
    
    
