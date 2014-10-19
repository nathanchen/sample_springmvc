<%--
  Created by IntelliJ IDEA.
  User: nathanchen
  Date: 17/10/2014
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:message var="pageTitle" code="newUserRegistration.pageTitle" />
<spring:message var="msgAllFieldsRequired" code="newUserRegistration.message.allFieldsRequired" />

<html>
<head>
    <title>${pageTitle}</title>
</head>
<body>
    <form:form action="." modelAttribute="account">
        <form:errors path="*">
            <div><spring:message code="error.global" /></div>
        </form:errors>
        <h1>${pageTitle}</h1>
        <div>${msgAllFieldsRequired}</div>

        <div>Username: <form:input path="username" cssClass="short" cssErrorClass="short error"/></div>
        <form:errors path="username">
            <div><form:errors path="username" htmlEscape="false" /></div>
        </form:errors>

        <div>Password: <form:password path="password" /></div>

        <div>Confirm password: <form:password path="confirmPassword" /></div>

        <div>Email address: <form:input path="email" /></div>

        <div>First name: <form:input path="firstName" /></div>

        <div>Last name: <form:input path="lastName" /></div>

        <div><form:checkbox path="marketingOk" id="marketingOk" />Please send me product updates by e-mail.</div>

        <div><form:checkbox path="acceptTerms" id="acceptTerms" />I accept the <a href="#">terms of use</a>.</div>

        <div><input type="submit" value="Register" /></div>

    </form:form>
</body>
</html>