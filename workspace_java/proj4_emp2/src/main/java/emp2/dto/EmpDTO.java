package emp2.dto;

import java.sql.Date;

public class EmpDTO {

    private Integer empno;
    private String ename;
    private String job;
    private Integer mer;
    private Date hireDate;
    private int sal;
    private Integer comm;
    private int deptno;


    public Integer getEmpno() {
        return this.empno;
    }
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public Integer getMer() {
        return mer;
    }
    public void setMer(Integer mer) {
        this.mer = mer;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public Integer getComm() {
        return comm;
    }
    public void setComm(Integer comm) {
        this.comm = comm;
    }
    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    @Override
    public String toString() {
        return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mer=" + mer + ", hiedDate="
                + hireDate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
    }


}