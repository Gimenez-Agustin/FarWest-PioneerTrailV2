package farwestgame;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.view.StartProgramView;
import byui.cit260.farWestGame.view.ErrorView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author 
 */
public class FarWestGame {

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;    
    private static PrintWriter logFile = null;
    private static Player player;
    private static Game currentGame;
    
    
    public static void main(String[] args) {    

        try {         
        
        FarWestGame.inFile = new BufferedReader(new InputStreamReader(System.in));        
        FarWestGame.outFile = new PrintWriter(System.out, true);
        FarWestGame.logFile = new PrintWriter("logFile.txt");
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display(startProgramView.menu);
        
        
        } catch (Throwable e) {         
         ErrorView.display("FarWestGame","Exception:" + e.toString() +
                            "\nCause: " + e.getCause() +
                            "\nMessage: " + e.getMessage());         
         e.printStackTrace();
     } 
     finally {
            try {
                FarWestGame.inFile.close();
                FarWestGame.outFile.close();
                if (FarWestGame.inFile != null)
                    FarWestGame.inFile.close();
                
                if (FarWestGame.outFile != null)
                    FarWestGame.outFile.close();
                
                if (FarWestGame.logFile != null)
                    FarWestGame.logFile.close();
                
            } catch (IOException ioe2) {  //Lesson 12 instructions showd } catch (IOException ex) { before the logFile was created
                ErrorView.display("FarWestGame","Exception:");
                return;
            }
        }
   
    }    
   
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FarWestGame.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        FarWestGame.currentGame = game;  //SHOULD THESE BE currentGame instead of game???
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FarWestGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FarWestGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FarWestGame.logFile = logFile;
    }
}
