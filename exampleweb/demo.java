package exampleweb;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class demo extends HttpServlet {

	
		
		public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException {
		
		
				
			int m1 =Integer.parseInt(req.getParameter("m1"));
			int m2 =Integer.parseInt(req.getParameter("m2"));
			int m3 =Integer.parseInt(req.getParameter("m3"));
			int m4 =Integer.parseInt(req.getParameter("m4"));
			int m5 =Integer.parseInt(req.getParameter("m5"));
			
			
			
			int total = m1+m2+m3+m4;
			
			HttpSession sess = req.getSession();
			sess.setAttribute("total", total);
			
			res.sendRedirect("nser");
			//res.sendRedirect("nser?total=" +total );
			
		
			
			
			
		}

	

}
