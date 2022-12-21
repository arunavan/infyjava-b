import javax.servlet.*;
import javax.servlet.http.*;

public class SessionMonitor implements HttpSessionListener, ServletContextListener {
	private int active = 0,
	max = 0;

	public void contextInitialized(ServletContextEvent sce) {
		store(sce.getServletContext());
	}

	public void contextDestroyed(ServletContextEvent sce) {}

	public void sessionCreated(HttpSessionEvent se) {
		active++;
		if (active>max)
		max = active;
		store(se.getSession().getServletContext());
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		active--;
		store(se.getSession().getServletContext());
	}

	private void store(ServletContext c) {
	c.setAttribute("sessions_active", new Integer(active));
	c.setAttribute("sessions_max", new Integer(max));
	}
}
