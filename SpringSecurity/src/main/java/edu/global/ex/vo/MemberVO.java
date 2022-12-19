package edu.global.ex.VO;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor//  전체생성자
@NoArgsConstructor//  기본생성자
//@Data 도있긴함
public class MemberVO {
    private int c_no;
    private String c_name;
    private String phone;
    private String address;
    private String grade;
}
