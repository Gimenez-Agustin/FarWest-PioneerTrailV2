package farwestgame;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.view.StartProgramView;

/**
 *
 * @author andres
 */
public class FarWestGame {

    private static Player player;
    private static Game game;
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FarWestGame.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        FarWestGame.game = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display(startProgramView.menu);
    }
    
}
