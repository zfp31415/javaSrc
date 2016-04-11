<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script type="text/javascript"  src="js/login.js"></script>
  <script type="text/javascript">
    var mDoc = new obj(this);
     function show(){ mDoc.mclick();}
  </script>
  </head>
  
  <body>
    登陆页面 <br>
    <button onclick="show()">登陆</button>
    <form method="get" action="#">
      用户名： <input type="text"/> <br>
      密码： <input type="password"/>
    <input type="submit" value="提交" />
    </form>
  </body>
</html>
