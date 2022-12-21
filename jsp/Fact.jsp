<!--Comments -->
<html>
<body>
<%!public long fact(long x)
{
if(x==0) return 1;
else
return x*fact(x-1);
}%>
<%= fact(5)%>
</body>
</html>