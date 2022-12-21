package pack;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagHandler extends TagSupport
{

	
	public int doStartTag() throws JspException
	{
		JspWriter writer = pageContext.getOut();
		try
		{
			writer.write(
							"<h1>" +
								"<font color = 'blue'>" +
									"Hello" +
								"</font>" +
							"</h1>"
						);
		}
		catch (Exception e) {}
		return SKIP_BODY;
	}

}
