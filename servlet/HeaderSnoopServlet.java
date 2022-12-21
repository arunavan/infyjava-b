import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HeaderSnoopServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("Request Headers are");
		Enumeration enumeration = request.getHeaderNames();
		while(enumeration.hasMoreElements()){
			String headerName = (String)enumeration.nextElement();
			Enumeration headerValues = request.getHeaders(headerName);
			if (headerValues != null){
				while (headerValues.hasMoreElements()){
					String values = (String) headerValues.nextElement();
					pw.println(headerName + ": " + values);
				}
			}
		}
	}
}

