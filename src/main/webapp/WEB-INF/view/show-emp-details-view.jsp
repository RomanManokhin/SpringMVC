<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show details</title>
</head>
<body>
<h2>Dear employee, you are WELCOME!</h2>
<br>

Your name: ${employee.name}<br>

Your surname: ${employee.surname}<br>

Your salary: ${employee.salary}<br>

Your department: ${employee.department}<br>

Your car: ${employee.car}<br>

Languages:
<ul>
    <c:forEach var="lang" items="${employee.language}">
        <li> ${lang}</li>
    </c:forEach>
</ul>

Phone number: ${employee.phoneNumber}

Email: ${employee.email}

<br>
<a href="/employee/"> To employee</a>

</body>
</html>
