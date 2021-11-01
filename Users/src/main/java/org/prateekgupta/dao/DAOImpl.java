package org.prateekgupta.dao;

import com.mysql.cj.log.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.prateekgupta.entity.LoginEntity;
import org.prateekgupta.entity.UserEntity;
import org.prateekgupta.utils.HibernateUtils;

import javax.persistence.PersistenceException;


public class DAOImpl implements DAO {
    @Override
    public String save(UserEntity entity) {
        Session session = null;
        SessionFactory factory;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (PersistenceException e) {
            return "Details of an user already exits with the provided email";
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "Details of the user saved";
    }

    @Override
    public UserEntity getUserEntityByEmail(String email) {
        Session session = null;
        SessionFactory factory;
        UserEntity result;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Query query=session.createNamedQuery("getUserEntityByEmail");
            query.setParameter("providedEmail",email);
            result= (UserEntity) query.uniqueResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public LoginEntity getLoginEntityByEmail(String email) {
        Session session = null;
        SessionFactory factory;
        LoginEntity result;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Query query=session.createNamedQuery("getLoginEntityByEmail");
            query.setParameter("providedEmail",email);
            result= (LoginEntity) query.uniqueResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public String delete(String email) {
        Session session = null;
        SessionFactory factory;

        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Query query=session.createNamedQuery("getLoginEntityByEmail");
            query.setParameter("providedEmail",email);
            LoginEntity entity= (LoginEntity) query.uniqueResult();
            Transaction transaction= session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "User details deleted";
    }

    @Override
    public String updatePassword(LoginEntity entity) {
        Session session = null;
        SessionFactory factory;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Transaction transaction= session.beginTransaction();
            Query query=session.createNamedQuery("updatePassword");
            query.setParameter("providedPassword",entity.getPassword());
            query.setParameter("providedEmail",entity.getEmail());
            query.executeUpdate();
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "Password updated";
    }
}
