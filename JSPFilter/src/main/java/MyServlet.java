import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		
		out.println("Hello " + name );
		out.println("Hello " + id );
		
	}
	
}
