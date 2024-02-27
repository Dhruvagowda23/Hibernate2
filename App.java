package learn.hibernate3.moto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//obect creation
    	Rider r1=new Rider();
    	Rider r2=new Rider(); 
    	
    	Bike b1 = new Bike(1111,"yamaha",r1);
    	Bike b2 = new Bike(2222,"honda",r1);
    	Bike b3 = new Bike(3333,"bajaj",r2);
    	Bike b4 = new Bike(4444,"suzuki",r2);
    	
    	List<Bike>blist1 = new ArrayList<Bike>();
    	blist1.add(b1);
    	blist1.add(b2);
    	
    	List<Bike>blist2 = new ArrayList<Bike>();
    	blist2.add(b3);
    	blist2.add(b4);
    	
    	
    	r1.setId(1);
    	r1.setName("sam");
    	r1.setAge(23);
    	r1.setBikeList(blist1);
    	
    	r2.setId(2);
    	r2.setName("rohit");
    	r2.setAge(26);
    	r2.setBikeList(blist2);
    	
    	 //hibernate configuration
        Configuration cfg = new Configuration();
    	   cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	//save objects
    	session.save(b1);
    	session.save(b2);
    	session.save(b3);
    	session.save(b4);
    	 
    	session.save(r1);
    	session.save(r2);
    	
    	//commit transaction
    	tx.commit();
    	
    	
    	
    }
}
