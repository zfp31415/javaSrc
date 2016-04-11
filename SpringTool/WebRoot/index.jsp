<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css"  href="css/style.css">
	
  </head>
  
  <body>
    首页 <br>
    <div id ="header">
     <div id ="headerbar"></div>
     <div id="headAside">
          <div>
             <ul>
                 <li class="side-li">
                 <a href="#">
                     <span class="side-span">
                         <span class="img-ico"></span>
                         <span class="img-item"><%Math.random(); %></span>
                     </span>
                     </a>
                 </li>
                 <li class="side-li">
                 <a href="#">
                     <span class="side-span">
                         <span class="img-ico"></span>
                         <span class="img-item">文档</span>
                     </span>
                    </a>
                 </li>
                 <li class="side-li">
                 <a href="#">
                     <span class="side-span">
                         <span class="img-ico"></span>
                         <span class="img-item">视频</span>
                     </span>
                     </a>
                 </li>
                <li class="side-li">
                <a href="#">
                     <span class="side-span">
                         <span class="img-ico"></span>
                         <span class="img-item">音乐</span>
                     </span>
                    </a>
                 </li>
                 
             </ul>
          </div>
     </div>
     </div>
    <div id ="layoutMain">
    
    </div>
  
    
    <div id ="foot"></div>
  </body>
</html>
