<%@ taglib prefix="c"
           uri= "http://java.sun.com/jsp/jstl/core" %>
           
<UL>
<c:forEach var="i" begin="1" end="10">
  <LI>${i}
      <c:if test="${i > 7}">
      (greater than 7)
      </c:if>
</c:forEach>
</UL>
