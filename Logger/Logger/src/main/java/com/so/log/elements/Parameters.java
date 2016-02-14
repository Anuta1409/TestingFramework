package com.so.log.elements;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Parameters {
    private int id;
    private int stepID;
    private String paramName;
    private String paramValue;

    public Parameters() {
    }

    public Parameters(int id, int stepID, String paramName, String paramValue) {
        this.id = id;
        this.stepID = stepID;
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStepID() {
        return stepID;
    }

    public void setStepID(int stepID) {
        this.stepID = stepID;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String ParamValue) {
        this.paramValue = ParamValue;
    }
    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
             
       obj.put("id", this.id);
       obj.put("stepID", this.stepID);
       obj.put("paramName", this.paramName);
       obj.put("paramValue", paramValue);
       
       return obj;
    }
    
}
