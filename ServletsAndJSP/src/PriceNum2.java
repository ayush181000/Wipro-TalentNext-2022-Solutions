
import java.io.IOException;
import java.util.List;
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
    SessionFactory sеssionFactory;
    Session session;
    Transaction tx;

    public Price_num() {
        sеssionFactory = new Configuration().configure("hiber.cfg3.xml").buildSessionFactory();
    }

public void insert(Price pri)
{
session = sеssionFactory.openSession();
tx = session.beginTransaction();
try
{
session.save(pri);
tx.commit();
session.close();
System.out.println("value inserted");
}
catch(Exception e)
{
System.out.println("error at insert"+e);
}
}

public void update(int flowerid,String flowername)
{
try
{
session = sеssionFactory.openSession();
tx = session.beginTransaction();
Price pri = (Price)session.get(Price.class,flowerid);
pri.setFlowerName(flowername);
session.update(pri);
tx.commit();
session.close();System.out.println("value updated");
}
catch(Exception e)
{
System.out.println("error at update"+e);
}
}
public void display()
{
session = sеssionFactory.openSession();
tx = session.beginTransaction();
try
{
List<Price> pricelist= session.createQuery("FROM Price").list();
for(Price result:pricelist)
{
System.out.println(result);
}
session.close();
}
catch(Exception e)
{
System.out.println("error at display"+e);
}
}
}
}