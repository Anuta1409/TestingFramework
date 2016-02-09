package com.so.log.elements;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestCases {
    private int id;
    private int testSuiteID;
    private String testCaseName;
    Steps steps;

    public TestCases() {
    }

    public TestCases(int id, int testSuiteID, String testCaseName, Steps steps) {
        this.id = id;
        this.testSuiteID = testSuiteID;
        this.testCaseName = testCaseName;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestSuiteID() {
        return testSuiteID;
    }

    public void setTestSuiteID(int testSuiteID) {
        this.testSuiteID = testSuiteID;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public Steps getSteps() {
        return steps;
    }

    public void setSteps(Steps steps) {
        this.steps = steps;
    }
    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
       Steps step = new Steps();
       JSONArray steps = new JSONArray();
       
       obj.put("id", this.id);
       obj.put("testSuiteID", this.testSuiteID);
       obj.put("testCaseName", this.testCaseName);
       
       steps.put(step.getJSON());
       obj.put("steps", steps);
       
             
       return obj;
    }
    
    
    
}
