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
    ) as 실습5
from emp;
---------------------------------------------------------------------------
-- 6월 24일 수업

-- trunc 숫자의 소수점을 표시하는 함수
-- 첫번째 전달인자 : 숫자 또는 테이블 데이터
-- 두번째 전달인자(생략가능) : 표시할 소수점의 위치 (-값으로 하면 정수 자리가 올라간다)
select 
trunc(1234.5678), 
trunc(1234.5678, 2),
trunc(1234.5678, -2),
trunc(-12.34)
from dual;

-- 지정한 숫자와 가까운 정수를 찾는 함수
-- ceil : 입력된 숫자의 가까운 큰정수
-- floor : 입력된 숫자의 가까운 작은 정수
select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

------------------------------------------------------------------------------

-- stsdate : 현재 오라클의 시간이 나온다
-- 선생님 서버에 접속중이므로, 서버시간은 9시간차이난다 (영국 표준 기준 + 9시)
-- 날짜 정보중 일부만 select로 표시됨
select sysdate as now,
    sysdate-1 as yesterday,
    sysdate+1 as tomorrow
    from dual;
    
-- 몇 개월 이후 날짜를 구하는 add_months 함수
-- 첫번째 전달인자 : 날짜데이터
-- 두번째 전달인자 : 더할 개월 수
select sysdate, add_months(sysdate, 3) from dual;


-- 두 날짜 간의 개울 수 차이를 구하는 months_between 함수
-- 첫번째 전달인자 : 날짜 데이터 1
-- 두번째 전달인자 : 날짜 데이터 2


-- 돌아오는 요일, 달의 마지막 날짜를 구하는  next-day, last_day 함수
-- 첫번째 전달인자 : 날짜 데이터
-- 두번째 전달인자 : 요일 문자

-- ★★★ column에 +를 쓰면, 모두 "숫자"로 변경해서 적용한다. ★★★
-- ★★★ column에 \\를 쓰면, 모두 "문자"로 변경해서 적용한다.★★★


-- 날짜, 숫자데이터를 문자 데이터로 변환하는 to_char 함수
-- 첫번째 전달인자 : 날짜데이터
-- 두번째 전달인자 : 출력되길 원하는 문자 형태를 '' 로 감싼다
select to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss'),
       to_char(sysdate, 'yyyy"년"mm"월"dd"일" hh24"시"mi"분"ss"초"')
from dual;

-- 문자데이터를 날짜 데이터로 변환하는 to_date 함수
-- 첫번째 전달인자 : 문자열 데이터
-- 두번째 전달인자 : 인식될 날짜 형태
select sysdate - to_date('2024-05-07', 'yyyy-mm-dd') from dual;

------------------------------------------------------------------------------

-- NULL 처리 함수 ★★★
-- 첫번째 전달인자 : null인지 검사할 데이터 또는 열
-- 두번째 전달인자 : true 일 경우, 반환할 데이터
select sal, comm, nvl(comm, -1) as "null is -1",
       sal+comm ,
       sal+nvl(comm, 0) as "null is 0"
from emp;

-- nvl 활용
select * from emp
where nvl(comm, 0) = 0;


-- NVL2 함수 (오라클에만 있음)
-- 데이터가 null이 아닐때 반환할 데이터를 추가로 지정하는 함수
-- 첫번째 전달인자 : 데이터 또는 열
-- 두번째 전달인자 : null이 아닐때 변환할 값
-- 세번째 전달인자 : null 일때 변환할 값

------------------------------------------------------------------------------

-- 상황에 따라 다른 데이터를 반환하는 decode 함수와 case문
-- decode 첫번째 전달인자 : 대상이 될 데이터 또는 열
--        두번째 전달인자 : 조건
--        세번째 전달인자 : 조건과 일치할때 반환할 결과
--        네번째 이후 전달인자 : 두번째와 세번째의 반복

-- case는 함수가 아니라 문이기 때문에 ()나 ,가 들어가지 않는다
-- case [대상이 될 데이터 또는 열] (선택)
--      when 조건 then 조건과 일치할때 실행문
--      else 위 조건들과 일치하는 경우가 없을때 실행문
--      end
-- case 옆에 대상이 될 데이터를 적지 않으면 when에 비교 연산자로 조건을 줄 수 있다.

select
    case
        when comm is null
        then 'N/A'
        else to_char(comm)
        end as new_comm
from emp;

select comm,
    case
        when comm is null then 0
        when comm = 0 then 0
        when comm > 0 then comm
        end as "new_comm"
from emp;

-- 교재 174p Q2
select empno, ename, sal,
    trunc(sal/21.5, 2) as day_pay,
    round(sal/21.5/8, 1) as time_pay
    from emp;
    
    
-- 교재 175p Q3
select empno, ename, to_char(hiredate, 'yyyy-mm-dd') as hiredate,
    to_char(add_months(hiredate, 3), 'yyyy-mm-dd') as R_date
    from emp;
    
-- 교재 176p Q4
select empno, ename, mgr,
    case
        when mgr like '75%' then 5555
        when mgr like '76%' then 6666
        when mgr like '77%' then 7777
        when mgr like '78%' then 8888
        when mgr like '7_%' then mgr
        when mgr is null then 0000
        end as chg_mgr
from emp;
--------------------------------------------------------------------------- 
--하나의 열에 출력 결과를 담는 다중행 함수
-- 열의 값이 같지 않다면 한번에 표시 할 수 없다.
-- count는 많이 쓴다 *로 사용할시 모든것들의 합을 알려준다.
-- count는 null은 세어주지 않는다
select sum(sal), count(sal), count(*), count(comm) from emp;

-- select 에서 count 를 넣고, where로 필터링 할 수 있다.
select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- 부서번호별 sal 합한값 구하기

select * from emp;

select sum(sal), avg(sal) from emp
where deptno = 10
union all
select sum(sal), avg(sal) from emp
where deptno = 20
union all
select sum(sal), avg(sal) from emp
where deptno = 30;
----------------------------------------------------------------------------
-- 결과값을 원하는 열로 묶어 출력하는 group by 절

-- distinct 처럼 중복을 제거 해줌
-- select 에는 group by된 함수(집계함수)만 들어 갈 수있다.
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
group by deptno, job
order by deptno, job; -- group by 에 있는 column 만 사용할수 있다.

----------------------------------------------------------------------------
--group by 절에 조건을 줄때 사용하는 having 절
-- 집계함수(다중함수)를 조건으로 걸고 싶은 경우에 사용
select deptno, job, avg(sal)
from emp
group by deptno, job
    having avg(sal) > 2000;
    
-- 교재 212p Q1
select deptno,
    trunc(avg(sal)) as avg_sal,
    max(sal) as max_sal,
    min(sal) as min_sal,
    count(deptno) as cnt
    from emp
group by deptno;

-- 교재 212p Q2
    
select job, count(job) from emp
group by job
having count(job) >= 3;
    
-- 교재 212p Q3
select to_char(hiredate, 'yyyy') as hire_date, deptno,
count(deptno)
from emp
group by deptno, to_char(hiredate, 'yyyy');
    