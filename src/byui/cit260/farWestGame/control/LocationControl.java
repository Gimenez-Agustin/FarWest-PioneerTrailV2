package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.enums.Locations;
import byui.cit260.farWestGame.model.Location;
import farwestgame.FarWestGame;

/**
 *
 * @author agustin
 */
public class LocationControl {

    public static int currentColumn = 0;
    public static int currentRow = 0;
    public static int column = 0;
    public static int row = 0;

    public static Location[][] createLocations(int ro, int col) {
        int id = 0;
        row = ro;
        column = col;
        Location[][] locations = new Location[column][row];
        locations[currentColumn][currentRow] = createLocation(Locations.zion);
        locations[currentColumn][currentRow] = createLocation(Locations.sugarCreek);
        locations[currentColumn][currentRow] = createLocation(Locations.richardsonPoint);
        locations[currentColumn][currentRow] = createLocation(Locations.charitonRiverCrossing);
        locations[currentColumn][currentRow] = createLocation(Locations.locustCreek);
        locations[currentColumn][currentRow] = createLocation(Locations.gardenGrove);
        locations[currentColumn][currentRow] = createLocation(Locations.nishnabotnaRiver);
        locations[currentColumn][currentRow] = createLocation(Locations.grandEncampment);
        locations[currentColumn][currentRow] = createLocation(Locations.councilBluffs);
        locations[currentColumn][currentRow] = createLocation(Locations.winterQuarters);
        locations[currentColumn][currentRow] = createLocation(Locations.elkhornRiverCrossing);
        locations[currentColumn][currentRow] = createLocation(Locations.platteRiver);
        locations[currentColumn][currentRow] = createLocation(Locations.fortKearny);
        locations[currentColumn][currentRow] = createLocation(Locations.confluencePoint);
        locations[currentColumn][currentRow] = createLocation(Locations.ashHollow);
        locations[currentColumn][currentRow] = createLocation(Locations.chimneyRock);
        locations[currentColumn][currentRow] = createLocation(Locations.scottsBluff);
        locations[currentColumn][currentRow] = createLocation(Locations.fortLaramie);
        locations[currentColumn][currentRow] = createLocation(Locations.sweetwaterRiver);
        locations[currentColumn][currentRow] = createLocation(Locations.independenceRock);
        locations[currentColumn][currentRow] = createLocation(Locations.fortBridger);
        locations[currentColumn][currentRow] = createLocation(Locations.echoCanyon);
        locations[currentColumn][currentRow] = createLocation(Locations.goldenPassRoad);
        locations[currentColumn][currentRow] = createLocation(Locations.emigrationCanyon);
        locations[currentColumn][currentRow] = createLocation(Locations.zion);
        return locations;
    }

    public static Location createLocation(Locations loc) {
        if (currentRow != -1) {
            Location location = new Location();
            location.setColumn(currentColumn);
            location.setRow(currentRow);
            location.setDescription(loc.getDescription());
            location.setFromNauvoo(loc.getFromNauvoo());
            location.setMapSymbol(loc.getSymbol());
            location.setName(loc.getName());            
            if (currentColumn < column-1) {
                currentColumn++;
            } else {
                if (currentRow < row-1) {
                    currentRow++;
                    currentColumn = 0;
                }else{
                    currentRow=-1;
                }
            }            
            return location;
        } else {
            return null;
        }
    }

    public static String displayMap() {
        Location[][] locations = FarWestGame.getCurrentGame().getMap().getLocations();
        String map = "| X |  0  |  1  |  2  |  3  |  4  |\n";
        for (int x = 0; x < column; x++) {            
            for (int y = 0; y < row; y++) {
            if (y == 0) {
                map += "| " + x + " ";
            }    
                map +="|"+ currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(), true)
                        + createSymbol(locations[x][y].getMapSymbol())
                        + currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(), false) + "|";
            }
            map += "\n";
        }
        return map;
    }

    public static String createSymbol(String symbol) {
        String finalSymbol;
        if (symbol.length() > 2) {
            finalSymbol = symbol;
        } else {
            finalSymbol = symbol + " ";
        }

        return finalSymbol;
    }

    public static String currentVisited(boolean visited, boolean current, boolean begin) {
        if (current) {
            if (begin) {
                return "<";
            } else {
                return ">";
            }
        } else {
            if (visited) {
                return "*";
            } else {
                return " ";
            }
        }
    }

//    public static Location getCurrentLocation(){
//        if(FarWestGame.getCurrentGame()!=null){
//            if(FarWestGame.getCurrentGame().getMap().getLocations().size()>0){
//                if(FarWestGame.getCurrentGame().getMap().getCurrentLocation()!=null){
//                    return FarWestGame.getCurrentGame().getMap().getCurrentLocation();
//                }
//            }
//        }
//        return null;
//    }
//    
//    public static Item findItem(){
//        Item item = getCurrentLocation().getItems().get(UtilsControl.getRandom(getCurrentLocation().getItems().size()));
//        return item;
//    }
//    
//    public void loadItemsCurrentLocation(){
//        if(!getCurrentLocation().isExplored()){
//                        
//        }
//    }
//    
//    public static void updateVisited(){
//        getCurrentLocation().setVisited(true);
//    }
}
