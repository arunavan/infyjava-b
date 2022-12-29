
  <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%
out.println("good mng");
%>

 <c:set var = "salary"  value = "60000"/>
      <c:out value = "${salary} "/>
      
      <c:set var="msg" value="Hello"/>
      <c:out value="${msg}"/>
       <c:set var = "balance" value = "120000.2309" />
       <c:out value="${balance}"/>
         
      <p>Formatted Number (1): 
      <fmt:formatNumber value = "${balance}"         type = "currency"/></p>
         
      <p>Formatted Number (2): <fmt:formatNumber type = "number" 
         maxIntegerDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (3): <fmt:formatNumber type = "number" 
         maxFractionDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (4): <fmt:formatNumber type = "number" 
         groupingUsed = "false" value = "${balance}" /></p>
         
      <p>Formatted Number (5): <fmt:formatNumber type = "percent" 
         maxIntegerDigits="3" value = "${balance}" /></p>
         
      <p>Formatted Number (6): <fmt:formatNumber type = "percent" 
         minFractionDigits = "10" value = "${balance}" /></p>
         
      <p>Formatted Number (7): <fmt:formatNumber type = "percent" 
         maxIntegerDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (8): <fmt:formatNumber type = "number" 
         pattern = "###.###E0" value = "${balance}" /></p>
         