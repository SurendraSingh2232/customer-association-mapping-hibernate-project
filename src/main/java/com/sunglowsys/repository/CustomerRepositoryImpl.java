package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Customer save(Customer customer) {
        LOGGER.debug("saving customer: {}",customer);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long)session.save(customer);
        session.getTransaction().commit();
        session.close();
        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {
        Session session  = sessionFactory.openSession();
        Transaction transaction  = session.beginTransaction();
        Customer customer1 = session.get(Customer.class,id);
        customer1.setFirstName(customer.getFirstName());
        session.get(Customer.class,id);
        session.getTransaction().commit();
        return customer1;
    }

    @Override
    public List<Customer> allFind() {


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        session.getTransaction().commit();
        session.close();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.getTransaction().commit();
        return customer;
    }

    @Override
    public Customer delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
        return null;
    }
}
