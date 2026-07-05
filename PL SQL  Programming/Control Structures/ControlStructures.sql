SET SERVEROUTPUT ON;

-- Apply 1% discount for customers above 60 years

BEGIN

FOR cust IN
(
SELECT CustomerID,
TRUNC(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
FROM Customers
)
LOOP

IF cust.Age>60 THEN

UPDATE Loans
SET InterestRate=InterestRate-1
WHERE CustomerID=cust.CustomerID;

END IF;

END LOOP;

COMMIT;

DBMS_OUTPUT.PUT_LINE('Scenario 1 Completed');

END;
/

-- VIP Customers

BEGIN

FOR cust IN
(
SELECT CustomerID,Balance
FROM Customers
)
LOOP

IF cust.Balance>10000 THEN

DBMS_OUTPUT.PUT_LINE
(
'Customer '
||cust.CustomerID||
' is VIP'
);

END IF;

END LOOP;

END;
/

-- Loan Reminder

BEGIN

FOR loan IN
(
SELECT LoanID,
CustomerID,
EndDate
FROM Loans
WHERE EndDate BETWEEN SYSDATE
AND SYSDATE+30
)
LOOP

DBMS_OUTPUT.PUT_LINE
(
'Reminder : Customer '
||loan.CustomerID||
' Loan Due on '
||loan.EndDate
);

END LOOP;

END;
/