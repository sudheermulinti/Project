

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		try {
			Date d=new Date();
			out.println(HTML_START + "<h2>Hello World</h2>" + HTML_END);
			out.println(request.getParameter("name"));
			out.println(request.getParameter("city"));
			//out.println(request.getAttribute("mobile"));
		}
		finally{
			out.close();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html"); 
		
		if(request.getParameter("name").equals("sudheer")){
		 RequestDispatcher requestDispatcher = request
                 .getRequestDispatcher("/Login.jsp");
         requestDispatcher.forward(request, response);
		}
		else{
        	   RequestDispatcher rd = request.getRequestDispatcher("/WarnLogin.jsp");
		rd.forward(request, response);}         

		
		/*PrintWriter out = response.getWriter();
		try {
			Date d=new Date();
			out.println(HTML_START + "<h2>Hello World</h2>" + HTML_END);
			out.println(request.getParameter("name"));
			out.println(request.getParameter("mobile"));
			//out.println(request.getAttribute("mobile"));
		}
		finally{
			out.close();
		
	
	}*/
	}

}

