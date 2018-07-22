package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import byui.cit260.farWestGame.control.GameValues;
import byui.cit260.farWestGame.control.ItemControl;
import static byui.cit260.farWestGame.control.ItemControl.calResource;
import byui.cit260.farWestGame.exceptions.ItemControlException;
import byui.cit260.farWestGame.model.Item;
import farwestgame.FarWestGame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class MainMenuView extends View{
    
    public static String menu="N - Start new game\n"
                + "R - Restart existing game\n"
                + "H - Get help on how to play the game\n"
                + "E - Exit\n"
                + "Select an Option: ";

    public MainMenuView() {
        super(menu);
    }

    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "N":
        {
            try {
                startNewGame();
            } catch (ItemControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;
            default:
                this.console.println("Invalid menu item.");
        }
        return false;
    }

    private void startNewGame() throws ItemControlException {  //Giovanni added throws ItemControlException because thisGameStartingResources was added
        FarWestGame.setCurrentGame(GameControl.createNewGame(FarWestGame.getPlayer()));
        FarWestGame.getPlayer().getGames().add(FarWestGame.getCurrentGame());
        //createLocations();
        //createScenes();
        thisGameStartingResources();  //added by Giovanni
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display(gameMenuView.menu);
        
    }

    /*private void createLocations() {
       this.console.println("createLocations() called");        
    }
    
    private void createScenes() {
       this.console.println("createScenes() called");        
    }*/
    
    private void restartGame() {
        StartSavedGameView startSavedGameView = new StartSavedGameView();
        startSavedGameView.display();
    }
    
    //private void restartGame() {
        //this.console.println("not implemented yet");
    //}

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView(); 
        helpMenuView.display();
    }
    
    //Giovanni - This was created in order to create resource variables that would be used throughout the game
    // These values are stored in GameValues.java
    private void thisGameStartingResources () throws ItemControlException{
        Item[] items = FarWestGame.getCurrentGame().getItems();
    
    // This will populate the primary resources variables with starting amounts
        for(int count = 0; count < items.length; count++){
            if (items[count].getName() == "Food"){
                GameValues.thisGameNourishment = items[count].getAmount();
            }
            if (items[count].getName() == "Spare Wheels"){
                GameValues.thisGameWheel = items[count].getAmount();
            }
            if (items[count].getName() =="Bullets"){
               GameValues.thisGameBullets = items[count].getAmount();
            }
            if (items[count].getName() == "Wood"){
                GameValues.thisGameWood = items[count].getAmount();
            }
        }
        GameValues.thisGameResourceWeight = calResource(GameValues.thisGameWheel, GameValues.thisGameBullets, GameValues.thisGameWood, GameValues.thisGameNourishment);
        GameValues.thisGameCurrentMile = 0;
        GameValues.thisGameFamilyCount = 4;
    }
    
}
