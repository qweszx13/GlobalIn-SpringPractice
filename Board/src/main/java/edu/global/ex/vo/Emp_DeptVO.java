package edu.global.ex.vo;


import lombok.*;

import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp_DeptVO {

    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Timestamp hiredate;
    private String sal;
    private String comm;
    private int deptno;
    //emp 부분끝
    //dept 부분시작
    private String dname;
    private String loc;

}
