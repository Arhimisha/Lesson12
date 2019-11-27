<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My EJB</title>
</head>
<body>
<h3>Folder Listing</h3>
<form action="folderListing" method="post">
    Enter a folder name: <input type="text" name="folder" value=""/>
    <input type="submit" value="Get listing"/>
    <hr>
    <%if (request.getAttribute("answer") != null) {
        out.println("<p>" + request.getAttribute("answer") + "</p>");
    }%>
</form>
</body>
</html>
