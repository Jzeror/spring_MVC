<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/header.jsp" />
<body>
	<div id="wrapper">
		<div id="header">
		<관리자 페이지>
		</div>
		<!-- header end -->
		<div id="content">
			<jsp:include page="../member/search.jsp" />
		</div>
		<!-- content end -->
		<jsp:include page="../common/footer.jsp"></jsp:include>
	</div>

</body>
</html>
