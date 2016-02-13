package com.so.log.elements;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestSuite {
    TestCases testCases;

    public TestSuite() {
    }

    public TestSuite(TestCases testCases) {
        this.testCases = testCases;
    }

    public TestCases getTestCases() {
        return testCases;
    }

    public void setTestCases(TestCases testCases) {
        this.testCases = testCases;
    }
    
     public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
       TestCases testCase = new TestCases();
       JSONArray testCases = new JSONArray();
       
       testCases.put(testCase.getJSON());
       obj.put("testCases", testCases);
       System.out.println(obj.toString());
       return obj;
     }
    
}
