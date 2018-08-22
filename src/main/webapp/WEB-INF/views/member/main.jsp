<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<jsp:include page="../common/header.jsp" />
<body>
	<div id="wrapper">
		<div id="header">
			<c:choose>
				<c:when test="${log eq 'login'}">
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
		</div>	
		<div id="content">
		이동페이지 : ${pagename}
			<c:choose>
				<c:when test="${pagename eq 'main'}">
				</c:when>
				<c:when test="${pagename eq 'add'}">
					<jsp:include page="add.jsp"/>
				</c:when>
				<c:when test="${pagename eq 'login'}">
					<jsp:include page="login.jsp"/>
				</c:when>
				<c:when test="${pagename eq 'search'}">
					<jsp:include page="search.jsp"/>
				</c:when>
				<c:when test="${pagename eq 'retrieve'}">
					<jsp:include page="retrieve.jsp"/>
				</c:when>
				<c:when test="${pagename eq 'remove'}">
					<jsp:include page="remove.jsp"/> 
				</c:when>
				<c:when test="${pagename eq 'modify'}">
					<jsp:include page="modify.jsp"/>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
		</div>	
		<div id="footer">
			<jsp:include page="../common/footer.jsp" />
		</div>
	</div>
<script>
	member.main('${context}');
</script>
</body>
</html>

