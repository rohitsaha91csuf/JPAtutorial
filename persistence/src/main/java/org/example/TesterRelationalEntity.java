package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesterRelationalEntity {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        entityManager.close();
        entityManagerFactory.close();
        

    }



}
