package com.so.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author stan
 */
public class Logger {
    private  List<Object> logs;
    public  void addLog(){
        
    }
    
    public void writeLog(String filename) throws IOException{
        File f = new File(filename);
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter writer = new FileWriter(f);
        writer.write(this.toJSONString());
    }
    
    public String toJSONString(){
        StringBuilder b = new StringBuilder();
        for(final Object o : logs){
            b.append(o.toString());
        }
        return b.toString();
    }
}
