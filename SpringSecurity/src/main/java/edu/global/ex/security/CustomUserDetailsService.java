package edu.global.ex.security;

import edu.global.ex.VO.UserDetailsVO;
import edu.global.ex.VO.UserVO;
import edu.global.ex.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {//2. 여기가 호출 디테일 오버라이딩해라

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {//3.user 정보가 들어가있음 id,pw
        log.warn("Load User By UserVO number: "+username);
        UserVO vo = userMapper.getUser(username);

        log.warn("queried by UserVO mapper: "+ vo);
        return vo == null ? null : new UserDetailsVO(vo);
    }
}
