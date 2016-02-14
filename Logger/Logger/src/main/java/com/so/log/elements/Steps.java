package com.so.log.elements;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Steps {
    private int id;
    private int testCaseID;
    private String stepName;
    //ArrayList<Parameters> parameters;
  

    public Steps() {
    }

    public Steps(int id, int testCaseID, String stepName) {
        this.id = id;
        this.testCaseID = testCaseID;
        this.stepName = stepName;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestCaseID() {
        return testCaseID;
    }

    public void setTestCaseID(int testCaseID) {
        this.testCaseID = testCaseID;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

//    public ArrayList getParameters() {
//        return parameters;
//    }
//    
//    public void setParameters(ArrayList parameters) {
//        this.parameters = parameters;
//    }


    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
       JSONArray parameters = new JSONArray();
       
       obj.put("id", this.id);
       obj.put("testCaseID", this.testCaseID);
       obj.put("stepName", this.stepName);
       //obj.put("parameters", parameters);
       
       return obj;
    }
}
