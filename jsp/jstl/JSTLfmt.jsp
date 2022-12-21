<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html> <body>
<%pageContext.setAttribute("mydate",new java.util.Date(),PageContext.PAGE_SCOPE);%>
Current Date and Time: 
<b><c:out value="${mydate}"/></b> </br>

Formatting Date based on Time Zone: <br/><br/>
GMT:
<pre>
    <b><fmt:timeZone value="GMT">
          <fmt:formatDate type="both" value="${mydate}"/>
	</fmt:timeZone></b>
</pre>
<br/>

6 hours 30 minutes ahead of GMT :
<pre>
    <b><fmt:timeZone value="GMT+06:30">
          <fmt:formatDate type="both" value="${mydate}"/>
	</fmt:timeZone></b>
</pre>
<br/>

10 hours 30 minutes behind the GMT :
<pre>
    <b><fmt:timeZone value="GMT-10:30">
          <fmt:formatDate type="both" value="${mydate}"/>
	</fmt:timeZone></b>
</pre>
</body></html>
