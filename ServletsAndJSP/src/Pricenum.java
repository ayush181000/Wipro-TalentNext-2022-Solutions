import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/Price_num")
public class Price_num extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            String no1 = request.getParameter("no");
            int no = Integer.parseInt(no1);
            String name = request.getParameter("name");
            String colour = request.getParameter("colour");
            tx = session.beginTransaction();
            Price s1 = new Price();
            s1.setFlowerid(no);
            s1.setFlowerName(name);
            s1.setFlowercolor(colour);
            session.save(s1);
            tx.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
    }
}
