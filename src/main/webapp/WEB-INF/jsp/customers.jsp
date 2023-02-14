
<%@ page import="com.example.servlet_example.Customer" %>
<%@ page import="java.util.List" %>
<%--<%@ taglib prefix="c" uri="jakarta.tags.core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Customers View</title>
    <%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">--%>
    <%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>--%>

    <style>
        table {
            margin-left: auto;
            margin-right: auto;
        }
        table, th, td {
            border: 1px solid black;
        }
        /*.table-dark {*/
        /*    --bs-table-hover-bg: #5d7aa1;*/
        /*}*/
    </style>
</head>
<body>
<div class="container">
    <h2>Customers table</h2>
    <table class="table table-dark table-striped table-bordered table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Work</th>
            <th>City</th>
            <th>Post Code</th>
            <th>Phone</th>
            <th>E-mail</th>
        </tr>
        </thead>
        <tbody>
        <%--        We can use two variants--%>

        <%--            Variant 1 (calling method inside servlet and return String)--%>
        <%--            <%=request.getAttribute("customers")%>--%>

        <%--            Variant 2 (all manupulation in JSP side)--%>
        <%
            List<Customer> customers = (List<Customer>) request.getAttribute("customersList");
            for (Customer customer : customers) {
                //                  For printing in response we must use out object not PrintWriter
                out.print("<tr><td>" + customer.getId() + "</td><td>" + customer.getName() + "</td><td>" + customer.getLastName() + "</td><td>" + customer.getGender() + "</td><td>" + customer.getAge() + "</td><td>" + customer.getWork() + "</td><td>" + customer.getCity() + "</td><td>" + customer.getPostNumber() + "</td><td>" + customer.getPhone() + "</td><td>" + customer.getMail() + "</td></tr>");
            }
        %>


        <%--            Variant 3 (using JSTL)--%>
        <%--        <c:if test="${customersList ne null}">--%>
        <%--            <c:forEach items="${customersList}" var="customer">--%>
        <%--                <tr>--%>
        <%--                    <td><c:out value="${customer.id}"/></td>--%>
        <%--                    <td><c:out value="${customer.name}"/></td>--%>
        <%--                    <td><c:out value="${customer.address}"/></td>--%>
        <%--                </tr>--%>
        <%--            </c:forEach>--%>
        <%--        </c:if>--%>
        </tbody>
    </table>
</div>
</body>
</html>
