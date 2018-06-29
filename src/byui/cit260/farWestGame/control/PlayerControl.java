package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agustin
 */
public class PlayerControl {
    
    public static Player savePlayer(String playerName){
        if(playerName==null){
            return null;
        }
        Player player= new Player();
        player.setName(playerName);
        Game game = new Game();
        List<Game> games = new ArrayList<>();
        player.setGames(games);
        player.setCurrentGame(game);
        return player;  
    }
}
