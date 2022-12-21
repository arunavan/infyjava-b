import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SnoopingServerServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("The server name is " + request.getServerName() + "<br>");
		pw.println("The server port number is " + request.getServerPort()+ "<br>");
		pw.println("The protocol is " + request.getProtocol()+ "<br>");
		pw.println("The scheme used is " + request.getScheme());
	}
}