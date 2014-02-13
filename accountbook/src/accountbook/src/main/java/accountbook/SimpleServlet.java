package accountbook;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
                throws ServletException, IOException {

	    response.setContentType("text/html; charset=Shift_JIS");

	    /* HTML 出力用 PrintWriter */
	    PrintWriter out = response.getWriter();
	    
	    /* HTML出力 */
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Hello!</title>");
	    out.println("</head>"); 
	    out.println("<body>");
	    out.println("<H1>");
	    out.println("Hello!");
	    out.println("<H1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
		
	}
}