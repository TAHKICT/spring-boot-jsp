<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html lang="en">

<body>
    <%--Not protected--%>
        <p>${text}</p>

    <%--Protected--%>
<%--    <p><c:out value="${text}"/></p>--%>

    <p>
        <form action="/save" method="POST">
            Email: <input type="text" name="text" value="${text}">
            <input type="submit" value="Submit" />
        </form>
    </p>

</body>

</html>