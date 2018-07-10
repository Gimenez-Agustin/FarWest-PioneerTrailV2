package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Map implements Serializable{
    
    private Location[][] locations;
    private Location currentLocation;
//    private Scene currentScene;
//    private String description;
    
    //author Giovanni
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
//    private Location[][] locations;
    
    public Map(){
        //locations = new ArrayList<>();
    }
    
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            return;
        }
        this.currentRow = 0;
        this.currentColumn = 0;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setVisited(false);
                locations[row][column] = location;
            }
        }
    }

    //done
       
    //added by giovanni   
//    public Location[][] getLocations() {
//        return locationS;
//    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
    
    
    
//    public int getCurrentRow() {
//        return currentRow;
//    }
//
//    public void setCurrentRow(int currentRow) {
//        this.currentRow = currentRow;
//    }
//
//    public int getCurrentColumn() {
//        return currentColumn;
//    }
//
//    public void setCurrentColumn(int currentColumn) {
//        this.currentColumn = currentColumn;
//    }

//    public Scene getCurrentScene() {
//        return currentScene;
//    }
//
//    public void setCurrentScene(Scene currentScene) {
//        this.currentScene = currentScene;
//    }
//    
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

//    public int getRowCount() {
//        return rowCount;
//    }
//
//    public void setRowCount(int rowCount) {
//        this.rowCount = rowCount;
//    }
//
//    public int getColumnCount() {
//        return columnCount;
//    }
//
//    public void setColumnCount(int columnCount) {
//        this.columnCount = columnCount;
//    }
    //done

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.locations);
        hash = 47 * hash + Objects.hashCode(this.currentLocation);       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;      
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }       
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", currentLocation=" + currentLocation + '}';
    }   
}
