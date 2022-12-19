<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>index</title>
</head>

<body>

<h1>유저 페이지임.</h1>

<sec:authorize access="isAuthenticated()">
    <p>principal: <sec:authentication property="principal"/></p>
    <p>principal: <sec:authentication property="principal.username"/> 님 환영합니다</p>
</sec:authorize>

</body>
</html>