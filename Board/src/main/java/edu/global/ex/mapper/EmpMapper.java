package edu.global.ex.mapper;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;
import edu.global.ex.vo.Emp_DeptVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<EmpVO> getList();

    List<DeptVO> getDept_EmpList();

    @Select("select * from emp a,dept b where a.deptno = b.deptno")//테스트용 db문이 길어질수있다. 평범한 조인
    List<Emp_DeptVO> getEmp_DeptList();
}
