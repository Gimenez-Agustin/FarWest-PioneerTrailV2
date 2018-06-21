package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Player;

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
        return player;  
    }
}
