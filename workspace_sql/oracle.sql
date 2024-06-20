-- 한줄 주석
/* 범위 주석 */

select 
    * -- 모든 컬럼(column)
from --from 뒤에는 테이블 이름
    emp;
    
select 
    empno, ename, deptno -- 조회하고 싶은 컬럼 명들 
from 
emp; -- 오라클에서는 select 와 from 이 자웅동체

select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 바로 밑 복사 ctrl + shift + D

-- distinct : select에서 중복되는 자료를 제거해준다
select distinct deptno from emp;
select distinct job from emp;

select distinct deptno, job from emp; -- column이 여러개인 경우 중복되는 데이터를 제거 한다

-- null 과 연산하면, 무조건 null로 표시된다.
select ename, sal, sal*12+comm, comm from emp;

-- 연산한 컬럼의 이름(별칭)을 만들어주는 방법 -- 별칭안에 띄어쓰기는 "" 쌍따옴표로 감싸줘야 한다
-- "" 쌍따옴표, as 생략 가능
select ename, sal, sal*12+comm as annsal, comm from emp;

-- 원하는 순서로 출력하는 방법 order by
-- 오름차순 : asc 생략가능
-- 내림차순 : desc
select * from emp 
order by sal;

-- order by 첫번째 column을 정렬하고 그중 같은게 있다면  다음걸로 정렬
select * from emp
order by deptno asc, sal desc;

-- 교재문제 1
select distinct job from emp;

-- 교재문제 2
select 
    empno as employee_no,
    ename as emplotee_name,
    mgr as manager,
    sal as salary,
    comm as commission,
    deptno as department_no
    from emp
order by deptno desc, ename;


-- 원하는 column의 값을 출력하는 방법
select * from emp
where deptno = 30;

-- 교재 1분복습 문제
select * from emp
where empno = 7782;

-- 선생님이 준 문제
select * from emp
where sal >= 2000;

-- table 값이 문자일 경우 꼭 '' 홀따옴표로 감싸줘야 한다
select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'CLERK';

-- 우선순위 때문에 ()를 쓴다
select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal <= 3000;

select * from emp
where sal != 3000;
--where sal <> 3000; 비교 연산자 sql에서 많이 사용한다.
--where sal ^= 3000;

select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

// in과 함께 not을 사용할땐, 열 이름 뒤에다 쓴다.
select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');



