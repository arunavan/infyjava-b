<BODY>
<%@  page errorPage = "ShowErrors.jsp"  %>

<H3  ALIGN = center> Elementary Mathematics  </H3>

<%     String str1 = request.getParameter("t1") ;  
       String str2 = request.getParameter( "t2" ) ;  
       int nr = Integer.parseInt(str1); ;    
       int dr = Integer.parseInt(str2); ;
%>   <CENTER>
       Numerator is <%=  nr   %>   <BR>
       Denominator is  <%=  dr   %>   <BR>
       Quotient is  <%=  nr/dr  %>  
</CENTER>   </BODY>
