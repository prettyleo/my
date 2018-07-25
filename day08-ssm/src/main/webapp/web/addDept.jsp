<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
	body{
		font-size: 30px;
	}
	input{
		padding: 10px;
	}
	#sub{
		width: 180px;
		font-size: 20px;
		margin-top: 8px;
		margin-left: 150px;
	}
	fieldset{
		margin: 0 auto;
		width: 500px;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/dept/addDept.do" method="post">
		<fieldset>
			<legend>添加部门</legend>
			部门名称: <input type="text" name="deptName"><br>
			部门地址: <input type="text" name="deptLoc"><br>
			<input id="sub" type="submit" vlaue=" 提交  "><br>
		</fieldset>
	</form>
</body>
</html>