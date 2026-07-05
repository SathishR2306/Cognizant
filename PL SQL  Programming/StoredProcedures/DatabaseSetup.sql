

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    FOREIGN KEY (AccountID)
    REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);

--sample data

INSERT INTO Customers VALUES
(1,'John Doe',TO_DATE('1955-05-15','YYYY-MM-DD'),15000,SYSDATE);

INSERT INTO Customers VALUES
(2,'Jane Smith',TO_DATE('1990-07-20','YYYY-MM-DD'),8000,SYSDATE);

INSERT INTO Customers VALUES
(3,'Robert',TO_DATE('1958-02-12','YYYY-MM-DD'),20000,SYSDATE);

INSERT INTO Accounts VALUES
(1,1,'Savings',15000,SYSDATE);

INSERT INTO Accounts VALUES
(2,2,'Savings',8000,SYSDATE);

INSERT INTO Accounts VALUES
(3,3,'Checking',20000,SYSDATE);

INSERT INTO Transactions VALUES
(1,1,SYSDATE,500,'Deposit');

INSERT INTO Transactions VALUES
(2,2,SYSDATE,300,'Withdrawal');

INSERT INTO Loans VALUES
(1,1,5000,8,SYSDATE,SYSDATE+20);

INSERT INTO Loans VALUES
(2,2,6000,10,SYSDATE,SYSDATE+90);

INSERT INTO Loans VALUES
(3,3,10000,9,SYSDATE,SYSDATE+15);

INSERT INTO Employees VALUES
(1,'Alice','Manager',70000,'HR',
TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(2,'Bob','Developer',60000,'IT',
TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;