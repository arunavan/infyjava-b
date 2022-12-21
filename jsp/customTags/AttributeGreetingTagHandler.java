package pack;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class AttributeGreetingTagHandler extends TagSupport
{

	String fname;
	String lname;

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	@Override
	public int doStartTag() throws JspException
	{
		JspWriter writer = pageContext.getOut();
		if(getFname() == null)
		{
			setFname("");
		}
		if(getLname() == null)
		{
			setLname("");
		}
		try
		{
			writer.write(
							"<h3>" +
								"<font color = 'blue'>" +
									"Hi " + getFname() + " " + getLname() + ", Welcome to Custom tag programing!" +
								"</font>" +
							"</h3>"
						);
		}
		catch (Exception e) {}
		return SKIP_BODY;
	}

}

