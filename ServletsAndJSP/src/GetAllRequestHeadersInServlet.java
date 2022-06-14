import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class GetAllRequestHeadersInServlet extends HttpServlet {
 
    private static final long serialVersionUID = -2128122335811219481L;
 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        handleRequest(req, res);
    }
 
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        handleRequest(req, res);
    }
 
    public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
 
        PrintWriter out = res.getWriter();
        res.setContentType("text/plain");
 
        Enumeration<String> headerNames = req.getHeaderNames();
 
        while (headerNames.hasMoreElements()) {
 
            String headerName = headerNames.nextElement();
            out.write(headerName);
            out.write("n");
 
            Enumeration<String> headers = req.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                out.write("t" + headerValue);
                out.write("n");
            }
 
        }
 
        out.close();
 
    }
 
}