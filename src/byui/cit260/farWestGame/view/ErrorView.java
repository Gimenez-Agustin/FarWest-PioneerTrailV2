/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import farwestgame.FarWestGame;
import java.io.PrintWriter;

/**
 *
 * @author FarWestTeam
 */
public class ErrorView {
    private static final PrintWriter errorFile = FarWestGame.getOutFile();
    private static final PrintWriter logFile = FarWestGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "---------------------------------------------------------"
              + "\n- ERROR - " + errorMessage
              + "\n---------------------------------------------------------");
        
        // log error
        logFile.printf("%n%n%s", className + " - " + errorMessage);
    }
}
