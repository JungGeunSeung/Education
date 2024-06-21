-- ���� �ּ�
/* ���� �ּ� */

select 
    * -- ��� �÷�(column)
from --from �ڿ��� ���̺� �̸�
    emp;
    
select 
    empno, ename, deptno -- ��ȸ�ϰ� ���� �÷� ��� 
from 
emp; -- ����Ŭ������ select �� from �� �ڿ���ü

select * from dept;
select * from salgrade;

select deptno from emp;
-- ���� �ٷ� �� ���� ctrl + shift + D

-- distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�
select distinct deptno from emp;
select distinct job from emp;

select distinct deptno, job from emp; -- column�� �������� ��� �ߺ��Ǵ� �����͸� ���� �Ѵ�

-- null �� �����ϸ�, ������ null�� ǥ�õȴ�.
select ename, sal, sal*12+comm, comm from emp;

-- ������ �÷��� �̸�(��Ī)�� ������ִ� ��� -- ��Ī�ȿ� ����� "" �ֵ���ǥ�� ������� �Ѵ�
-- "" �ֵ���ǥ, as ���� ����
select ename, sal, sal*12+comm as annsal, comm from emp;

-------------------------------------------------------------------
-- ���ϴ� ������ ����ϴ� ��� order by
-- �������� : asc ��������
-- �������� : desc
select * from emp 
order by sal;

-- order by ù��° column�� �����ϰ� ���� ������ �ִٸ�  �����ɷ� ����
select * from emp
order by deptno asc, sal desc;

-- ���繮�� 1
select distinct job from emp;

-- ���繮�� 2
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
-- ���ϴ� column�� ���� ����ϴ� ���
select * from emp
where deptno = 30;

-- ���� 1�к��� ����
select * from emp
where empno = 7782;

-- �������� �� ����
select * from emp
where sal >= 2000;

-- table ���� ������ ��� �� '' Ȧ����ǥ�� ������� �Ѵ�
select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'CLERK';

-- �켱���� ������ ()�� ����
select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal <= 3000;

select * from emp
where sal != 3000;
--where sal <> 3000; �� ������ sql���� ���� ����Ѵ�.
--where sal ^= 3000;

select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

// in�� �Բ� not�� ����Ҷ�, �� �̸� �ڿ��� ����.
select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');
----------------------------------------------------------------------

select * from emp
where sal between 2000 and 3000;

----------------------------------------------------------------------
select * from emp
where ename like 'S%'; -- % : S �ڿ� ���� ������ ����

select * from emp
where ename like '_L%'; -- _ : ����̴� ������� �� ���� ���� �����͸� �ǹ��Ѵ�

select * from emp
where ename like '____'; -- ������� ������ ���ϴ� ���ڼ��� �����͸� ��� �� �� �ִ�.

select * from emp
where ename like '%AM%'; -- AM�� ���Ե� ename�� ������ ��� ������ ã��.

select * from emp
where comm <= 400;

select * from emp
where comm is null; -- null�� =(������) �� ���� �ʱ� ������ is null�� ����Ѵ�

select * from emp
where comm is not null;
------------------------------------------------------------------
-- union �� ���� �����ڷ� select���� �����ִµ�,
-- column�� Ÿ�԰� ������ ������ ���ļ� ������ִµ�, �ߺ��� ������ ���·� ��µȴ�
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 20;

-- ���� union all�� �ߺ��� ���� �־ �״�� ����Ѵ�.
select empno, ename, sal, deptno from emp
where deptno = 10
union all
select empno, ename, sal, deptno from emp
where deptno = 10;


-- ���� 125p Q1 ����
select * from emp
where ename like '%S';

-- ���� 125p Q2 ����
select empno, ename, job, sal, deptno from emp
where deptno= 30 and job = 'SALESMAN'
order by empno;

--���� 125p Q3 ����
select  empno, ename, job, sal, deptno from emp
where deptno in (20, 30) and sal > 2000;

-- ���տ����� ���
select  empno, ename, job, sal, deptno from emp
where sal >2000
minus
select  empno, ename, job, sal, deptno from emp
where deptno = 10;

--���� 125p Q4����
select * from emp
where not (sal >= 2000 and sal <=3000);

--���� 126p Q5����
select ename, empno, sal, deptno from emp
where (sal >= 2000 or sal < 1000)
    and deptno = 30 
    and ename like '%E%';
    
--���� 126p Q6����
select * from emp
where comm is null
and mgr is not null
and job in ('MANAGER','CLERK')
and ename not like '_L%';

---------------------------------------------------------
-- �����Լ�
-- upper : �빮�ڷ� ����
-- lower : �ҹ��ڷ� ����
-- initcap : ù���ڸ� �빮�ڷ� ����
select ename, upper(ename), lower(ename), initcap(ename) from emp;

-- ��ҹ��� ���� ���� like�� �˻��Ҷ� ����.
select * from emp
where lower(ename) like lower('%mi%');

------------------------------------------------------------
-- �ش� column�� ���� ���̸� �� �� �ִ�.
select ename, length(ename) from emp;

-- length�� where ���͵� ��ĥ�� �ִ�.
select ename, length(ename) from emp
where length(ename) >= 5;

-- lengthb Byte�� ������ִ� �Լ��̴�.
-- �ѱ��� 3Byte�� �����͸� ��������.
select length('��'), lengthb('��') from dual; -- dual : �⺻���� �����ϴ� ������ ���̺��̴�.


---------------------------------------------------------------
-- ���ڿ� �Ϻθ� �����ϴ� substr �Լ�
-- ù��° �������� : column��
-- �ι��� �������� : ������ ������ ����
-- ����° ��������(��������) : ������ ���� (�����ϸ�, ������ ������ �´�)
select job, 
    substr(job, 1, 2), 
    substr(job, 3, 2), 
    substr(job, 5),
    substr(job, -3, 2), -- -(���̳ʽ�)�� �����ϸ� �ڿ��� ���� �����Ѵ�.
    
    -- ����° �������� ���� �͹��� ���� Ŀ���� ������ �������� �����´�. (������ ����ų� ���� �ʴ´�)
    substr(job, 5, 100),
    length ( lower ( substr ( job, 5, 100 )))
from emp;


----------------------------------------------------------------
-- replace : Ư�����ڸ� �ٸ����ڷ� �ٲٴ� �Լ�
select job,
replace (job, 'A', '*') from emp;


-- ���� job�� ��� ���ڿ� * �ֱ�
select job, 
    length(job),
    length(job)/2,
    substr(job, (length(job)+1)/2, 1),
    replace (job, substr(job, (length(job)+1)/2, 1), '*')
from emp;
----------------------------------------------------------------
-- lpad : left padding
-- rpad : right padding
-- ù��° �������� : ���̸� �Ǵ� ���ڿ�
-- �ι�° �������� : �������� ��ü �ڸ���
-- ����° �������� : �� ������ ä�� ����(��������)

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
-- �� ���ڿ��� ��ġ�� �Լ�
-- concat
select empno || ename || '��' from emp;

-----------------------------------------------------------------
-- �� ���� ������ �����ִ� �Լ� trim
-- ������ �۾� ������ ������ �������� �ʴ´�
select
    '     a b c    ',
    trim('     a b c    ') from dual;

-- �ǽ� ���� 1
-- �ֹ� ��ȣ ������
select
    '210621-3123456',
    rpad(substr('210621-3123456',1,8),length('210621-3123456'),'*')
    from dual;
    
-- �ǽ����� 2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ���� : ward -> wa**, martin -> ma****

select ename,
rpad(substr(ename,1,2),length(ename),'*') as protect 
from emp;
    
-- �ǽ����� 3
-- �ձ��� �ϳ��� * ename

select ename,
lpad(substr(ename,2),length(ename),'*') as protect 
from emp;

-- �ǽ����� 4
-- �ι��� ���ڸ� * ename

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

-- �ǽ����� 5
-- ��� ���ڸ� *

select ename,
    rpad(rpad(substr(ename,1,length(ename)/2),length(substr(ename,1,length(ename)/2+1)),'*')
    ,length(ename)
    ,substr(ename,length(rpad(substr(ename,1,length(ename)/2),length(substr(ename,1,length(ename)/2+2)),'*')))
    )
from emp;




