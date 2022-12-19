package edu.global.ex.service;

import edu.global.ex.mapper.MemberMapper;
import edu.global.ex.VO.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class MemberImplement implements MemberService{

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<MemberVO> getMemberList() {

        log.info("getMemberList()..");

        return memberMapper.getMemberList();
    }
}
