import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session")
public class Session extends HttpServlet {
private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());
	HttpSession session = request.getSession(true);
	 Date createTime = new Date(session.getCreationTime());

	 Date lastAccessTime = new Date(session.getLastAccessedTime());
	 String title = "Welcome Back";
	Integer visitCount = new Integer(0);
	 String visitCountKey = new String("visitCount");


	 if (session.isNew()) {
	 title = "Welcome to my site";

	 } else {
	 visitCount = (Integer)session.getAttribute(visitCountKey);
	 visitCount = visitCount + 1;

	 }
	 session.setAttribute(visitCountKey, visitCount);
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 String docType =
	 "<!doctype html public \"-//w3c//dtd html 4.0 " +
	 "transitional//en\">\n";
	 out.println(docType +
	 "<html>\n" +
	 "<head><title>" + title + "</title></head>\n"+
	 "<body> "+visitCount+"</body></html>\n");
	 }
	 }