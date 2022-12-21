package pack;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.util.*;
public class DateHandler extends TagSupport
{
public int doStartTag()
{
return SKIP_BODY;
}
public int doEndTag()
{
try
{
pageContext.getOut().write(new Date().toString());
}
catch(Exception e)
{
System.out.println("Exception in Taghandler "+e);
}
return EVAL_PAGE;
}
}
