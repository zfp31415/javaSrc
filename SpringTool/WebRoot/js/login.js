var obj=function(v){

};

function mclick(){
	
}

//登陆的ajax
 function mLoad(name,pwd) {
	 var xmlHttpReg= null;
	 if(window.ActiveXObject)
		 {
		  xmlHttpReg = new ActiveXobject("Micrsoft.XMLHTTP");
		 }
	 else if(window.XMLHttpRequest)
		 {
		   xmlHttpReg = new XMLHttpRequest();
		 }
	 
	 if(xmlHttpReg!=null)
		 {
		  xmlHttpReg.open('get', "1.txt", true, name, pwd);
		  xmlHttpReg.send(null);
		  xmlHttpReg.onreadystatechange = doResult;
		 }
	 else
		 {
		  alert("xmlHttpReg is null");
		 }
	//xm = XMLHttpRequest();
	 //实现页面的跳转
	 
	 function doResult(){
		 if(xmlHttpReg.readyState==4)
			 {
			 if(xmlHttpReg.status==200)
				// document.getElementById("LoginPanel").innerHTML = xmlHttpReg.responseText;
				 if(name ==xmlHttpReg.responseText)
			        top.location.href="./index.jsp";
				 else
					 {
					   alert("密码错误");
					 }
			 }

	 }
	
	
	// return false;
}
 
