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



