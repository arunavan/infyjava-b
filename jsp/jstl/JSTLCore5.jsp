<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core"%>
<UL>
<c:forEach var="country"
  items="Australia,Canada,Japan,Philippines,Mexico,USA">
  <LI>${country}
</c:forEach>
</UL>
