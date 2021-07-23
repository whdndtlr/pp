<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<header id="main_head" class="main_head">
            <div class="header">
			<a href="/index" class="name">Climbing Helper</a>
			    <nav id="main_nav" class="main_nav">		
				    <a href="/location">서울 클라이밍 위치</a>
				    <a href="/training" class="training">트레이닝 종류</a>		
				    <a href="#" class="magazine">매거진</a>
                    <a href="board" class="border">게시판</a>
            <c:if test="${empty id}" >
            <a href="/login">로그인</a>
            </c:if>
            <c:if test="${not empty id}" >
            <a href="/login/logout">로그아웃[${sessionScope.id}]</a>
            </c:if>
    </nav>
    </div>
</header>    