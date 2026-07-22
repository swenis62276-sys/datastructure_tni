--charpter 4 
--date
SELECT employee_id,hire_date,
TO_CHAR(hire_date, 'MM/YY') Month_Hired
FROM employees
WHERE last_name = 'Higgins';


SELECT employee_id,hire_date,
TO_CHAR(hire_date, 'Dy dd Month MM/Year') Month_Hired
FROM employees
WHERE last_name = 'Higgins';

--time
SELECT last_name,
TO_CHAR(hire_date, 'fmDD Month YYYY')
AS HIREDATE
FROM employees;

SELECT last_name,
TO_CHAR(hire_date, 'DD Month YYYY')
AS HIREDATE
FROM employees;

--practice

SELECT last_name,
TO_CHAR(hire_date, 'fmDdspth "of" Month yyyy fmHH12:MI:SS AM')
AS HIREDATE
FROM employees;

--money
SELECT salary,TO_CHAR (salary, '$99,999.00') SALARY,
 TO_CHAR(salary, 'L99,999.00') Sal
FROM employees
WHERE last_name = 'Ernst';

-- function ซ้อน function
SELECT last_name,
UPPER(CONCAT(SUBSTR(last_name,1,8),'_US'))
AS "Last name"
FROM employees
WHERE department_id = 60;

--practice
SELECT TO_CHAR(next_day(add_months(hire_date,6),'friday'),'fmDay,Month ddth,yyyy')as "Next 6 Month Review"
FROM employees;
--จัดการค่า null
SELECT last_name, salary, commission_pct,
NVL(commission_pct,0) NVL_COMMISSION_PCT,
(salary*12) + (salary*12*NVL(commission_pct,0)) AN_SAL
FROM employees;
SELECT last_name, salary, commission_pct,
NVL2(commission_pct, 'SAL+COM', 'SAL') AS INCOME
FROM employees
WHERE department_id IN (50, 80);
--
SELECT last_name, salary, commission_pct,
NVL2(commission_pct, salary*commission_pct,salary) AS INCOME
FROM employees
WHERE department_id IN (50, 80);
--
SELECT first_name, LENGTH(first_name) "expr1",
last_name, LENGTH(last_name) "expr2",
NULLIF(LENGTH(first_name), LENGTH(last_name)) "result"
FROM employees;
--
SELECT last_name, manager_id, commission_pct,
COALESCE(TO_CHAR(commission_pct), TO_CHAR(manager_id),
'No commission and No manager') AS EXPRESSION
FROM employees;

--practice
SELECT last_name, salary, commission_pct,
COALESCE(salary*commission_pct+salary,salary+2000)as "New Salary"
FROM employees;

--
SELECT last_name, job_id, salary,
CASE job_id WHEN 'IT_PROG' THEN 1.10*salary -- Then salary*1/100+salary
            WHEN 'ST_CLERK' THEN 1.15*salary
            WHEN 'SA_REP' THEN 1.20*salary
            ELSE salary
END AS "REVISED SALARY"
FROM employees;

--practice
SELECT last_name,salary,
CASE    WHEN salary < 5000 THEN 'Low' -- Then salary*1/100+salary
        WHEN salary <10000 THEN 'Medium'
        WHEN salary <20000 THEN 'Good'
END AS qualifield_salary
FROM employees;
--
SELECT last_name,salary,
CASE    WHEN salary < 6000 THEN 0.36 -- Then salary*1/100+salary
        WHEN salary <8000 THEN 0.38
        WHEN salary <10000 THEN 0.4
        WHEN salary <12000 THEN 0.42
        WHEN salary <14000 THEN 0.44
        WHEN salary <16000 THEN 0.45
        
END AS Tax_rate
FROM employees
where department_id=80;
--
--NEW_MIN
SELECT JOB_ID,JOB_TITLE,MIN_SALARY,
TO_CHAR(case    WHEN JOB_TITLE LIKE 'A%' THEN MIN_SALARY*1.10
        WHEN JOB_TITLE LIKE 'P%' THEN MIN_SALARY*1.20
        ELSE MIN_SALARY
end ,'99,999') as newmin
FROM JOBS;

-- chapter 5
SELECT MAX(salary),MIN(salary)
FROM employees;
--
SELECT ROUND(AVG(salary),2), MAX(salary),
MIN(salary), SUM(salary)
FROM employees
WHERE job_id LIKE '%REP%';

--
SELECT MIN(hire_date), MAX(hire_date)
FROM employees;
--
SELECT MIN(LAST_NAME)first_lastname, MAX(LAST_NAME)last_lastname
FROM employees;

--
SELECT COUNT(*)
FROM employees
WHERE department_id = 50;
--
SELECT COUNT(commission_pct)
FROM employees
WHERE department_id = 80;
--
SELECT COUNT(DISTINCT DEPARTMENT_ID)
FROM EMPLOYEES;
--
SELECT AVG(commission_pct) "Average"
FROM employees; --/35 คน
--
SELECT AVG(NVL(commission_pct,0))
FROM employees; --/107 คน
--
