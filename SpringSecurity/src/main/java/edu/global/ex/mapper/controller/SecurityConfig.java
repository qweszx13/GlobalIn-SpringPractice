package edu.global.ex.mapper.controller;

//지금부터 하는거는 시큐리티 설정 클래스 만들기

import edu.global.ex.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration//이 클래스는 설정 파일인것을 알려주고, 부모가 @Componenet + 설정
@EnableWebSecurity//스프링 시큐리티 필터가 스프링 필터체인에 등록됨
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //개발자가 스ㅡ프링 시큐리티 커스텀마이징
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //우선 csrf 설정을 해제해줄것
        //초기 개발자만 해주는게 좋음
        http.csrf().disable();

        http.formLogin();

        http.authorizeHttpRequests()
                .antMatchers("/user/**").hasAnyRole("USER","ADMIN")
                .antMatchers("/admin/**").hasAnyRole("ADMIN")//어드민만 허용
                .antMatchers("/**").permitAll();//그외에 전부 혀용
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //계정하나 생성 프로젝트 테스트용 roles=>권한
//        auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");

        auth.userDetailsService(customUserDetailsService)//->1.loadByUser 호출
                .passwordEncoder(new BCryptPasswordEncoder());

    }

}
