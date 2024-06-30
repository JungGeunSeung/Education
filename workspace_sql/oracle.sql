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
    ) as �ǽ�5
from emp;
---------------------------------------------------------------------------
-- 6�� 24�� ����

-- trunc ������ �Ҽ����� ǥ���ϴ� �Լ�
-- ù��° �������� : ���� �Ǵ� ���̺� ������
-- �ι�° ��������(��������) : ǥ���� �Ҽ����� ��ġ (-������ �ϸ� ���� �ڸ��� �ö󰣴�)
select 
trunc(1234.5678), 
trunc(1234.5678, 2),
trunc(1234.5678, -2),
trunc(-12.34)
from dual;

-- ������ ���ڿ� ����� ������ ã�� �Լ�
-- ceil : �Էµ� ������ ����� ū����
-- floor : �Էµ� ������ ����� ���� ����
select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

------------------------------------------------------------------------------

-- stsdate : ���� ����Ŭ�� �ð��� ���´�
-- ������ ������ �������̹Ƿ�, �����ð��� 9�ð����̳��� (���� ǥ�� ���� + 9��)
-- ��¥ ������ �Ϻθ� select�� ǥ�õ�
select sysdate as now,
    sysdate-1 as yesterday,
    sysdate+1 as tomorrow
    from dual;
    
-- �� ���� ���� ��¥�� ���ϴ� add_months �Լ�
-- ù��° �������� : ��¥������
-- �ι�° �������� : ���� ���� ��
select sysdate, add_months(sysdate, 3) from dual;


-- �� ��¥ ���� ���� �� ���̸� ���ϴ� months_between �Լ�
-- ù��° �������� : ��¥ ������ 1
-- �ι�° �������� : ��¥ ������ 2


-- ���ƿ��� ����, ���� ������ ��¥�� ���ϴ�  next-day, last_day �Լ�
-- ù��° �������� : ��¥ ������
-- �ι�° �������� : ���� ����

-- �ڡڡ� column�� +�� ����, ��� "����"�� �����ؼ� �����Ѵ�. �ڡڡ�
-- �ڡڡ� column�� \\�� ����, ��� "����"�� �����ؼ� �����Ѵ�.�ڡڡ�


-- ��¥, ���ڵ����͸� ���� �����ͷ� ��ȯ�ϴ� to_char �Լ�
-- ù��° �������� : ��¥������
-- �ι�° �������� : ��µǱ� ���ϴ� ���� ���¸� '' �� ���Ѵ�
select to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss'),
       to_char(sysdate, 'yyyy"��"mm"��"dd"��" hh24"��"mi"��"ss"��"')
from dual;

-- ���ڵ����͸� ��¥ �����ͷ� ��ȯ�ϴ� to_date �Լ�
-- ù��° �������� : ���ڿ� ������
-- �ι�° �������� : �νĵ� ��¥ ����
select sysdate - to_date('2024-05-07', 'yyyy-mm-dd') from dual;

------------------------------------------------------------------------------

-- NULL ó�� �Լ� �ڡڡ�
-- ù��° �������� : null���� �˻��� ������ �Ǵ� ��
-- �ι�° �������� : true �� ���, ��ȯ�� ������
select sal, comm, nvl(comm, -1) as "null is -1",
       sal+comm ,
       sal+nvl(comm, 0) as "null is 0"
from emp;

-- nvl Ȱ��
select * from emp
where nvl(comm, 0) = 0;


-- NVL2 �Լ� (����Ŭ���� ����)
-- �����Ͱ� null�� �ƴҶ� ��ȯ�� �����͸� �߰��� �����ϴ� �Լ�
-- ù��° �������� : ������ �Ǵ� ��
-- �ι�° �������� : null�� �ƴҶ� ��ȯ�� ��
-- ����° �������� : null �϶� ��ȯ�� ��

------------------------------------------------------------------------------

-- ��Ȳ�� ���� �ٸ� �����͸� ��ȯ�ϴ� decode �Լ��� case��
-- decode ù��° �������� : ����� �� ������ �Ǵ� ��
--        �ι�° �������� : ����
--        ����° �������� : ���ǰ� ��ġ�Ҷ� ��ȯ�� ���
--        �׹�° ���� �������� : �ι�°�� ����°�� �ݺ�

-- case�� �Լ��� �ƴ϶� ���̱� ������ ()�� ,�� ���� �ʴ´�
-- case [����� �� ������ �Ǵ� ��] (����)
--      when ���� then ���ǰ� ��ġ�Ҷ� ���๮
--      else �� ���ǵ�� ��ġ�ϴ� ��찡 ������ ���๮
--      end
-- case ���� ����� �� �����͸� ���� ������ when�� �� �����ڷ� ������ �� �� �ִ�.

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

-- ���� 174p Q2
select empno, ename, sal,
    trunc(sal/21.5, 2) as day_pay,
    round(sal/21.5/8, 1) as time_pay
    from emp;
    
    
-- ���� 175p Q3
select empno, ename, to_char(hiredate, 'yyyy-mm-dd') as hiredate,
    to_char(add_months(hiredate, 3), 'yyyy-mm-dd') as R_date
    from emp;
    
-- ���� 176p Q4
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
--�ϳ��� ���� ��� ����� ��� ������ �Լ�
-- ���� ���� ���� �ʴٸ� �ѹ��� ǥ�� �� �� ����.
-- count�� ���� ���� *�� ����ҽ� ���͵��� ���� �˷��ش�.
-- count�� null�� �������� �ʴ´�
select sum(sal), count(sal), count(*), count(comm) from emp;

-- select ���� count �� �ְ�, where�� ���͸� �� �� �ִ�.
select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- �μ���ȣ�� sal ���Ѱ� ���ϱ�

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
-- ������� ���ϴ� ���� ���� ����ϴ� group by ��

-- distinct ó�� �ߺ��� ���� ����
-- select ���� group by�� �Լ�(�����Լ�)�� ��� �� ���ִ�.
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
group by deptno, job
order by deptno, job; -- group by �� �ִ� column �� ����Ҽ� �ִ�.

----------------------------------------------------------------------------
--group by ���� ������ �ٶ� ����ϴ� having ��
-- �����Լ�(�����Լ�)�� �������� �ɰ� ���� ��쿡 ���
select deptno, job, avg(sal)
from emp
group by deptno, job
    having avg(sal) > 2000;
    
-- ���� 212p Q1
select deptno,
    trunc(avg(sal)) as avg_sal,
    max(sal) as max_sal,
    min(sal) as min_sal,
    count(*) as cnt
    from emp
group by deptno;

-- ���� 212p Q2
    
select job, count(job) from emp
group by job
having count(job) >= 3;
    
-- ���� 212p Q3
select to_char(hiredate, 'yyyy') as hire_date, deptno,
count(deptno)
from emp
group by deptno, to_char(hiredate, 'yyyy');
    
    
---------------------------------------------------------------------------
-- 6�� 25�� ����

/* SQL�� ���� ���� */
/* 5 */select job, count(*) cnt
/* 1 */from emp
/* 2 */where sal > 1000
/* 3 */group by job
/* 4 */having count(*) >=3
/* 6 */order by cnt desc;

-- emp�� 14��, dept�� 4���̶� ���Ǿ��� ����ϸ�, ���̺���� ��� ������ �������� ��� �ȴ�.
-- �� �̹����� emp�� dept�� ������ �� 56���̰�, ���̺��� �þ�� �þ� �� ����, ���ϱ޼�������
-- ������ �þ�� ������, �����ؾ� �Ѵ�.
select * from emp, dept
order by empno;

-- �����
-- ���̺� �ΰ� �̻� ��ȸ�Ҷ� ���踦 �� �˷���� ���ϴ� ������ ����Ҽ� �ִ�
-- ��ü ���̺� �� -1���� ������ ���������̴�
select * from emp, dept
where emp.deptno = dept.deptno
order by empno;

-- ���̺��� ���� �پ��⿡�� ������ ���� �ɸ��� ������, ��Ī�� ������ش�.
-- ��κ� ���̺��� �� �ձ��ڸ� ����, �ߺ��ȴٸ� 2���ڱ��� ��Ī���� ����� ����� �� �ִ�
-- �ѹ� ��Ī�� �����ϸ�, �̸� ��ü�� �ٲ�°Ͱ� �����ϱ� ������, ���� ��Ī�� ��� �� �� ����.
-- ���̺�� �÷����� �ٸ��� as�� '',"" �� ��� �� �� ����.
select *
from emp e, dept d
where e.deptno = d.deptno;

-- select���� *�� �ٸ� �÷����� ȥ���Ҷ��� ���̺��� ����(���̺��.*) �ؾߵȴ�.
select *
from emp e, dept d
where e.deptno = d.deptno;

-- �ǹ������� *�� �� �����ʴ´�, �׷��� ��� �÷����� �ÿ�����.

-- �޿� ��� ���̺�
select * from salgrade;

-- ������
-- ���̺��� 3���̱� ������ ������ 2�� �̻� ����� ���.
select * from emp, dept, salgrade
where emp.deptno = dept.deptno
    and emp.sal >= salgrade.losal
    and emp.sal <= salgrade.hisal;

-- ��ü����
-- ���̺� �ȿ� ��ġ�ϴ� �����Ͱ� ������ from���� ���� ���̺��� �ι� �̻� �����Ͽ� ������ �ɾ��ִ� ���ι��

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno;

-- natural join �ǹ����� �� ������ �ʴ´�

-- join using
-- ���� ������� ����ϴ� ���ι��
-- using���� ���� ���̺� ���� �÷����� �ִ� ��츸 �� �� �ִ�.
select * from emp join dept using (deptno);

-- join on
-- ���� ���뼺 �ִ� where���� �ִ� ���ǽ��� on �ڿ� ���� ���ִ�.
select * from emp join dept on (emp.deptno = dept.deptno);

select * from emp e1 join emp e2 on (e1.mgr = e2.empno); -- = ��� ������� �� �ֱ� ������ null �� ������

-- �ܺ�����
-- ���̺� null ���� �������� ����������, �������� ��µ��� �ʴ´� ���� ���������� ����ϰ� �ϴ� ���
-- �� �ִµ�, �װ� �ܺ������̶�� �Ѵ�.
-- ����ؾ� �ϴ� ���� ����ִ� ���̺� �ݴ뿡 �ִ°��� �Ϲ����̴�.
-- �ܺ������� �¿�� ������ �����ϴµ� where���� ���� ���� ���� ���ʿ� (+) ��ȣ�� �ٿ� �ݴϴ�.

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno(+);

-- outer join
-- �ܺ����ο� ����ϰ� where���� �ƴ� from ���� �����Ѵ�.
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1 left outer join  emp e2 on ( e1.mgr = e2.empno);

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1 right outer join  emp e2 on ( e1.mgr = e2.empno);

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1 full outer join  emp e2 on ( e1.mgr = e2.empno);

-- �������� ���ֽ� ���� quiz1
-- empno, ename, dname, loc ��� : 14��

--where �����
select emp.empno, ename, dname, loc
from emp, dept
where emp.deptno = dept.deptno;
-- join ���
select emp.empno, ename, dname, loc
from emp join dept using (deptno);


-- �������� ���ֽ� ���� quiz2
-- ���, �̸�, �μ���, �޿������ ��� : 14��

--where �����
select empno, ename, dname, grade
from emp, dept, salgrade
where emp.deptno = dept.deptno
    and emp.sal >= salgrade.losal
    and emp.sal <= salgrade.hisal;
-- join ���
select empno, ename, dname, grade
from emp join dept using (deptno)
         join salgrade on (emp.sal >= salgrade.losal and emp.sal <= salgrade.hisal);

-- �������� ���ֽ� ���� quiz3
-- �Ŵ��� ���� ������ ���� ����� �̸�, �޿�, �Ŵ����̸�, �Ŵ����޿� �� ���
--e1.ename, e1.sal, e2.ename, e2.sal
select e1.ename, e1.sal, e1.mgr, e2.empno, e2.ename as mgr_name, e2.sal as mgr_sal
from emp e1 join emp e2 on (e1.mgr = e2.empno and e1.sal > e2.sal);

-- ���� 239p Q1
select emp.deptno, dname, empno, ename, sal
from emp, dept
where emp.sal > 2000
    and emp.deptno = dept.deptno
order by emp.deptno;

-- join ���
select deptno, dname, empno, ename, sal
from emp join dept using (deptno)
where emp.sal > 2000
order by deptno;

-- ���� 239p Q2
select emp.deptno, dname, trunc(avg(emp.sal)) avg_sal, max(emp.sal) max_sal, min(emp.sal) min_sal, count(emp.deptno) cnt
from  emp, dept
where emp.deptno = dept.deptno
group by emp.deptno, dname
order by deptno;

-- join ���

select deptno, dname, trunc(avg(emp.sal)) avg_sal, max(emp.sal) max_sal, min(emp.sal) min_sal, count(deptno) cnt
from  emp join dept using (deptno)
group by deptno, dname
order by deptno;



-- ���� 239p Q3
select dept.deptno, dname, empno, ename, job, sal
from  emp full outer join dept on (emp.deptno = dept.deptno)
order by deptno, ename;

select * from dept;

-- ���� 239p Q4
select d.deptno, d.dname, e1.empno, e1.ename, e1.mgr, e1.sal, d.deptno mgr_deptno, s.losal, s.hisal, s.grade, e2.empno mgr_empno, e2.ename mgr_ename 
from emp e1 join emp e2 on(e1.mgr = e2.empno) 
            right outer join dept d on (e1.deptno = d.deptno) 
            left outer join salgrade s on (e1.sal >= losal and e1.sal <= hisal)
order by d.deptno, e1.empno;

---------------------------------------------------------------------------
-- ���� ����

-- jones ���� ���� ������ �޴� �����
select * 
    from emp
    where sal > ( select sal
                    from emp 
                    where ename = 'JONES');

-- blake ���� ���� ������ �޴� �����
select * 
    from emp
    where sal > ( select sal
                    from emp 
                    where ename = 'BLAKE');

-- ȸ���� ��� �������� ���� �޴� �����
select *
    from emp
    where sal > ( select avg(sal) from emp);


-- jone �� ���� job�� ������ �ִ� �����
select * 
from emp
where job = ( select job
                from emp 
                where ename = 'JONES');
                
-- ���� ����� �������� ������ ���� ����
-- in : ���� ������ �����Ͱ� ���������� ����� �ϳ��� ��ġ�ϸ� true
-- any, some : ���� ������ ���ǽ��� �����ϴ� ���� ������ ����� �ϳ� �̻��̸� true
-- all : ���������� ���ǽ��� ��� �����ϸ� true
-- exists : ���� ������ ����� �����ϸ� (true boolean ���� ����)


select * from emp
where sal in (
select max(sal) from emp group by deptno);

----------------------------------------------------------------------
-- 6�� 26�� ����
-- from���� ����ϴ� ���������� with��
-- from���� ����ϴ� ���������� �ζ��κ�(inline view)��� �Ҹ���

select * from emp where deptno =10;

select * from (select * from emp where deptno =10);

-- ���̺� column���� ���� ���� ������, ��ȸ�� ������� ��ȣ�� �ο����ִ� rownum
select rownum, emp.* from emp
-- where�� ���̺� ������ �ϳ��ϳ� ��ȸ�ϱ� ������, �Ź� rownum�� ��ȣ�� 1������ �����Ǳ� ������,
-- where�� rownum�� ������ �ɼ� ����.
--where rownum = 4;

-- order by�� ���� �������� �����ϱ⶧���� rownum�� ���ڰ� ���׹��׵ȴ�.
order by ename;

-- ���� order by�� ������� rownum�� �����ϰ� ������, order by�� �ӽ����̺��� from ���� ������ �־ ����Ѵ� 
select rownum, e.* 
from (
    select *from emp order by ename
) e ;


select * from(
select job, count(*) cnt from emp
group by job)
where cnt >= 3; -- where������ count(*)�� ���� �ʱ� ������, ��Ī�� �־��ְ� ��ߵȴ�.

-- with �� ����ϱ�
-- select ���� ���� ������ �ϸ�, ��Ī�� as�� ���� ���� ()���� �ȿ� select���� �����ش�
-- ��ư� ���̴µ�, with�� ���ȣ���� �����ϴ�

with e10 as (select * from emp where deptno = 10)
select * from e10;



-- select���� ����ϴ� ��������
-- ��Į�� ����������� �θ��� select���� "�ϳ��� �� ����"���μ� ����� ����� �� �ִ�
-- ��Į�� : ��(����) �ݴ�- ����



-- ���� 262p Q1
select job, empno, ename, sal, emp.deptno, dname from emp, dept
where job =
 (select job from emp where ename = 'ALLEN')
 and emp.deptno = dept.deptno;

-- ���� 262p Q2
select empno, ename, dname, hiredate, loc, sal, grade from emp, dept, salgrade
where sal > (select avg(sal) from emp)
and emp.deptno = dept.deptno
and (sal >= losal and sal <= hisal)
order by sal desc, ename;

-- ���� 263p Q3
select empno, ename, job, deptno, dname, loc
from emp join dept using (deptno)
where deptno = 10 and job not in(select job from emp where deptno = 30);


-- ���� 263p Q4
select empno, ename, sal, grade from emp, salgrade
where sal > (select max(sal) from emp where job='SALESMAN') 
and (sal >= losal and sal <= hisal)
order by empno;
-------------------------------------------------------------------------------
-- DDL(data definition language ) : ������ ���Ǿ� - �����ͺ��̽��� �����ϰ� �����ϱ�
-- ���� �����Ǵ� ���� ��ü�� ����,����,���� ���� ����� ����.
-- ���̺��� ������ �����ϰ� �����ϴ� create, alter, drop�� �ִ� (�ڵ����� commit �ȴ�)

-- ���̺��� �����ϴ� create
-- ���� ��� : create table ���� ����.���̺��̸� (
-- ���̸�, �� �ڷ���)
create table emp_ddl (
    empno number(4),     --4������ �ƴ϶� 4�ڸ����� �ǹ�
    ename varchar2(10),     --10Byte�� �ǹ��Ѵ�
    job varchar2(9),    -- 9Byte�� �ǹ��ϰ�, ���Ѻ��� ���� �۾��� ������ ���ڼ���ŭ�� �뷮�� �����Ѵ�.
    mgr number(4),
    hiredate date,
    sal number(7,2), -- �ι�° �������ڴ� �Ҽ����� �ǹ�
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;

create table dept_ddl
as select * from dept;

select * from dept_ddl;

create table emp_ddl_30
as select empno, ename, sal from emp where deptno =30;

select * from emp_ddl_30;
-----------------------------------------------------------------------
-- alter ���̺��� �����ϴ� ��
-- �Ӽ� : add �÷�+Ÿ���߰�
-- rename : �÷��� ����
-- modify : �÷� Ÿ�� ����
-- drop : �÷� ����
create table emp_alter
as select * from emp;

select * from emp_alter;

-- alter table ���̺� �̸� add ���̸� ��Ÿ��
alter table emp_alter
add hp varchar2(20);

select * from emp_alter;

-- rename column ���� ���� ���̸��� �����Ҽ� �ִ�
alter table emp_alter
rename column hp to tel;

select * from emp_alter;

-- modify ���̸� Ÿ�� : ���� Ÿ���� ���� �Ҽ� �ִ�.
alter table emp_alter
modify empno number(5);

-- Ÿ���� ����(Byte)�� Ŀ���°� ����������, �ٽ� ���̴� �� �Ұ����ϴ�
-- ���� ���� empno�� number(5)�� �÷ȱ� ������, �ؿ� number(4)�� ���̴°� �Ұ����ϴ�
-- ��TIP!! - �÷��� �ϳ� �����, as select�� �ű���� ���� �÷��� �����, �� �÷��� �ٽ� ������ ���� �Ѵ��� �ٽ� �ű��
alter table emp_alter
modify empno number(4);


-- ���� �����ϴ� drop
alter table emp_alter
drop column tel;

alter table emp_alter
drop column comm;

select * from emp_alter;

-- ���̺� �̸��� �����ϴ� rename
-- rename ���̺�� to �ٲ� ���̺��
-- �ǹ� : �߿� ���� �ʴ� (��Ÿ ���� �� �ȹٲ۴ٰ� �Ѵ�)
rename emp_alter to emp_rename;

select * from emp_rename;

-- ���̺��� �����͸� �����ϴ� truncate ( column�� �����ִ� )
-- rollback�� ���� �ʴ´�

truncate table emp_rename;

-- ���̺� ��ü�� �����ϴ� drop
-- rollback�� ���� �ʴ´�
drop table emp_rename;

-------------------------------------------------------------------------
-- �����͸� �߰�, ����, �����ϴ� ������ ���۾�
create table dept_temp
as select * from dept;

select * from dept_temp;

-- ���̺� �����͸� �߰��ϴ� insert
-- insert into ���̺�� [(���̸�1, ���̸�2, ...)] values (��1�� �� ������, ��2�� �� ������ ...)
insert into dept_temp (deptno, dname, loc)
values (50, 'DATEBASE', 'SEOUL');


-- ���̺�� �ڿ� ()�� ���� �����ϴ� �����ϸ� ���̺� ��ü ���� values�� ���� �־���� �Ѵ�
insert into dept_temp
values (60, 'NETWORK', 'BUSAN');

-- ''������ �ʰ� null�� �Է��ϸ�, (null)�� �ȴ�.
insert into dept_temp
values (70, 'WEB', null);

-- �ƹ��͵� �����ʰ� ''�θ� �����ָ� null�� ǥ�ð� ����������, �ڹٿ����� �������� �ʱ� ������ null�� �����ִ°� ����.
insert into dept_temp
values (80, 'MOILE', '');

-- null�� �Ͻ��� �Է�
-- �� �����͸� ���� �ʴ� ������� null �������Է��ϱ�
-- ���̺� �ڿ� ���̸��� �ְ�, ���� ���� ���� �߰��Ҵ� null�� ǥ�õǰ� �Ѵ�.
insert into dept_temp (deptno, loc)
values (90, 'INCHEON');

select * from dept_temp;

------------------------------------------------------------------------------
-- 6�� 27�� �����
-- ���̺� ��¥ ������ �Է��ϱ�
-- yyyy/mm/dd ���·� �Է��� ����������, yyyy-mm-dd ������ �Էµ� �����ϴ�
create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp
values (9999, 'ȫ�浿', 'PRESIDENT', null, '2001/01/01', 5000, 1000, 10);

-- ��¥�� �����ؼ� �Է��� ��� �ð��� ������ �ȴ�.
insert into emp_temp
values (1111, '������', 'MANAGER', 9999, '2001-01-05', 4000, null, 20);

-- ��¥ �����͸� �Է��� �� ������
-- ��/��/�� ������ �ݴ�� ��/��/�� ������ �����͸� �Է��ϸ� ������ �߻��ϰ� �����Ͱ� �Էµ��� �ʴ´�.
-- ������ ����Ŭ�� ��ġ�Ǿ��ִ� ��礷ü���� ������ �⺻ ���� ���� ��¥ ǥ������ �ٸ��� �����̴�.

-- �̷��� to_date�� ����ϴ°��� �Ϲ����̴�
insert into emp_temp
values (2111, '�̼���', 'MANAGER', 9999, to_date('07/01/2001', 'dd/mm/yyyy'), 4000, null, 20);

-- sysdate�ε� �Է��� �����ϴ�
insert into emp_temp
values (3111, '��û��', 'MANAGER', 9999, sysdate, 4000, null, 30);

-- ���������� �̿��ؼ� ���̺� �߰� �� �� �ִ�.
-- �� �� �̸��� �����Ͱ��� ���� �Ǿ� �ִ�
insert into emp_temp
select * from emp where deptno=10;

select * from emp_temp
order by empno;

---------------------------------------------------------------------------
-- ���̺� �ִ� ������ �����ϱ�
-- update [������ ���̺�]
-- set [������ ��1]=[������], [������ ��2]=[������] ...
-- where �����͸� ������ ��� ���� �����ϱ� ���� ����

create table dept_temp2
as select * from dept;

select * from dept_temp2;

-- ������ ���� ������, LOC �÷��� ��� �����Ͱ� �ٲ��
update dept_temp2
set loc = 'SEOUL';

-- ������ ������ �ǵ����� ������
rollback;

update dept_temp2
set dname = 'DATABASE',
    loc = 'SEOUL'
where deptno = 40;

-- �ǹ� �� : update�� ���� 1.�����ϰ��� �ϴ� ���̺��� select�Ѵ�.
--                       2. where ������ �����ϰ� �����.
--                       3. �״��� update �Ѵ�.

---------------------------------------------------------------------------
-- ���̺� �ִ� ������ �����ϱ�
-- delete [from] ���̺� �̸�
-- where [������ ����� �����ϴ� ���ǽ�]

create table emp_temp2
as select * from emp;

select * from emp_temp2;

select * from emp_temp2
where job = 'MANAGER';

delete emp_temp2
where job = 'MANAGER';

-- �������� ���ֽ� ���� emp_temp2���� �޿��� 1000������ �޿��� 3% �λ��Ͽ� ����϶�
select * from emp_temp2
where sal <= 1000;

update emp_temp2
set sal = sal * 1.03
where sal <= 1000;

-- �ƻ� �ް� ��޷���, ����ī ������ �̷�. ������ ���䰡 ��Ű��Ű �Ʒ�. ������Ÿ ����� ���޿� ������ ������ �ټ�����.
-- Ÿ��.. Ÿ��.. ����ī�� Ű���� �ø��� ��ī�� ���ɰ� ���ڸ��� ī��� ������ ���ڷ�
-- ������ ������ �丮��ī���׳�� Ÿ�� �Ƴ���ī��.. �Ƴ��� �Ҷ� ��Ÿ �� �ҷ��� ���絥 ���絥 ���޳� �ɽ�Ű�� ���
-- Ÿ�� ��Ÿ����� ��������� ������ ���..

----------------------------------------------------------------------
-- �ϳ��� ������ �����͸� ó���ϴ� Ʈ�����(transaction)
-- Ʈ�����(transaction) : ���̻� ������ �� ���� �ּ� ���� ������ ���Ѵ�
-- ALL or NOTING
-- Ʈ������� �����ϱ� ���� ����ϴ� ��ɾ� TCL(transaction control language)
-- �� DBver : commit�� �ڵ����� �ٷ� �ȴ� (�������� ���� �ִ�)
----------------------------------------------------------------------
-- �����ͺ��̽��� ���� ������ ����
-- ������ ����(Data dictionary)


select * from dict;
select * from user_tables; -- ���� ���� ���̺��� �� �ϳ��� ���̺�� ����� ����Ѵ�

-- �ε��� index ���� ������ �˻� ������ ����� ���� ���̺� ���� ����ϴ� ��ü�� ���Ѵ�
-- ��������, ���������� ���� ���� �ȴ�
create index idx_emp_sal
on emp( sal );
select * from user_indexes;

drop index idx_emp_sal;
-- �Ʒ� �ּ��� ������Ʈ
select /*+ index(idx_emp_sal) */ 
* from emp order by sal;

-- plan
-- sql developer ������ ��� ����° ������(F10) "��ȹ����"
-- ����Ŭ�� ��ȸ�� ������ ���°�
-- �����ϱ� ���� �����ʹ� �ð��� �ٸ��� ������, �̸� ��ȹ�� ¥�� ��
-- cost : ��� - ��ȸ�ϴµ��� �־ ���� �ð��� ��� 50���ϴ� ������

-- view : ���� ���̺�(view)�� �θ��� ��� �ϳ��̻��� ���̺��� ��ȸ�ϴ� select�� ������ ��ü
-- ��� ���� : ����-select���� ���⵵�� �����ϱ� ����, ���ȼ� - ���̺��� Ư�� ���� �����ϰ� ���� ���� ���

-- ������ (sequence)
-- ����Ŭ �����ͺ��̽����� Ư�� ��Ģ�� �´� ���� ���ڸ� �����ϴ� ��ü

select (max(empno)+1) from emp_temp2;

insert into emp_temp2 (
    empno, ename
    )
    values (
        (select (max(empno)+1) from emp_temp2)
        ,'����'
    );

select * from emp_temp2;

create table tb_user ( 
    user_id number,
    user_name varchar2(30)
);

select * from tb_user;

create sequence seq_user; --������ �̸�
--    increment by 10 -- ������ ��
--    start with 10 -- ���� ��
--    maxvalue 90 -- ������ �ִ�
--    minvalue 0 -- ������ �ּڰ�
--    nocycle -- �ִ񰪿� ���������� cycle�̸� �ٽ� �ּҰ����� ����, nocycle�̸� �ߴ�
--    cache 2; -- ������ ��ȣ�� �޸𸮿� �̸� �Ҵ��� ���� ���� ����

-- ������ �������� ��ȸ�Ҷ����� �ö󰡴� nextval
select seq_user.nextval from dual;

-- ������ �������� ���� ���� ���� currval
select seq_user.currval from dual;

-- insert�� ��ȣ�� �˾Ƽ� �����ϰ� �Ѵ�
-- �ѹ� �ö� ���ڴ� ���� ������.
insert into tb_user
values (seq_user.nextval, '������1');
insert into tb_user
values (seq_user.nextval, '������2');
select * from tb_user;