package com.so.log.elements;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Steps {
    private int id;
    private int testCaseID;
    private String stepName;
    HashMap<String, Object> parameters;
    //Parameter parameters;//list parameters

    public Steps() {
    }

    public Steps(int id, int testCaseID, String stepName, HashMap parameters) {
        this.id = id;
        this.testCaseID = testCaseID;
        this.stepName = stepName;
        this.parameters = parameters;
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

    public HashMap getParameters() {
        return parameters;
    }

    public void setParameters(HashMap parameters) {
        this.parameters = parameters;
    }
    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
       HashMap param = new HashMap();
       JSONArray parameters = new JSONArray();
       
       obj.put("id", this.id);
       obj.put("testCaseID", this.testCaseID);
       obj.put("stepName", this.stepName);
       parameters.put(new JSONObject(param));
       obj.put("parameters", parameters);
       
       return obj;
    }
}
