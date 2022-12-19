<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>로그인 페이지</title>
</head>

<body onload="document.f.id.focus();">

<h3>아이디와 비밀번호를 입력해주세요.</h3>
<%--절대경로 설정--%>
<%--HTTP://localhost:8281/context명 + /login--%>
<c:url value="/login" var="loginUrl" />
<p>${loginUrl}</p>

<!-- http://localhost:8282/login?error -->

<form:form name="f" action="${loginUrl}" method="POST">
    <c:if test="${param.error != null}">
        <p>아이디와 비밀번호가 잘못되었습니다.</p>
    </c:if>
    <c:if test="${param.logout != null}">
        <p>로그아웃 하였습니다.</p>
    </c:if>
    <p>
        <label for="username">아이디</label>
        <input type="text" id="username" name="username" />
            <%--
            username 과 password 는 꼭 맞춰줘야함 그러기 싫으면 http.formLogin().username
            Parameter("바꿀 유저네임").passwordParameter("바꿀 비밀번호")를 설정해야함
            --%>
    </p>
    <p>
        <label for="password">비밀번호</label>
        <input type="password" id="password" name="password"/>
    </p>
    <!--csrf(cross site request forgery(위조)) 란? 사이트간 요청 위조 피싱을 활용해 사용자 모르게 해스워드 변경 -->
    <!--32bit,64bit 암호를 post요청이왔을때 심어준다. 이 암호는 서버가 직접만든 암호로
    해커가 불특정 접근을 해도 csrf의 코드번호를 알수없고 심어준 csrf가 없는 접근시도는 무시하게된다.
    -->
<%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />--%>
    
    <button type="submit" class="btn">로그인</button>
</form:form>
<%--formform 태그를 달면 알아서 csrf를 달아주게된다.--%>

</body>
</html>