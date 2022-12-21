
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChoiceServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {

		String type = request.getParameter("r1");

		if(type.equals("Tourist"))	{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Tourist");
			rd.forward(request,response);
		}

		if(type.equals("Flight")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Flight");
			rd.forward(request,response);
		}

		if(type.equals("Hotel")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Hotel");
			rd.forward(request,response);
		}

		if(type.equals("Railway")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Railway");
			rd.forward(request,response);
		}

    }
}

