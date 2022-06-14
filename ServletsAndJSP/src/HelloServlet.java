import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

        protected void service(HttpServletRequest arg0, HttpServletResponse arg1)

                        throws ServletException, IOException {

                super.service(arg0, arg1);

        }

 

        public void doPost(HttpServletRequest req, HttpServletResponse res)

                        throws ServletException, IOException {

                res.setContentType("text/html");

                PrintWriter pw = res.getWriter();

                pw.println("<html>");

                pw.println("<body bgcolor='pink'>");

                pw.println("<h1>");

                pw.println("Hello World");

                pw.println("<br>");

                pw.println("This is my first Servlet Program");

                pw.println("</h1>");

                pw.println("</body>");

                pw.println("</html>");

        }

 

        public void doGet(HttpServletRequest req, HttpServletResponse res)

                        throws ServletException, IOException {

                res.setContentType("text/html");

                PrintWriter pw = res.getWriter();

                pw.println("<html>");

                pw.println("<body bgcolor='pink'>");

                pw.println("<h1>");

                pw.println("Hello World");

                pw.println("<br>");

                pw.println("This is my first Servlet Program");

                pw.println("</h1>");

                pw.println("</body>");

                pw.println("</html>");

        }

}