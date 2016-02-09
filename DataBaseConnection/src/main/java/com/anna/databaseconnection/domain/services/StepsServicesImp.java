package com.anna.databaseconnection.domain.services;

import com.anna.databaseconnection.domain.HibernateUtil;
import com.anna.databaseconnection.domain.entity.Steps;
import java.util.List;
import org.hibernate.Session;


public class StepsServicesImp implements StepsServices{

    @Override
    public int addSteps(Steps s) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int id = -1;
        try{
            id = (int)session.save(s);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }
        return id;
    }

    @Override
    public boolean updateSteps(Steps s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Steps getSteps(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Steps  user = (Steps) session.createSQLQuery("SELECT* FROM user WHERE"+columnName+"="+param+"").addEntity(User.class);
        return user;
    }//To change body of generated methods, choose Tools | Templates.
   

    @Override
    //    DELETE FROM user WHERE email LIKE "userbig%"; query for delete from user table; 
    //    SELECT *FROM `user`;
    public int deleteSteps(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int qty = -1;
        try{
            qty = session.createSQLQuery("DELETE FROM user WHERE"+columnName+"LIKE" +userEmailPart+"%"+"").executeUpdate(); //executeUpdate() - return number of updated or deleted columns
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }
        return qty;
    }

    @Override
    public List<Steps> stepsList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Steps> userlist;
        // select * from users
        userlist = session.createSQLQuery("SELECT * FROM user").addEntity(Steps.class).list();
        return userlist;
    }
}
