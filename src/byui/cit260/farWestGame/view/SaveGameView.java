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
 * @author 
 */
public class SaveGameView extends View {
    
    public SaveGameView(){
    menuPrompt = getSaveMenuString();        
    }
    
    private String getSaveMenuString () {
       String saveGameMessage = "\nEnter the file name to save the game to (or type 'Q' to Quit): ";
       return saveGameMessage; 
    }
    
    @Override
    public boolean doAction(String inputs) {
        String fileName = inputs; 
        try {
            GameControl.saveGame(FarWestGame.getCurrentGame(), fileName);
            console.println("You have Succesfully Saved Your Game to "+ fileName);
            return true; //didn't throw error so it'll go back to previous menu
        } catch (GameControlException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;    
    }
    
}
