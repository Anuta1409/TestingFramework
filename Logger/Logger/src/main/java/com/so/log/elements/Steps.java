package com.so.log.elements;

import org.json.JSONArray;
import org.json.JSONObject;

public class Steps {
    private int id;
    private int testCaseID;
    private String stepName;
    Parameter parameters;

    public Steps() {
    }

    public Steps(int id, int testCaseID, String stepName, Parameter parameters) {
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

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }
    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
       Parameter param = new Parameter();
       JSONArray parameters = new JSONArray();
       
       obj.put("id", this.id);
       obj.put("testCaseID", this.testCaseID);
       obj.put("stepName", this.stepName);
       parameters.put(param.getJSON());
       obj.put("parameters", parameters);

       return obj;
    }
}
