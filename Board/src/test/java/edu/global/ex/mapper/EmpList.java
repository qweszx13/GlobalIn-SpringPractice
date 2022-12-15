package edu.global.ex.mapper;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;
import edu.global.ex.vo.Emp_DeptVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmpList {

    @Autowired  // 주입
    private EmpMapper empMapper;

    @Test
    void testList() {
        System.out.println(empMapper);

        List<EmpVO> empVOList = empMapper.getList();

        for (EmpVO emp : empVOList) {
            System.out.println(emp);
        }
    }

    @Test
    void testGetEmpDeptList() {

        List<Emp_DeptVO> vos = empMapper.getEmp_DeptList();

        for (Emp_DeptVO emp : vos) {
            System.out.println(emp);
        }
    }

    @Test
    void testGetDeptEmpList() {

        List<DeptVO> vos = empMapper.getDept_EmpList();

        for (DeptVO dept : vos) {
            System.out.println(dept);
            for (EmpVO emp : dept.getEmpList()) {
                System.out.println(emp);
            }
        }
    }
}