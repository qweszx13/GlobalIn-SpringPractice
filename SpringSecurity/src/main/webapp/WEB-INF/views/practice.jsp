<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>practice</title>
</head>
<body>
<table width="500" border="1">
    <tr>
        <td>번호</td>
        <td>이름</td>
        <td>전화번호</td>
        <td>주소</td>
        <td>등급</td>
    </tr>

    <!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
    <!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
    <c:forEach var="board" items="${memberBoard}">
        <tr>
            <td>${board.c_no}</td>
            <td>${board.c_name}</td>
            <td>${board.phone}</td>
            <td>${board.address}</td>
            <td>${board.grade}</td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="5"> <a href="write_view">글 작성</a></td>
    </tr>
</table>
</body>
</html>
