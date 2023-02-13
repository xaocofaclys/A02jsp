package com.hibernate.HibernateCRUD;



//import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //sessionfactory
        Configuration cfg=new Configuration();
        cfg.configure("com/hibernate/HibernateDemoProject/hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        
        Student st=new Student();
        st.setId(120011);
        st.setName("Shubham");
        st.setCity("Gangtok");
        System.out.println(st);
        
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        
        session.save(st);
        
        tx.commit();
        session.close();
        System.out.println("Succesfully Created ");
        
    }
}
