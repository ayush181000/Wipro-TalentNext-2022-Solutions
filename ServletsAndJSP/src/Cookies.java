import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public Cookies() {
 super();
 // TODO Auto-generated constructor stub
 }
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
 ServletException, IOException {
 // TODO Auto-generated method stub
 //response.getWriter().append("Served at: ").append(request.getContextPath());
  Cookie cookie = null;
  Cookie[] cookies = null;

  cookies = request.getCookies();
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String firstname=request.getParameter("first_name");
  String lastname=request.getParameter("last_name");
  Cookie firstName = null;
 response.addCookie( firstName );
  Cookie lastName = null;
 response.addCookie( lastName );
  String title = "Reading cookies";
  String docType =
  "<!doctype html public \"-//w3c//dtd html 4.0 " +
  "transitional//en\">\n";

  out.println(docType +
  "<html>\n" +
  "<head><title>" + title + "</title></head>\n" +
  "<body>" );
  if( cookies != null ) {
  out.println("<h2> Found Cookies Name and Value</h2>");
  for (int i = 0; i < cookies.length; i++) {
  cookie = cookies[i];

  out.print("<table> <tr> founded cookies </tr>");
  out.print("<tr><td>First name : " + cookie.getName( ) + ", </td>");
  out.print("<td>last name: " + cookie.getValue( ) + " </td></tr></table");
  }
  } else {
  out.println("<h2>No cookies founds</h2>");
  }
  out.println("</body>");
  out.println("</html>");

 }}
