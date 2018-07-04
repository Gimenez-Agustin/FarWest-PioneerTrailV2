package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import farwestgame.FarWestGame;

/**
 *
 * @author Agustin
 */
public class MainMenuView extends View{
    
    public String menu="N - Start new game\n"
                + "R - Restart existing game\n"
                + "H - Get help on how to play the game\n"
                + "E - Exit\n"
                + "Select an Option: ";
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "N":
                startNewGame();
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
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    private void startNewGame() {
        FarWestGame.setCurrentGame(GameControl.createNewGame(FarWestGame.getPlayer()));
        FarWestGame.getPlayer().getGames().add(FarWestGame.getCurrentGame());
        createLocations();
        createScenes();
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display(gameMenuView.menu);
    }

    private void createLocations() {
       System.out.println("createLocations() called");        
    }
    
    private void createScenes() {
       System.out.println("createScenes() called");        
    }
    
    
    private void restartGame() {
        System.out.println("not implemented yet");
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView(); 
        helpMenuView.display();
    }
}
