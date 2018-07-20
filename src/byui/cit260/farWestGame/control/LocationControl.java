package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.cons.UtilsCons;
import byui.cit260.farWestGame.enums.Locations;
import byui.cit260.farWestGame.model.Location;
import farwestgame.FarWestGame;
import java.util.HashMap;
import java.util.Map;

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
        locations[currentColumn][currentRow] = createLocation(Locations.nauvoo);
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
            if (currentColumn < column - 1) {
                currentColumn++;
            } else {
                if (currentRow < row - 1) {
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
        String map = "| X |  0  |  1  |  2  |  3  |  4  |\n";
        for (int x = 0; x < column; x++) {
            for (int y = 0; y < row; y++) {
                if (y == 0) {
                    map += "| " + x + " |";
                }
                map += currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(loc), true)
                        + createSymbol(locations[x][y].getMapSymbol())
                        + currentVisited(locations[x][y].isVisited(), locations[x][y].isCurrentLocation(loc), false) + "|";
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

    //araceli
    public static Map<String, Boolean> moveLocation(String input) {
        Map<String, Boolean> data = new HashMap<String, Boolean>();
        String[] parts = input.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        if (UtilsControl.isInteger(part1) && UtilsControl.isInteger(part2)) {
            if (checkCoord(Integer.valueOf(part1), Integer.valueOf(part2))) {
                int one = Integer.valueOf(part2);
                int two = Integer.valueOf(part1);
                Location newLocations[][] = new Location[UtilsCons.ONE][UtilsCons.TWO];
                Location oldLocations[][] = FarWestGame.getCurrentGame().getMap().getLocations();
                for (int i = 0; i < UtilsCons.ONE; i++) {
                    for (int h = 0; h < UtilsCons.TWO; h++) {
                        if (i == one && h == two) {
                            Location location = oldLocations[i][h];
                            location.setVisited(true);
                            FarWestGame.getCurrentGame().getMap().setCurrentLocation(location);
                            newLocations[i][h] = location;
                        } else {
                            newLocations[i][h] = oldLocations[i][h];
                        }
                    }
                }
                FarWestGame.getCurrentGame().getMap().setLocations(newLocations);
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

}
