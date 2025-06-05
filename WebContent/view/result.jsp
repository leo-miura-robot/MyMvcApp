<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>結果</title>
</head>
<body>
    <h2><%= request.getAttribute("method") %></h2>
    <p><%= request.getAttribute("result") %></p>
    <p><%= request.getAttribute("age") %></p>
    <a href="./form.html">戻る</a>
</body>
</html>
