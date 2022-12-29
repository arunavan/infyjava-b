
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
   <head>
      <title>JSTL sql:query Tag</title>
   </head>

   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/pms"
         user = "root"  password = "root"/>

         <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from product;
         </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>product id</th>
            <th>product Name</th>
            <th>qty</th>
            <th>price</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.name}"/></td>
               <td> <c:out value = "${row.qty}"/></td>
               <td> <c:out value = "${row.price}"/></td>
            </tr>
         </c:forEach>
      </table>

   </body>
</html>
