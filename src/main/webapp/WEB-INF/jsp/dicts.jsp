<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="${pageContext.request.contextPath}/js/common/jquery-3.2.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>字典信息</title>
</head>
<body>
<h1>数据字典的信息</h1>
<h1>name:</h1><div id="name"></div>
<h1>value:</h1><div id="value"></div>
<script type="text/javascript">

$(document).ready(function(){
	$.ajax({
        type:'POST',
        dataType:'json',
        url: "${pageContext.request.contextPath}/dicts/findDictsById",
        success:function(data){
        	$("#name").html(data.name);
        	$("#value").html(data.value);
	        }
    	});
});
</script>
</body>
</html>