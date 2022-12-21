import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DiceRollerServlet extends HttpServlet{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	PrintWriter pw = response.getWriter();
	String dice1 = Integer.toString((int)(Math.random()*6)+1);
	String dice2 = Integer.toString((int)(Math.random()*6)+1);
	pw.println("<html><body>");
	pw.println("dice roller<br>");
	pw.println("dice1 value is " + dice1 + " and <br>dice2 value is " +dice2);
}
}