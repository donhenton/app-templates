<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<div class="row">
    <div class="col-sm-4">

        <form action="${pageContext.request.contextPath}/login" method="post" 
              class="form-signin" role="form">
            <div class="form-group">
                <label for="username">User name:</label> 
                <input type="text" name="username" id="username" class="form-control" 
                       placeholder="User name" required autofocus />
            </div>
            <div class="form-group">
                <label for="password">Password:</label> <input type="password" name="password" id="password"
                                                               class="form-control" placeholder="Password" required>
            </div>
            <input name="submit" type="submit" value="Submit" class="btn btn-success">
        </form>
        <c:if test="${'fail' eq param.auth}">
            <p>
            <div class="alert alert-danger">Login Failed!!! Reason :
                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
            </c:if>
    </div>
</div>
