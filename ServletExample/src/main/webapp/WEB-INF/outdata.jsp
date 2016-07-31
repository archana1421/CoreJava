<%--
  Created by IntelliJ IDEA.
  User: armanchi
  Date: 7/21/2016
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        <table>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
            <c:forEach items="${data.dataitems}" var="eachData">

               <tr>
                   <td>${eachData.name}</td>
                   <td>${eachData.desc}</td>
                   <td>${eachData.price}</td>
               </tr>
            </c:forEach>
        </table>

    </div>


</body>
</html>
