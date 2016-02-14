package OwnLogger;

import com.so.log.elements.Parameters;
import com.so.log.elements.Steps;
import com.so.log.elements.TestCases;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;


public class Logger {
    
     static ArrayList<TestCases> casesList = new ArrayList();
     static ArrayList<Steps> stepsList = new  ArrayList();
     static ArrayList<Parameters> paramList = new ArrayList();
     static TestCases currentTest = new TestCases();
     static Steps currentStep = new Steps();
     static Parameters currentParam = new Parameters();
 
     
    public static TestCases createTestCase(int id, int testSuiteid, String testCaseName){
        if(!casesList.isEmpty()){
            casesList.add(currentTest);
            currentTest = new TestCases();
        }
        currentTest.setId(id);
        currentTest.setTestSuiteID(testSuiteid);
        currentTest.setTestCaseName(testCaseName);
        casesList.add(currentTest);
        return currentTest;
   }
    
    
    public static Steps addSteps(int id, int testCasesID, String stepName){
       if(!stepsList.isEmpty()){
            stepsList.add(currentStep);
            currentStep = new Steps();
        }
            currentStep.setId(id);
            currentStep.setTestCaseID(testCasesID);
            currentStep.setStepName(stepName);
            stepsList.add(currentStep);
            return currentStep;
    }
    
    public static Parameters addParameter(int id, int stepID, String paramName, String paramValue){
       if(!paramList.isEmpty()){
            paramList.add(currentParam);
            currentParam = new Parameters();
        }
            currentParam.setId(id);
            currentParam.setStepID(stepID);
            currentParam.setParamName(paramName);
            currentParam.setParamValue(paramValue);
            paramList.add(currentParam);
       return currentParam;
    }
    
            
            public static JSONArray createJSON(){
            JSONArray result = new JSONArray();

            for(TestCases cases:casesList){
                result.put(cases.getJSON());
            }
                for(Steps steps:stepsList){
                    result.put(steps.getJSON());
                }
                   for(Parameters param:paramList){
                       result.put(param.getJSON());
                   }
            casesList.add(currentTest);
            stepsList.add(currentStep);
            paramList.add(currentParam);
            return result;
    }       
            
            
    public static void writeLog(String filename) throws IOException{
        File f = new File(filename);
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter writer = new FileWriter(f);
        writer.write(createJSON().toString());
        writer.flush();
        writer.close();
    }

 }
