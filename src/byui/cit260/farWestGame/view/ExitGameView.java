/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;
import byui.cit260.farWestGame.control.GameControl;


/**
 *
 * @author Giovanni
 */
public class ExitGameView extends View {
            
    public ExitGameView(){
        menuPrompt = getExitGameString(); //this builds menu
    }
    
   @Override    
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase(); 
        switch (menuItem) {
            case "E":
                exitGame();
                break;
            case "S":
                saveGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }
    
    
    
    public void exitGame() {
        System.out.println("Game not saved.\n Thank you for playing\n Have a good day!!");
        System.exit(0);
    }
    
    public void saveGame() {
        //Need to call a function that saves the game.
        System.out.println("Save game function needs to be called first.");
        System.out.println("Game is saved.\n  See you soon!!");
        System.exit(0);       
    }
    
    private String getExitGameString() {
            String exitGameString = "\nAre you Sure you want to Quit"
                + "\n If you end now, all progress will be lost\n"
                + "\nE - End Game without Saving"
                + "\nS - Save Game and exit"
                + "\nQ - Return to game menu"
                + "\n";
            return exitGameString;
    }
}
