package OwnLogger;

import com.so.log.elements.Steps;
import com.so.log.elements.TestCases;
import java.util.ArrayList;
import java.util.HashMap;

public class Logger {
    
     static ArrayList<TestCases> casesList = new ArrayList();;
     static Steps step = new Steps();
     static TestCases currentTest = new TestCases();
    
    public static TestCases createTestCase(int id, int testSuiteid, String testCaseName){
    currentTest.setId(id);
    currentTest.setTestSuiteID(testSuiteid);
    currentTest.setTestCaseName(testCaseName);
    return currentTest;
    }
    
    public  static void addToList(){
    casesList.add(currentTest);
    }
    
    
    public static Steps addSteps(int id, int testCasesID, String stepName){
       step.setId(id);
       step.setTestCaseID(testCasesID);
       step.setStepName(stepName);
       //step.setParameters(parameter);
       
       return step;
    }

 }
