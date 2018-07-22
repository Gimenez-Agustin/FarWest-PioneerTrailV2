package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.cons.UtilsCons;
import byui.cit260.farWestGame.enums.Locations;
import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.view.ErrorView;
import farwestgame.FarWestGame;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author agustin
 */
public class LocationControl {

//    public static int currentColumn = 0;
//    public static int currentRow = 0;
//    public static int column = 0;
//    public static int row = 0;

    public static Location[][] createLocations(int ro, int col) {
        int id = 0;
        int row = ro;
        int column = col;
        Location[][] locations = new Location[column][row];
        locations[0][0] = createLocation(Locations.nauvoo, 0,0, row, column);
        locations[0][1] = createLocation(Locations.sugarCreek, 0,1, row, column);
        locations[0][2] = createLocation(Locations.richardsonPoint, 0,2, row, column);
        locations[0][3] = createLocation(Locations.charitonRiverCrossing, 0,3, row, column);
        locations[0][4] = createLocation(Locations.locustCreek, 0,4, row, column);
        locations[1][0] = createLocation(Locations.gardenGrove, 1,0, row, column);
        locations[1][1] = createLocation(Locations.nishnabotnaRiver, 1,1, row, column);
        locations[1][2] = createLocation(Locations.grandEncampment, 1,2, row, column);
        locations[1][3] = createLocation(Locations.councilBluffs, 1,3, row, column);
        locations[1][4] = createLocation(Locations.winterQuarters, 1,4, row, column);
        locations[2][0] = createLocation(Locations.elkhornRiverCrossing, 2,0, row, column);
        locations[2][1] = createLocation(Locations.platteRiver, 2,1, row, column);
        locations[2][2] = createLocation(Locations.fortKearny, 2,2, row, column);
        locations[2][3] = createLocation(Locations.confluencePoint, 2,3, row, column);
        locations[2][4] = createLocation(Locations.ashHollow, 2,4, row, column);
        locations[3][0] = createLocation(Locations.chimneyRock, 3,0, row, column);
        locations[3][1] = createLocation(Locations.scottsBluff, 3,1, row, column);
        locations[3][2] = createLocation(Locations.fortLaramie, 3,2, row, column);
        locations[3][3] = createLocation(Locations.sweetwaterRiver, 3,3, row, column);
        locations[3][4] = createLocation(Locations.independenceRock, 3,4, row, column);
        locations[4][0] = createLocation(Locations.fortBridger, 4,0, row, column);
        locations[4][1] = createLocation(Locations.echoCanyon, 4,1, row, column);
        locations[4][2] = createLocation(Locations.goldenPassRoad, 4,2, row, column);
        locations[4][3] = createLocation(Locations.emigrationCanyon, 4,3, row, column);
        locations[4][4] = createLocation(Locations.zion, 4,4, row, column);
        return locations;
    }

    public static Location createLocation(Locations loc, int currentRow, int currentColumn, int rows, int columns) {
                
//        int row = FarWestGame.getCurrentGame().getMap().getRowCount();
//        int column = FarWestGame.getCurrentGame().getMap().getColumnCount();
        
        if (currentRow != -1) {
            Location location = new Location();
            location.setColumn(currentColumn);
            location.setRow(currentRow);
            location.setDescription(loc.getDescription());
            location.setFromNauvoo(loc.getFromNauvoo());
            location.setMapSymbol(loc.getSymbol());
            location.setName(loc.getName());
            if (currentColumn < columns - 1) {
                currentColumn++;
            } else {
                if (currentRow < rows - 1) {
                    currentRow++;
                    currentColumn = 0;
                } else {
                    currentRow = -1;
                }
            }
            location.setVisited(location.getName().equals("Nauvoo"));
            return location;
        } else {
            return null;
        }
    }

    public static String displayMap() {
        Location loc = FarWestGame.getCurrentGame().getMap().getCurrentLocation();
        Location[][] locations = FarWestGame.getCurrentGame().getMap().getLocations();
        
        int maxRows = FarWestGame.getCurrentGame().getMap().getRowCount();
        int maxColumns = FarWestGame.getCurrentGame().getMap().getColumnCount();
        
        String map = "| X |  0  |  1  |  2  |  3  |  4  |\r\n";
        for (int x = 0; x < maxColumns; x++) {
            for (int y = 0; y < maxRows; y++) {
                if (y == 0) {
                    map += "| " + x + " |";
                }
                map += currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(loc), true)
                        + createSymbol(locations[x][y].getMapSymbol())
                        + currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(loc), false) + "|";
            }
            map += "\r\n";
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

    //araceli
    public static Map<String, Boolean> moveLocation(String input) {
        Map<String, Boolean> data = new HashMap<String, Boolean>();
        String[] parts = input.split("-");
        
        String part1 = parts[0];
        String part2 = parts[1];
        
        if (UtilsControl.isInteger(part1) && UtilsControl.isInteger(part2)) {
            if (checkCoord(Integer.valueOf(part1), Integer.valueOf(part2))) {
                int one = Integer.valueOf(part1);
                int two = Integer.valueOf(part2);
                Location newLocations[][] = new Location[UtilsCons.ONE][UtilsCons.TWO];
                Location oldLocations[][] = FarWestGame.getCurrentGame().getMap().getLocations();
                for (int i = 0; i < UtilsCons.ONE; i++) {
                    for (int h = 0; h < UtilsCons.TWO; h++) {
                        if (i == one && h == two) {
                            Location location = oldLocations[i][h];
                            location.setVisited(true);
                            FarWestGame.getCurrentGame().getMap().setCurrentLocation(location);
                            FarWestGame.getCurrentGame().getMap().setCurrentRow(i);
                            FarWestGame.getCurrentGame().getMap().setCurrentColumn(h);
                            newLocations[i][h] = location;
                        } else {
                            newLocations[i][h] = oldLocations[i][h];
                        }
                    }
                }
                FarWestGame.getCurrentGame().getMap().setLocations(newLocations);
                
                
                //Giovanni - Hopefully gets the correct distance from Nauvoo=====================
                Location[][] locations = FarWestGame.getCurrentGame().getMap().getLocations();
                GameValues.thisGameDestinationMile = locations[one][two].getFromNauvoo();                
                // ==============================================================================
                
                //Giovanni - Calculate the distance traveled=====================================
                calDistanceTraveled();
                //===============================================================================
                
                
                
                
//                Location[][] locations=FarWestGame.getCurrentGame().getMap().getLocations();
//                locations[one][two].setVisited(true);
//                Location location = locations[one][two];                
//                
//                FarWestGame.getCurrentGame().getMap().setLocations(locations);
//                FarWestGame.getCurrentGame().getMap().setCurrentLocation(location);
            } else {

            }
        } else {

        }
        return null;
    }

    public static boolean checkCoord(int one, int two) {
        if (one < UtilsCons.ONE && one > -1) {
            if (two < UtilsCons.TWO && two > -1) {
                return true;
            }
        }
        return false;
    }
    
    public static int calDistanceTraveled(){
        GameValues.thisGameMilesTraveled = Math.abs(GameValues.thisGameDestinationMile - GameValues.thisGameCurrentMile);
        GameValues.thisGameCurrentMile = GameValues.thisGameDestinationMile;
        return 1;
    }

}
