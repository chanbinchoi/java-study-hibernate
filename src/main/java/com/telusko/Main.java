package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory(); // cfg.buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class, 2);
        System.out.println(l1);

        session.close();

        Session session1 = sf.openSession();

        Laptop l2 = session.get(Laptop.class, 2);
        System.out.println(l2);

        sf.close();

    }
}