package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Agustin
 * //has it been visited before? mark as visited that's all this class should do. Our traveling will be done linear
 */
public class Location implements Serializable{
    
    private int row;
    private int column;    
    private String mapSymbol;
    private String name;
    private String description;
    private int fromNauvoo;
    private boolean visited;
    private Scene[] scenes;
    
    
    public Location(){
        
    }  

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFromNauvoo() {
        return fromNauvoo;
    }

    public void setFromNauvoo(int fromNauvoo) {
        this.fromNauvoo = fromNauvoo;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public boolean isCurrentLocation(Location location) {
        return this.getName().equals(location.getName());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
        hash = 83 * hash + Objects.hashCode(this.mapSymbol);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.fromNauvoo;
        hash = 83 * hash + (this.visited ? 1 : 0);        
        hash = 83 * hash + Arrays.deepHashCode(this.scenes);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.fromNauvoo != other.fromNauvoo) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }        
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.deepEquals(this.scenes, other.scenes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", mapSymbol=" + mapSymbol + ", name=" + name + ", description=" + description + ", fromNauvoo=" + fromNauvoo + ", visited=" + visited + ", scenes=" + scenes + '}';
    }

          
    
}


