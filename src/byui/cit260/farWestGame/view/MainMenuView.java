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
        GameControl.createNewGame(FarWestGame.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display(gameMenuView.menu);
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView(); 
        helpMenuView.display(helpMenuView.menu);
    }
}
