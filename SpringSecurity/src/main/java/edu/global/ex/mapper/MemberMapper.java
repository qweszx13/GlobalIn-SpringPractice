package edu.global.ex.mapper;

import edu.global.ex.VO.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberVO> getMemberList();
}
