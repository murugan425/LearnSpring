<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModelAndView Obj</title>
</head>
<body>

This page displays the name being passed from server via Model And View Object..,

<br/>

Request : Name = <%= request.getAttribute("userName") %>

<br/>

Request (using Expression Language EL): Name = ${userName}

</body>
</html>