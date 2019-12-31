<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>My JSP 'pager.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
      /**
       * 设置未来(全局)的AJAX请求默认选项
       * 主要设置了AJAX请求遇到Session过期的情况
       */

      /**
       * 在页面中任何嵌套层次的窗口中获取顶层窗口
       * @return 当前页面的顶层窗口对象
       */

  </script>
  <body >
  <nav class="navbar navbar-inverse" role="navigation">
      <div class="container-fluid">

          <div class="navbar-header">
              <a class="navbar-brand" href="<%=request.getContextPath()%>/m/list">房屋管理系统</a>
          </div>

          <div style="height: 50px;">
              <ul class="nav navbar-nav" id="topul">

              </ul>

              <div style="float:right">
                  <a>
                      <button type="button" class="btn btn-link" onclick="loginOut()">注销</button>
                  </a>
                  <a>
                      <button type="button" class="btn btn-link" onclick="updateps()">修改密码</button>
                  </a>
              </div>

          </div>


      </div>

  </nav>
  </body>

</html>
