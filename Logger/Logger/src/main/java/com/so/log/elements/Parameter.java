package com.so.log.elements;

import org.json.JSONObject;

public class Parameter {
    private int id;
    private int stepID;
    private String name;
    private String type;
    private String value;

    public Parameter() {
    }

    public Parameter(int id, int stepID, String name, String type, String value) {
        this.id = id;
        this.stepID = stepID;
        this.name = name;
        this.type = type;
        this.value = value;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public JSONObject getJSON(){
       JSONObject obj = new JSONObject();
        obj.put("id", this.id);
        obj.put("stepID",  this.stepID);
        obj.put("name", this.name);
        obj.put("type", this.type);
        obj.put("value", this.value);
        
        return obj;
    }
}
