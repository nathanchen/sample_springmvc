<%--
  Created by IntelliJ IDEA.
  User: nathanchen
  Date: 17/10/2014
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Nominee a member for the award</title>
</head>
<body>
    <h1>Nominate a member for the award</h1>
    <form:form modelAttribute="member">
        <div>First name: <form:input path="firstName" /></div>
        <div>Last name: <form:input path="lastName" /></div>
        <div><input type="submit" value="Submit" /></div>
    </form:form>
</body>
</html>