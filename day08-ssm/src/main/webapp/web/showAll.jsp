<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
	
</style>
</head>
<body>
	<table>
		<caption>部门信息清单:</caption>
		<tr>
			<th>部门ID</th>
			<th>部门名称</th>
			<th>部门地址</th>
		</tr>
		${depts}
		<c:forEach items="${depts}"  var="dept" varStatus="s">
			<tr>
				<td>${dept.id }</td>
				<td>${dept.deptName }</td>
				<td>${dept.deptLoc }</td>
				<td>${s.index }</td>
				<td>${s.count }</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>