/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OwnLogger;

/**
 *
 * @author Anna
 */
public class main {
    public static void main(String[] args) {
        Logger.createTestCase(1, 1, "Positive Login Test");
        Logger.createTestCase(1, 1, "Positive Login ");
        Logger.addSteps(1, 1, "Set parameters login and password");
        Logger.addParameter(1,1,"login", "chumaktest14091991@gmail.com");
        Logger.addParameter(2,1,"password", "12345678");
        
        Logger.addSteps(2, 1, "Close popup for connecting with social link");
        
        Logger.addSteps(3, 1, "Compare actual result with expected");
        
        System.out.println(Logger.createJSON().toString());
        
    }
    
}
