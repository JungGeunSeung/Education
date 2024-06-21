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

-------------------------------------------------------------------
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

-------------------------------------------------------
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
----------------------------------------------------------------------

select * from emp
where sal between 2000 and 3000;

----------------------------------------------------------------------
select * from emp
where ename like 'S%'; -- % : S 뒤에 오늘 모든것을 포함

select * from emp
where ename like '_L%'; -- _ : 어떤값이던 상관없이 한 개의 문자 데이터를 의미한다

select * from emp
where ename like '____'; -- 언더바의 개수로 원하는 글자수의 데이터를 출력 할 수 있다.

select * from emp
where ename like '%AM%'; -- AM이 포함된 ename의 열에서 모든 데이터 찾기.

select * from emp
where comm <= 400;

select * from emp
where comm is null; -- null은 =(연산자) 도 되지 않기 때문에 is null를 사용한다

select * from emp
where comm is not null;
------------------------------------------------------------------
-- union 은 집합 연산자로 select절을 묶어주는데,
-- column의 타입과 개수가 같을때 합쳐서 출력해주는데, 중복을 제거한 상태로 출력된다
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 20;

-- 따라서 union all은 중복된 값이 있어도 그대로 출력한다.
select empno, ename, sal, deptno from emp
where deptno = 10
union all
select empno, ename, sal, deptno from emp
where deptno = 10;


-- 교재 125p Q1 문제
select * from emp
where ename like '%S';

-- 교재 125p Q2 문제
select empno, ename, job, sal, deptno from emp
where deptno= 30 and job = 'SALESMAN'
order by empno;

--교재 125p Q3 문제
select  empno, ename, job, sal, deptno from emp
where deptno in (20, 30) and sal > 2000;

-- 집합연산자 사용
select  empno, ename, job, sal, deptno from emp
where sal >2000
minus
select  empno, ename, job, sal, deptno from emp
where deptno = 10;

--교재 125p Q4문제
select * from emp
where not (sal >= 2000 and sal <=3000);

--교제 126p Q5문제
select ename, empno, sal, deptno from emp
where (sal >= 2000 or sal < 1000)
    and deptno = 30 
    and ename like '%E%';
    
--교재 126p Q6문제
select * from emp
where comm is null
and mgr is not null
and job in ('MANAGER','CLERK')
and ename not like '_L%';

---------------------------------------------------------
-- 문자함수
-- upper : 대문자로 변경
-- lower : 소문자로 변경
-- initcap : 첫글자만 대문자로 변경
select ename, upper(ename), lower(ename), initcap(ename) from emp;

-- 대소문자 구분 없이 like로 검색할때 좋다.
select * from emp
where lower(ename) like lower('%mi%');

------------------------------------------------------------
-- 해당 column에 값의 길이를 알 수 있다.
select ename, length(ename) from emp;

-- length로 where 필터도 거칠수 있다.
select ename, length(ename) from emp
where length(ename) >= 5;

-- lengthb Byte를 계산해주는 함수이다.
-- 한글을 3Byte의 데이터를 가져간다.
select length('한'), lengthb('한') from dual; -- dual : 기본으로 제공하는 더미형 테이블이다.


---------------------------------------------------------------
-- 문자열 일부를 추출하는 substr 함수
-- 첫번째 전달인자 : column값
-- 두번재 전달인자 : 절단을 시작할 숫자
-- 세번째 전달인자(생략가능) : 가져올 길이 (생략하면, 끝까지 가지고 온다)
select job, 
    substr(job, 1, 2), 
    substr(job, 3, 2), 
    substr(job, 5),
    substr(job, -3, 2), -- -(마이너스)로 시작하면 뒤에서 부터 시작한다.
    
    -- 세번째 전달인자 값이 터무니 없이 커져도 마지막 값까지만 가져온다. (공백이 생기거나 하진 않는다)
    substr(job, 5, 100),
    length ( lower ( substr ( job, 5, 100 )))
from emp;


----------------------------------------------------------------
-- replace : 특정문자를 다른문자로 바꾸는 함수
select job,
replace (job, 'A', '*') from emp;


-- 문제 job의 가운데 글자에 * 넣기
select job, 
    length(job),
    length(job)/2,
    substr(job, (length(job)+1)/2, 1),
    replace (job, substr(job, (length(job)+1)/2, 1), '*')
from emp;
----------------------------------------------------------------
-- lpad : left padding
-- rpad : right padding
-- 첫번째 전달인자 : 열이름 또는 문자열
-- 두번째 전달인자 : 데이터의 전체 자릿수
-- 세번째 전달인자 : 빈 공간에 채울 문자(생략가능)

select job,
    lpad(job, 10, '#'),
    lpad(job, 4, '#'),
    rpad(job, 10, '*'),
    lpad(job, 10),
    rpad(job, 10)
from emp;

select job,
    lpad(job, length(job)+(15 - length(job))/2, '*')
from emp;
-----------------------------------------------------------------
-- 두 문자열을 합치는 함수
-- concat
select empno || ename || '님' from emp;

-----------------------------------------------------------------
-- 앞 뒤의 공백을 지워주는 함수 trim
-- 하지만 글씨 사이의 공백을 지워주지 않는다
select
    '     a b c    ',
    trim('     a b c    ') from dual;

-- 실습 문제 1
-- 주민 번호 가리기
select
    '210621-3123456',
    rpad(substr('210621-3123456',1,8),length('210621-3123456'),'*')
    from dual;
    
-- 실습문제 2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 예시 : ward -> wa**, martin -> ma****

select ename,
rpad(substr(ename,1,2),length(ename),'*') as protect 
from emp;
    
-- 실습문제 3
-- 앞글자 하나만 * ename

select ename,
lpad(substr(ename,2),length(ename),'*') as protect 
from emp;

-- 실습문제 4
-- 두번재 글자만 * ename

select ename,
replace(ename, substr(ename,2,1), '*') as second
from emp;

select ename,
substr(ename,1,1) || '*' || substr(ename,3)
from emp;

select ename,
    rpad(rpad(substr(ename,1,1),length(substr(ename,1,1))+1,'*')
    ,length(ename)
    ,substr(ename,3))
from emp;

-- 실습문제 5
-- 가운데 글자만 *

select ename,
    rpad(rpad(substr(ename,1,length(ename)/2),length(substr(ename,1,length(ename)/2+1)),'*')
    ,length(ename)
    ,substr(ename,length(rpad(substr(ename,1,length(ename)/2),length(substr(ename,1,length(ename)/2+2)),'*')))
    )
from emp;




