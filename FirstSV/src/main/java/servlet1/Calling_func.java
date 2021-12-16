package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calling_func
 */
@WebServlet("/Calling_func")
public class Calling_func extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calling_func() {
    	System.out.println("Calling_func Constructor called!");
    }
    
    /**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Calling_func \"Init\" method called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Calling_func \"Destroy\" method called");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling_func \"Service\" method(inherited) called");
		System.out.println("Calling_func \"DoGet\" method called");
		
		storeInSessionAndRespond(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling_func \"Service\" method(inherited) called");
        System.out.println("Calling_func \"DoPost\" method called");
        
        storeInSessionAndRespond(request, response);

	}

	private void storeInSessionAndRespond(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.write("<html><body><h4>Check console to understand the flow</h4></body></html>");
		out.write("<html><body><p>&copy 2021 V.Anuparvathi</p></body></html>");
	
	}

	
}
