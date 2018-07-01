package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Item;
import byui.cit260.farWestGame.model.Location;
import farwestgame.FarWestGame;

/**
 *
 * @author agustin
 */
public class LocationControl {
    
    public static Location getCurrentLocation(){
        if(FarWestGame.getCurrentGame()!=null){
            if(FarWestGame.getCurrentGame().getMap().getLocations().size()>0){
                if(FarWestGame.getCurrentGame().getMap().getCurrentLocation()!=null){
                    return FarWestGame.getCurrentGame().getMap().getCurrentLocation();
                }
            }
        }
        return null;
    }
    
    public static Item findItem(){
        Item item = getCurrentLocation().getItems().get(UtilsControl.getRandom(getCurrentLocation().getItems().size()));
        return item;
    }
    
    public void loadItemsCurrentLocation(){
        if(!getCurrentLocation().isExplored()){
                        
        }
    }
    
    public static void updateVisited(){
        getCurrentLocation().setVisited(true);
    }
}
    