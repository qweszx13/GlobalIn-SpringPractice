package edu.global.ex.VO;

import lombok.*;

import java.util.List;


/*
이름       널?       유형
-------- -------- -------------
USERNAME NOT NULL VARCHAR2(50)
PASSWORD NOT NULL VARCHAR2(100)
ENABLED           CHAR(1)
* */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO {
    private String username;
    private String password;
    private int enabled;

    private List<AuthVO> authList;

}
