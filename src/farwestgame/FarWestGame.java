package farwestgame;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Item;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.model.Animal;
import byui.cit260.farWestGame.view.StartProgramView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class FarWestGame {

    private static Player player;
    private static Game currentGame;
    
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
        FarWestGame.currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display(startProgramView.menu);
    }
    
}
