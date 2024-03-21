package exampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class newservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException {
		
		HttpSession sess = req.getSession();
		
		
		int total = (int)sess.getAttribute("total");
		
		int avg = total/5;
		
		PrintWriter p = res.getWriter();
		p.println("your average is : "+avg);
		
	}

}
