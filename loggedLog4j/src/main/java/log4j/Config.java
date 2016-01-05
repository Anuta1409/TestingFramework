package log4j;

import javax.security.auth.login.Configuration;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Anna on 04.01.2016.
 */
public class Config {
    private static String log4j;
    private static Properties logProperty = new Properties();

    @SuppressWarnings("static-access")//скрыть предупреждения
    public Config(String log4j){
        this.log4j = log4j;
    }

    public void init(){
        try {
            logProperty.load(new FileInputStream("log4j"));
            //PropertyConfiguration.configure(logProperty)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
