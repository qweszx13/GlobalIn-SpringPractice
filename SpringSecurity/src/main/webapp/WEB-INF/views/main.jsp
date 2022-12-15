<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>index</title>
</head>

<body>

<h1>메인 페이지임.</h1>
[<a href="<c:url value="/add/addForm" />">회원가입</a>]
[<a href="<c:url value="/user/userHome" />">유저 홈</a>]
[<a href="<c:url value="/member/memberHome" />">멤버 홈</a>]
[<a href="<c:url value="/admin/adminHome" />">관리자 홈</a>]

</body>
</html>