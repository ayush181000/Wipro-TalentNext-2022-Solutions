import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/Price_num")
public class Price_num extends HttpServlet {
    SessionFactory sÐµssionFactory;
    Session session;
    Transaction tx;

    public Price_num() {
        sÐµssionFactory = new Configuration().configure("hiber.cfg2.xml").buildSessionFactory();
    }

    public void insert(Price pri) {
        session = sÐµssionFactory.openSession();
        tx = session.beginTransaction();
        try {
            session.save(pri);
            tx.commit();
            session.close();
            System.out.println("value inserted");
        } catch (Exception e) {
            System.out.println("error at insert" + e);
        }
    }

    public void delete(int flowerid) {
        session = sÐµssionFactory.openSession();
        tx = session.beginTransaction();
        try {
            Price pri = (Price) session.get(Price.class, flowerid);
            session.delete(pri);
            tx.commit();
            session.close();
            System.out.println("value deleted");
        } catch (Exception e) {
            System.out.println("error at display" + e);
        }
    }
}
