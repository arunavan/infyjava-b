
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ChoiceProcessingServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		String user = null ;
  		String item = null;
		int i = 1;
		Enumeration enum = null;

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);


		user = (String)session.getAttribute("user");

		/* Retrieve the name of all the parameters passed by the end user. */
		enum = request.getParameterNames();

		while (enum.hasMoreElements())
		{
			String sname = (String)enum.nextElement();

		/* Store the names in the session object. */
			session.setAttribute ("c"+i, sname);
			i++;
		}

		/* Store the counter value in the session object. */
			session.setAttribute("counter", i +"");

		RequestDispatcher disp = request.getRequestDispatcher("FinalServlet");
		disp.forward(request, response);
    }
}
