/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;
import farwestgame.FarWestGame;

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
        
        
    return false;    
    }
    
}
