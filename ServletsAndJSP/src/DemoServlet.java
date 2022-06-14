import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class DemoServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    ServletConfig config=getServletConfig();  
    String driver=config.getInitParameter("driver");  
    out.print("Driver is: "+driver);  
          
    out.close();  
    }  
  
}  