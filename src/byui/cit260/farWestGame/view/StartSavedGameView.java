/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import byui.cit260.farWestGame.exceptions.GameControlException;
import farwestgame.FarWestGame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Araceli Camarillo
 */
public class StartSavedGameView extends View {
            
        public StartSavedGameView(){
    menuPrompt = getSaveMenuString();        
    }
        
    private String getSaveMenuString () {
       String getSavedGameMessage = "\nEnter the File Name of The Game You wish to Restart (or type 'Q' to Quit): ";
       return getSavedGameMessage; 
    }
    
    @Override
    public boolean doAction(String inputs) {
        String fileName = inputs; 
            try {
                GameControl.loadGame(fileName);
            } catch (GameControlException ex) {
                //Logger.getLogger(StartSavedGameView.class.getName()).log(Level.SEVERE, null, ex);
                //console.println("File not found ");
                ErrorView.display(this.getClass().getName(), "\nError " + ex.getMessage());
                    ErrorView.display(this.getClass().getName(), "\nFile not found!!! \nPlease try again.");
                    return false;
            }            
        console.println("\nOK. Restarting "+ fileName + "\nLet's continue!!\n");
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display(gameMenuView.menu);
        
        return true;    
    }    
}
