<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    		<meta charset="UTF-8">
        <link rel="stylesheet" href="../../css/main.css">
    </head>
    <body>
        <div class="notic">
        		<c:forEach var="n" items="${AnoList}">
        			<p>${n.context}</p>
        		</c:forEach> 
        </div>
        <h1 class="logo"><a href="./main.html">그림 일기</a></h1>
        <a class="idstyle" href="../user/find_diary.html">익명 꺼</a>
        <!--지금까지 그려진 그림들이 넘어가면 재미있을 듯-->
        <div class="mayimg">
            <img>
        </div>
        <div class="butline">
            <div class="but"><a href="../user/write_diary.html">일기 쓰기</a></div>
            <div class="space50vw"></div>
            <div class="but"><a href="../user/diary_month.html">일기 보기</a></div>
        </div>
        <div class="but2"><a href="../user/diary_random.html">다른 일기 보러가기</a></div>
    </body>
</html>