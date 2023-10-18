package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Animal animal = new Animal(3, "Fluffy", true);

            session.save(animal);

            transaction.commit();
        }
    }
}
