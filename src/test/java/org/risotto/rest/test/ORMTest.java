package org.risotto.rest.test;

import org.junit.Test;
import org.risotto.rest.domain.Customer;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ORMTest {

    private EntityManager entityManager;

    @Test
    public void databaseConnection() {

        entityManager = Persistence.createEntityManagerFactory("entityManager")
                .createEntityManager();

        entityManager.getTransaction().begin();

        Customer user = new Customer();
        user.setName("Artem");

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();

    }


}
