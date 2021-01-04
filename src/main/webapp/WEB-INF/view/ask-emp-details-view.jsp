<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<h2>Please enter your details</h2>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
<%--    альтернатива хард коду, через hashmap--%>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>

<%--Хардкод--%>
<%--    Department <form:select path="department">--%>
<%--    &lt;%&ndash;        label - то что видит пользователь, а устанавливаться будет value&ndash;%&gt;--%>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>
    <br>
    <br>

    Which car do you Want?
    <form:radiobuttons path="car" items="${employee.cars}"/>

    <br>
    <br>

    Select your language
    <form:checkboxes path="language" items="${employee.languages}" />

    <br>
    <br>

    Name <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>

    <br>
    <br>

    Email <form:input path="email"/>
    <form:errors path="email"/>

    <br>
    <br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>
