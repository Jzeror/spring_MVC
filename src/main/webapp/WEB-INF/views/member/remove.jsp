<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<div id="content">
	<h3>회원탈퇴</h3>
	<form id="delete_form">
		아이디:<input type="text" name="id" /><br> 
		비밀번호:<input type="password" name="pass" /><br />
		<input type="hidden" name='confirmId' value="${user.memId}" />
		<input type="hidden" name='confirmPass' value="${user.password}" />
		<input type="button" id='delete_form_btn' value="조오오온송" />
	</form>
</div>