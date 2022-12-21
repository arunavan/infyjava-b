<%@ taglib prefix="c"
         uri= "http://java.sun.com/jsp/jstl/core"%>
<% String[] names = {"Joe", "Jane", "Juan", "Juana"};
   request.setAttribute("names", names); %>
<h2>Names:
<c:forEach var="name" items="${names}" varStatus="status">
  ${name}<c:if test="${!status.last}">,</c:if>
</c:forEach>
</h2>
