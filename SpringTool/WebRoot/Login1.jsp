<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet"  type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/login.js"></script>
	<script type="text/javascript">
	   function LoadAction(){
	    mLoad(document.getElementById("name").value,document.getElementById("pwd").value);
	   }
	   function reSet(){
	   document.getElementById("name").value=document.getElementById("pwd").value="";
	   }
	</script>

  </head>
  
  <body>
            <div id ="LoginPanel">

            <div class="LinePanel">
                <span class="Line-text">账户</span>
                <input type="text"  class="login-input"  id="name"/>
            </div>
            
             <div class="LinePanel">
                <span class="Line-text">密码</span>
                <input type="password"  class="login-input"  id="pwd"/>
            </div>
                 
                <div class="LinePanel">
                  <div class="button-line">
                      <button id="login" class="button" onclick="LoadAction()">登陆</button>
                       <button id="reset" class="button" onclick="reSet()">重置</button>
                  </div>
                </div> 
            </div>
  </body>
</html>
