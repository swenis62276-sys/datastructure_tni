-- Lab sheet: Week4

--1
SELECT EMPLOYEE_ID,START_DATE,END_DATE,add_months(END_DATE,2)as "2 month after endate",
NEXT_DAY(add_months(START_DATE,6),'friday')as "Next Friday",LAST_DAY(END_DATE),
MONTHS_BETWEEN(end_date,start_date)as "Month work"
FROM JOB_HISTORY
where MONTHS_BETWEEN(end_date,start_date)>40;

--2
SELECT LAST_NAME,LENGTH(LAST_NAME)as LENGTH
FROM EMPLOYEES
WHERE (LAST_NAME LIKE 'G%'or LAST_NAME LIKE'K%' and LAST_NAME not LIKE '%e%') ;
-- 2
SELECT last_name, LENGTH(last_name) AS "LENGTH"
FROM employees
WHERE (SUBSTR(last_name, 1, 1) = 'G' OR SUBSTR(last_name, 1, 1) = 'K')
  AND last_name NOT LIKE '%e%';
  