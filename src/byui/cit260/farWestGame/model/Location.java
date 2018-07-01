package byui.cit260.farWestGame.model;

import byui.cit260.farWestGame.enums.Locations;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Location implements Serializable{
    private Locations locationDescription;
    private List<Item> items;
    private List<Difficulty> difficulties;
    private boolean visited;
    private boolean explored;
    
    //added by giovanni
//    private int row;
//    private int column;
//    private int fromNauvoo;
//    private Scene scene;
    //done
    
    public Location(){
        items= new ArrayList<>();
        difficulties = new ArrayList<>();
        explored = false;
    }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.locationDescription);
        hash = 23 * hash + Objects.hashCode(this.items);
        hash = 23 * hash + Objects.hashCode(this.difficulties);
        hash = 23 * hash + (this.visited ? 1 : 0);
        hash = 23 * hash + (this.explored ? 1 : 0);
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
        if (this.visited != other.visited) {
            return false;
        }
        if (this.explored != other.explored) {
            return false;
        }
        if (this.locationDescription != other.locationDescription) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.difficulties, other.difficulties)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "locationDescription=" + locationDescription + ", items=" + items + ", difficulties=" + difficulties + ", visited=" + visited + ", explored=" + explored + '}';
    }

    

    
    
    
//    //added by giovanni
//    public int getRow() {
//        return row;
//    }
//
//    public void setRow(int row) {
//        this.row = row;
//    }
//
//    public int getColumn() {
//        return column;
//    }
//
//    public void setColumn(int column) {
//        this.column = column;
//    }
//
//    public boolean getVisited() {
//        return visited;
//    }
//    
//    public int getFromNauvoo() {
//        return fromNauvoo;
//    }
//
//    public void setFromNauvoo(int fromNauvoo) {
//        this.fromNauvoo = fromNauvoo;
//    }       
    
//    public void setScene(Scene scene) {
//        this.scene = scene;
//    }
//    
//    public Scene getScene() {
//        return scene;
//    }   
    
    
    //done   

    public Locations getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(Locations locationDescription) {
        this.locationDescription = locationDescription;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Difficulty> getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(List<Difficulty> difficulties) {
        this.difficulties = difficulties;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isExplored() {
        return explored;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
    }
    
}


