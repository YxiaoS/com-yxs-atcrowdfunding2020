<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>--%>
<html>
<head>
<%--    <base href="<%=basePath%>">--%>
    <title>Title</title>
</head>
<body>
index
<%--<a href="${pageContext.request.contextPath}/test.do">test</a>--%>
<%--<a href="${APP_PATH}/index.htm">test</a>--%>
<jsp:forward page="${APP_PATH}/index.htm"></jsp:forward>

</body>
</html>
