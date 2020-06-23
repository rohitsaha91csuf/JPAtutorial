package org.example;

import org.example.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesterSingleEntity {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
//        Employee emp= new Employee();
//        emp.setFirstName("Ratik");
//        emp.setLastName("Saha");
//        emp.setEmail("rohitsaha91@gmail.com");
//
//
//        // inserting into the database
//        entityManager.getTransaction().begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction().commit();
//
//
        //find and update
//        Employee e1= entityManager.find(Employee.class,"c122c95e-97be-41ee-9864-d88a6cb24028");
//        System.out.println(e1);
//        e1.setLastName("Shetty");
//        e1.setEmail("ratikshetty@csu.fullerton.edu");
//        entityManager.getTransaction().begin();
//        entityManager.merge(e1);
//        entityManager.getTransaction().commit();
//
        //find All using JPQL
//
//        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findAll", Employee.class);
//        List<Employee> result= query.getResultList();
//        for(Employee e: result){
//            System.out.println(e);
//        }

        //find by email using named query JPQL
//        TypedQuery<Employee> q1= entityManager.createNamedQuery("Employee.findByEmail",Employee.class);
//        q1.setParameter("paramEmail","rohitsaha91@gmail.com");
//        Employee e2= q1.getSingleResult();
//        System.out.println(e2);
////
//


        entityManager.close();





        entityManagerFactory.close();
    }
}
