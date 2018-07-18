package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.model.Map;

/**
 *
 * @author agustin
 */
public class MapControl {

    public static Map createMap() {

        Map map = new Map();
        map = asssignLocations(map);
        Location[][] loc = map.getLocations();
        map.setCurrentLocation(loc[0][0]);      
        return map;
    }

    private static Map asssignLocations(Map map) {
        map.setLocations(LocationControl.createLocations(5, 5));
        return map;
    }
    
    public static String displayMap(){
        return LocationControl.displayMap();
    }
}
