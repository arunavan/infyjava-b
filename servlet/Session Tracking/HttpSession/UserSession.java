package ibm.sample.session;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Session Demonstration!</title>");
        out.println("</head>");
        out.println("<body><pre>");

	out.println("<h1>Welcome !</h1>");

	HttpSession sess = request.getSession(true);
	out.println("<table border=1><tr><td>Session ID : </td><td>"+sess.getId()+"</td></tr>");

	out.println("<tr><td>Session Creation Time : </td><td>"+sess.getCreationTime()+"</td></tr>");

	out.println("<tr><td>Session Last Accessed Time : </td><td>"+sess.getLastAccessedTime()+"</td></tr>");

	String s=request.getParameter("uname");

	sess.setAttribute("username",s);
	out.println("<tr><td>Session User Name is : </td><td>" +sess.getAttribute("username")+"</td></tr></table>");

	out.println("<br><br><form>Enter Your Name Please : <input type=text name=uname></p><br><input type=submit name=Submit value=Submit></form>");
	out.println("</body>");
	out.println("</html>");
	}
}
