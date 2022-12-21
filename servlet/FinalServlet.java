import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FinalServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String trcode1 = null;
		String trcode2 = null;
		String trcode3 = null;
		String trcode4 = null;
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0;
		int totalPrice = 0;

		String username = "";

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);

		/* Retrieve the value bound to "user". */
		username = (String)session.getAttribute("user");

		/* Retrieve the value bound to "counter".*/
		String counter = (String)session.getAttribute("counter");

		int count = Integer.parseInt(counter);

		for(int i=1; i<=count-1; i++) {

			/* Create a String array. */

			String trname []= new String[count-1];
			trname[i-1] = (String)session.getAttribute("c"+i);


			/* Calculate the total price of selected items.*/

			if ((trname[i-1]).equals("c1")) {
				price1 = 445;
			}
			if ((trname[i-1]).equals("c2")) {
				price2 = 650;
			}
			if ((trname[i-1]).equals("c3")) {
				price3 = 565;
			}
			if ((trname[i-1]).equals("c4")) {
				price4 = 1275;
			}
		}

		/* Calculate the total bill. */
		totalPrice = price1 + price2 + price3 + price4;

		/* Display the total bill that the user has to pay. */

		out.println(username + “, your bill is Rs " + totalRate);

		out.println("</BODY></HTML>");
		out.close();
	}

}