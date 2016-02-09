package com.so.logger;

import java.io.IOException;

public class App {
    //статический логер, доступен всем через App.loger
    public static Logger logger;
    
    public static void main(String[] args) throws IOException{
        logger = new Logger();
        for(int i = 0; i < 10; i++){
            //симулируем выполнение тестов
            TestResultLog t = new TestResultLog();
            //выполняем ряд тестов, передавая результирующий объект
        }
        logger.writeLog(System.currentTimeMillis()+".log");
    }
    
}
