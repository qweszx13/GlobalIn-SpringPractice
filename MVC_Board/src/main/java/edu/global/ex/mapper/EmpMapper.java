package edu.global.ex.mapper;

import edu.global.ex.vo.EmpVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    public List<EmpVO> getList();
}
