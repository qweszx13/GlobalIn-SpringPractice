package edu.global.ex.VO;

import lombok.*;
/*
* 이름        널?       유형
--------- -------- ------------
USERNAME  NOT NULL VARCHAR2(50)
AUTHORITY NOT NULL VARCHAR2(50)
* */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthVO {
    private String username;
    private String authority;
}
