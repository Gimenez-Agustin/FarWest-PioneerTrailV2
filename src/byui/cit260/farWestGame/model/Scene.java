/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Giovanni
 */
public class Scene implements Serializable {
   
//    private int mapLocation;    
    private String name;
    private String description;
    private List<Item> items;
//    private List<Difficulty> difficulties;

    public Scene() {
    }

    public Scene(String name, String description, int mapLocation, int fromNauvoo) {
        this.name = name;
        this.description = description;
//        this.mapLocation = mapLocation;
//        this.fromNauvoo = fromNauvoo;
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

//    public List<Difficulty> getDifficulties() {
//        return difficulties;
//    }
//
//    public void setDifficulties(List<Difficulty> difficulties) {
//        this.difficulties = difficulties;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.items);
//        hash = 89 * hash + Objects.hashCode(this.difficulties);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
//        if (!Objects.equals(this.difficulties, other.difficulties)) {
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", items=" + items + '}';
    }
    
    

}
