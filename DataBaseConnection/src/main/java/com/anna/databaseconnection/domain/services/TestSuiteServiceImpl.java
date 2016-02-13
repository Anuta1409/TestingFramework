
package com.anna.databaseconnection.domain.services;

import com.anna.databaseconnection.domain.HibernateUtil;
import com.anna.databaseconnection.domain.entity.TestSuite;
import java.util.List;
import org.hibernate.Session;


public class TestSuiteServiceImpl implements TestSuiteServices{

    @Override
    public int addSuite(TestSuite s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateTestSuite(TestSuite s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TestSuite getTestSuite(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteTestSuite(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TestSuite> testSuiteList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        List<TestSuite> testsuitelist;
        testsuitelist = session.createSQLQuery("select * from test_suite").addEntity(TestSuite.class).list();
        return testsuitelist;
    }
    
}
