<%--
  Created by IntelliJ IDEA.
  User: nathanchen
  Date: 16/10/2014
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Roster</h1>
    <ul>
        <c:forEach var="member" items="${memberList}" varStatus="status">
            <li>
                <a href="member.do?id=${status.index}">
                    <c:out value="${member}" />
                </a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>