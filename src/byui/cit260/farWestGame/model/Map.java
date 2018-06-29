package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Map implements Serializable{
    private List<Location> locations;
    
    //author Giovanni
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private Location currentLocation;
    private Scene currentScene;
    private Location[][] locationS;
    private String description;
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locationS = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                locationS[row][column] = location;
            }
        }
    }

    //done
    
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.locations);
        //added by giovanni
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        hash = 97 * hash + Objects.hashCode(this.columnCount);
        hash = 97 * hash + Objects.hashCode(this.description);
        //done*/
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
        
        //added by giovanni
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }        
        //done 
        
        return true;
    }
    
    //added by giovanni
    
    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    public Location[][] getLocations() {
        return locationS;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }
    
    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Scene currentScene) {
        this.currentScene = currentScene;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    //done
    
    
}
