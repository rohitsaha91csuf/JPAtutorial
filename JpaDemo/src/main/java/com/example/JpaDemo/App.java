package com.example.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien a1=new Alien();
        a1.setId(1);
        a1.setName("Parijat");
        a1.setScore(30);
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
        
        EntityManager em= emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();
        
        Alien a= em.find(Alien.class,4);
        System.out.println(a);
    }
}
