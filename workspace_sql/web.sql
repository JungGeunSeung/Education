create table tbl_todo (
     tno number primary key,
     title varchar2(100) not null,
     duedate date not null,
     finished char(1)
);

select * from tbl_todo;

create sequence seq_todo;

insert into tbl_todo (tno, title, duedate, finished)
values (
    seq_todo.nextval, 'test1', '2024-08-13', 'N'
);

insert into tbl_todo (tno, title, duedate, finished)
values (
    seq_todo.nextval, 'test2', '2024-08-14', 'N'
);

insert into tbl_todo (tno, title, duedate, finished)
values (
    seq_todo.nextval, 'test3', '2024-08-14', 'N'
);

select * from tbl_todo;

commit;

create table emp2 as select * from emp;

select * from emp2 where empno = 7369;