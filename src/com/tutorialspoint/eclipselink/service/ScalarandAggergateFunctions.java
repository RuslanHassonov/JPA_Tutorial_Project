package com.tutorialspoint.eclipselink.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggergateFunctions {

    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = emFactory.createEntityManager();

        //Scalar Function
        Query query = entityManager.createQuery("SELECT UPPER(e.ename) from Employee e");
        List<String> list = query.getResultList();

        for (String e: list){
            System.out.println("Employee NAME: " + e);
        }

        //Aggregate Function
        Query query1 = entityManager.createQuery("SELECT max (e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary: " + result);
    }
}
