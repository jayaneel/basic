// importing the javax.servlet package
// importing java.io package for PrintWriter
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.*;
import java.io.*;

// now creating a servlet by implementing Servlet interface
public class LifeCycleServlet implements Servlet {

	ServletConfig config = null;

	// init method

    /**
     *
     * @param sc
     */
        @Override
	public void init(ServletConfig sc)
	{
		config = sc;
		System.out.println("in init");
	}

	// service method

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
        @Override
	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2>Did you recieve notificatons??</h2>");
		System.out.println("in service");
	}

	// destroy method

    /**
     *
     */
        @Override
	public void destroy()
	{
		System.out.println("in destroy");
	}

    /**
     *
     * @return
     */
    @Override
	public String getServletInfo()
	{
		return "LifeCycleServlet";
	}

    /**
     *
     * @return
     */
    @Override
	public ServletConfig getServletConfig()
	{
		return config; // getServletConfig
	}
}
