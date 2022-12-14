package edu.global.ex.vo;


import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Setter//세터 어노테이션
@Getter//게터 어노테이션
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptVO {//Dept 가 부모

    private String deptno;//마이바티스가 오토 박싱 처리해줌
    private String dname;
    private String loc;

    //카디널리티 1대 다 처리 Emp가 자식
    List<EmpVO> empList;

}
