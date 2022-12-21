<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="dataSource" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@192.168.21.28:1521:orcl" user="scott" password="tiger"/>

<html>
  <head>
    <title>SQL Tag Out Examples</title>
  </head>

  <body>

<sql:query var = "users" dataSource="${dataSource}">
select * from books
</sql:query>

<table border=1>
<c:forEach var="row" items="${users.rows}">
<tr>
<td><c:out value="${row.bno}"/></td>
<td><c:out value="${row.bname}"/></td>
<td><c:out value="${row.price}"/></td>
</tr>
</c:forEach>
</table>


  </body>
</html>