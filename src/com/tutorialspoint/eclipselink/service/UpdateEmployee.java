package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorialspoint.eclipselink.entity.Employee;

public class UpdateEmployee {

    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Eclipse_JPA");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Employee employee = entityManager.find(Employee.class, 1201);

        //before update
        System.out.println(employee);

        employee.setSalary(46000);
        entityManager.getTransaction().commit();

        //after update
        System.out.println(employee);

        entityManager.close();
        emFactory.close();
    }
}
