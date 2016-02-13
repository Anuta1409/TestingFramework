package com.anna.databaseconnection.domain.services;

import com.anna.databaseconnection.domain.entity.TestSuite;
import java.util.List;

public interface TestSuiteServices {
    public int              addSuite(TestSuite s);
    public boolean          updateTestSuite(TestSuite s);
    public TestSuite        getTestSuite(int id);
    public int              deleteTestSuite(int id);
    public List<TestSuite>  testSuiteList();
}
