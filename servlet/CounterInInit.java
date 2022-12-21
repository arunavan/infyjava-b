import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CounterInInit extends HttpServlet {
	int counter;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	String initValue = config.getInitParameter("initial");
	try{
		counter = Integer.parseInt(initValue);
	}
	catch(NumberFormatException e){
		counter = 0;
	}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	counter++;
	pw.println("Since loading this servlet has been accessed" + counter + "times");
	}
}