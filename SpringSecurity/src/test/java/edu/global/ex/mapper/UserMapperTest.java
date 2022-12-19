package edu.global.ex.mapper;

import edu.global.ex.VO.UserVO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Disabled
    @Test
    void testGetUser() {
        UserVO user = userMapper.getUser("user");
        System.out.println(user);
    }


    //암호화 안했을때 인서트
    @Disabled
    @Test
    void testInsertUser() {

        UserVO user = new UserVO();
        user.setUsername("john");
        user.setPassword("john");
        user.setEnabled(1);

        userMapper.insertUser(user);
        userMapper.insertAuthorities(user);

        System.out.println(user);
    }

    //암호화 했을때 인서트
    @Disabled
    @Test
    void testInsertUser2() {

        UserVO user = new UserVO();
        user.setUsername("john2");
        user.setPassword(new BCryptPasswordEncoder().encode("john2"));//암호화 Encode부분 decode는 matches
        user.setEnabled(1);

        userMapper.insertUser(user);
        userMapper.insertAuthorities(user);

        System.out.println(user);
    }
    @Test
    void testCheckJohn2() {
        UserVO user = userMapper.getUser("john2");
        System.out.println(user);

        boolean isPass = new BCryptPasswordEncoder().matches("john",user.getPassword());
        //비밀번호가 맞는지 확인만 하는작업이지 비밀번호를 직접적으로 가져오는 작업이아님
        System.out.println(isPass);
    }

}
