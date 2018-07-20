package byui.cit260.farWestGame.model;

import byui.cit260.farWestGame.cons.UtilsCons;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Map implements Serializable{
    
    private Location[][] locations;
    private Location currentLocation;
    
    //author Giovanni
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
    public Map(){
       currentRow = 0;
       currentColumn = 0;
       rowCount = UtilsCons.ONE;
       columnCount = UtilsCons.TWO;
    }
    
    
//    public Map(int rowCount, int columnCount) {
//        
//        if (rowCount < 1 || columnCount < 1) {
//            return;
//        }
//        this.currentRow = 0;
//        this.currentColumn = 0;
//        this.rowCount = rowCount;
//        this.columnCount = columnCount;
//        
//        this.locations = new Location[rowCount][columnCount];
//        
//        for (int row = 0; row < rowCount; row++) {
//            for (int column = 0; column < columnCount; column++) {
//                Location location = new Location();
//                location.setVisited(false);
//                locations[row][column] = location;
//            }
//        }
//    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Arrays.deepHashCode(this.locations);
        hash = 31 * hash + Objects.hashCode(this.currentLocation);
        hash = 31 * hash + this.rowCount;
        hash = 31 * hash + this.columnCount;
        hash = 31 * hash + this.currentRow;
        hash = 31 * hash + this.currentColumn;
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }
               
}
