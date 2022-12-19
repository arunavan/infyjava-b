create database department

use department

create table Department(DEPTNO  char(3) primary key,DEPTNAME VARCHAR(36),MGRNO char(6),ADMRDEPT char(3),
LOCATION char(5))


create table employee(EMPNO char(6) primary key,FIRSTNME VARCHAR(20),MIDINIT CHAR(1),LASTNAME VARCHAR(15),
WORKDEPT CHAR(3) references Department(DEPTNO),PHONENO char(10),HIREDATE DATE,JOB  CHAR(8),Education SMALLINT,
SEX CHAR(1),BIRTHDATE  DATE,SALARY  DECIMAL(9, 2),BONUS DECIMAL(9, 2),Commission DECIMAL(9, 2))



create table PROJECT(PROJNO CHAR(6) primary key,PROJNAME VARCHAR(24),DEPTNO CHAR(3) references Department(DEPTNO),
RESPEMP CHAR(6) references employee(EMPNO),PRSTAFF DECIMAL(5, 2),PRSTDATE DATE,PRENDATE DATE,MAJPROJ CHAR(6))



create table EMP_ACT(EMPNO CHAR(6) references employee(EMPNO) ,PROJNO CHAR(6) references PROJECT(PROJNO),
ACTNO SMALLINT,EMPTIME DECIMAL(5, 2),EMSTDATE DATE,EMENDATE DATE)



insert into Department values('A00' ,'SPIFFY COMPUTER SERVICE DIV.','000010','A00','che');
insert into Department values('B01','PLANNING','000020','A00','che');
insert into Department values('C01','INFORMATION CENTER','000030','A00','che');
insert into Department values('D01','DEVELOPMENT CENTER', '-','A00','che');
insert into Department values('D11','MANUFACTURING SYSTEMS','000060','D01','che');
insert into Department values('D21','ADMINISTRATION SYSTEMS','000070','D01','che');
insert into Department values('E01','SUPPORT SERVICES','000050','A00','che');
insert into Department values('E11','OPERATIONS','000090','E01','che');
insert into Department values('E21','SOFTWARE SUPPORT','000100','E01','che');



insert into employee values('000010','CHRISTINE','I','HAAS','A00','3978','1965-01-01','PRES',18,'F','1933-08-14',52750.00,1000.00,4220.00);
insert into employee values('000010','CHRISTINE','I','HAAS','A00','3978','1965-01-01','MANAGER' ,18, 'M', '1948-02-02' ,41250.00, 800.00 ,3300.00);
insert into employee values('000020','MICHAEL','L', 'THOMPSON', 'B01', '3476' ,'1973-10-10','MANAGER' ,20, 'F','1941-05-11',38250.00,800.00 ,3060.00);
insert into employee values('000030','SALLY','A', 'KWAN' ,'C01' ,'4738' ,'1975-04-05','MANAGER' ,16, 'M','1925-09-15',40175.00,800.00,3214.00);
insert into employee values('000050','JOHN','B', 'GEYER' ,'E01' ,'6789' ,'1949-08-17','MANAGER' ,16, 'M','1945-07-07',32250.00,600.00,2580.00);
insert into employee values('000060','IRVING','F', 'STERN' ,'D11' ,'6423' ,'1973-09-14','MANAGER' ,16, 'F','1953-05-26',36170.00,700.00,2893.00);
insert into employee values('000070','EVA','D', 'PULASKI' ,'D21' ,'7831' ,'1980-09-30','MANAGER' ,16, 'F' ,'1941-05-15',29750.00,600.00,2380.00);
insert into employee values('000090','EILEEN','W', 'HENDERSON','E11' ,'5498', '1970-08-15','MANAGER' ,14, 'M','1956-12-18',26150.00,500.00,2092.00);
insert into employee values('000130','DOLORES','M','QUINTANA','C01','4578','1971-07-28','DESIGNER',16,'M','1947-05-17',25280.00,500.00,2022.00);



insert into PROJECT values('AD3110','GENERALAD SYSTEMS','D21','000070',6.00,'1982-01-01','1983-02-01','AD3100');
insert into PROJECT values('PL2100','WELD LINE PLANNING','B01','000020',1.00,'1982-01-01','1982-09-15','MA2100');
insert into PROJECT values('OP1000','OPERATION SUPPORT','E01','000050',6.00,'1982-01-01','1983-02-01','-');
insert into PROJECT values('IF2000','USER EDUCATION','C01','000030',1.00,'1982-01-01','1983-02-01','-');
insert into PROJECT values('MA2110','W L PROGRAMMING','D11','000060', 9.00,'1982-01-01','1983-02-01','MA2100');



insert into EMP_ACT values('000020','PL2100',30,1.00,'1982-01-01','1982-09-15');
insert into EMP_ACT values('000050','OP1000',10,0.25,'1982-01-01','1983-02-01');
insert into EMP_ACT values('000030','IF2000',10,0.50,'1982-01-01','1983-01-01');
insert into EMP_ACT values('000010','MA2110',10,1.00,'1982-01-01','1983-02-01');




SELECT lastname  +','+ job "Employee and Title" FROM employee

SELECT empno,lastname , salary * 12 "ANNUAL SALARY"
FROM employee


SELECT FIRSTNME +','+lastname+','+ job  "THE_OUTPUT" FROM employee



SELECT lastname , job, HIREDATE FROM employee
WHERE HIREDATE BETWEEN'01-Jan-1965'AND'01-May-1965'
ORDER BY HIREDATE


SELECT MGRNO, DEPTNO FROM DEPARTMENT WHERE MGRNO IS NOT NULL ORDER BY MGRNO 


SELECT PROJNO, PROJNAME FROM PROJECT WHERE PROJNAME LIKE '%SUPPORT%' ORDER BY PROJNO 



SELECT DEPTNO, DEPTNAME FROM DEPARTMENT WHERE DEPTNO LIKE '_1_'
ORDER BY DEPTNO



SELECT EMPNO, LASTNAME, SALARY, BONUS FROM EMPLOYEE WHERE BONUS BETWEEN 800 AND 1000 ORDER BY BONUS, EMPNO



SELECT PROJNO, ACTNO, EMSTDATE, EMENDATE FROM EMP_ACT WHERE ACTNO IN (10, 30,180) AND PROJNO LIKE 'PL%' ORDER BY PROJNO, ACTNO
 


SELECT LASTNAME, SALARY, BONUS FROM EMPLOYEE WHERE SEX = 'M'


************SELECT upper(left(lastName,1))+substring(lastName,2,len(lastName))as'IntiCap'
FROM employee WHERE LASTNAME like'H%'OR lastname LIKE'T%'OR lastname LIKE'A%'            
ORDER BY lastname



SELECT E.LASTNAME, E.FIRSTNME, D.DEPTNAME, E.JOB
FROM EMPLOYEE E JOIN DEPARTMENT D ON E.WORKDEPT = D.DEPTNO
WHERE E.WORKDEPT BETWEEN 'A00' AND 'F21' AND JOB <> 'MANAGER'
ORDER BY D.DEPTNAME, E.LASTNAME, E.FIRSTNME




SELECT D.DEPTNAME, E.LASTNAME, E.FIRSTNME FROM DEPARTMENT D JOIN EMPLOYEE E ON D.MGRNO = E.EMPNO ORDER BY D.DEPTNAME




select e.empno,e.lastname from Employee e join department d
on e.workdept=d.deptno where d.mgrno between 20 and 60




SELECT DISTINCT A.EMPNO, LASTNAME, PROJNO FROM EMPLOYEE E, EMP_ACT A WHERE A.EMPNO = E.EMPNO AND A.PROJNO = 'PL2100'ORDER BY A.EMPNO, PROJNO



SELECT E.WORKDEPT, E.LASTNAME, P.PROJNAME, A.ACTNO FROM EMPLOYEE AS E 
JOIN EMP_ACT AS A ON E.EMPNO = A.EMPNO JOIN PROJECT AS P ON A.PROJNO = P.PROJNO WHERE E.WORKDEPT = 'A00'
ORDER BY P.PROJNAME, A.ACTNO




SELECT A.ACTNO, D.MGRNO, A.EMSTDATE, E.LASTNAME FROM EMPLOYEE AS E 
JOIN EMP_ACT AS A ON E.EMPNO = A.EMPNO JOIN PROJECT AS P ON A.PROJNO = P.PROJNO 
JOIN DEPARTMENT AS D ON E.WORKDEPT = D.DEPTNO WHERE A.EMSTDATE >= '1982-01-01' ORDER BY A.ACTNO, A.EMSTDATE



SELECT WORKDEPT, LASTNAME, SALARY+Commission+BONUS AS INCOME
FROM EMPLOYEE WHERE SALARY+Commission+BONUS > 0.1*SALARY AND WORKDEPT = 'D11'
ORDER BY INCOME DESC




SELECT WORKDEPT, EMPNO, SALARY FROM EMPLOYEE WHERE WORKDEPT = 'A00' UNION ALL
SELECT WORKDEPT, 'SUM', SUM(SALARY) FROM EMPLOYEE WHERE WORKDEPT = 'A00' 
GROUP BY WORKDEPT ORDER BY 3




SELECT PROJNO, DAY(PRENDATE)-DAY(PRSTDATE) AS DAYS FROM PROJECT WHERE DAY(PRENDATE)-DAY(PRSTDATE) = (SELECT MIN(DAY(PRENDATE)-DAY(PRSTDATE))
FROM PROJECT)



***********with employeeCTE(EMPLOYEENUMBER,LASTNAME,managernumber)AS
(
select e.empno,e.lastname,d.mgrno from Employee e join department d
on e.workdept=d.deptno
where d.mgrno between 20 and 60
)


SELECT * FROM Employeecte



**********select empno,lastname,firstnme,"APPRAISAL"=case 
WHEN DATEDIFF(YY,HIREDATE,GETDATE()) between 5 and 30 THEN '5%'
WHEN DATEDIFF(YY,HIREDATE,GETDATE()) between 29 and 40  THEN '10%'
WHEN DATEDIFF(YY,HIREDATE,GETDATE()) between 39 and 50  THEN '20%'
WHEN DATEDIFF(YY,HIREDATE,GETDATE()) >49   THEN '30%'
END
FROM EMPLOYEE



SELECT 'PROJECT' as Project, PROJNO, RESPEMP, PRSTDATE, PRENDATE
FROM PROJECT WHERE PROJNO LIKE 'IF%' UNION ALL SELECT '', PROJNO, EMPNO, EMSTDATE, EMENDATE FROM EMP_ACT WHERE PROJNO LIKE 'IF%'
ORDER BY 2, 1 DESC, 3, 4



***********select C01,D11,E11 from (select workdept,salary from employee) emp
pivot(sum(salary) for workdept in(C01,D11,E11)) as pvt