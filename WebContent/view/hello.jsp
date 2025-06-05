//  WebContent/view/hello.jsp
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1><%= request.getAttribute("message") %></h1>
</body>
</html>