<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="en">
<head>
	<title>Insert title here</title>
	<link rel="shortcut icon" href="${context}/resources/img/favicon2.ico">
	
    <link href="${context}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <link href="${context}/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="${context}/resources/css/agency.min.css" rel="stylesheet">
    
	<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script> -->
	<script src="${context}/resources/vendor/jquery/jquery.min.js"></script>
	<script src="${context}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="${context}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="${context}/resources/js/jqBootstrapValidation.js"></script>
    <script src="${context}/resources/js/contact_me.js"></script>
    <script src="${context}/resources/js/app.js"></script> 

	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
</head>
<body>
<div id="wrapper">
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div> 
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div> 
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div> 
	<div id="footer">
		 <tiles:insertAttribute name="footer"/>
	</div>
</div>	
<script>
	app.init('${context}');
</script>
</body>
</html>

