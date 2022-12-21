<jsp:useBean id="user" class="pack.Employee" scope="session"/>
<html>
<body>
Name:<%= user.getUsername() %><br>
Desig:<%= user.getDesig() %><br>
Salary: <%= user.getSal() %><br>
</body>
</html>
