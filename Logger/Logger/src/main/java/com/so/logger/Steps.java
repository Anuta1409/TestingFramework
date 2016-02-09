package com.so.logger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stan
 */
public class Steps {
    private List<String> messages;
    public Steps() {
        this.messages = new ArrayList<>();
    }
    public void addMessage(String message){
        messages.add(message);
    }
    
    public String toJSONString(){
        return "";
    }
    
}
