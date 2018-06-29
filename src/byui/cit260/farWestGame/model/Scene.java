/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Giovanni
 */
public class Scene implements Serializable {

    private String name;
    private String description;
    private int mapLocation;
    private int fromNauvoo;
    private String mapSymbol;

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

    public int getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(int mapLocation) {
        this.mapLocation = mapLocation;
    }

    public int getFromNauvoo() {
        return fromNauvoo;
    }

    public void setFromNauvoo(int fromNauvoo) {
        this.fromNauvoo = fromNauvoo;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + this.mapLocation;
        hash = 41 * hash + this.fromNauvoo;
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
        if (this.mapLocation != other.mapLocation) {
            return false;
        }
        if (this.fromNauvoo != other.fromNauvoo) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", mapLocation=" + mapLocation + ", You have traveled " + fromNauvoo + " miles so far." + '}';
    }


    public Scene() {
    }

    public Scene(String name, String description, int mapLocation, int fromNauvoo) {
        this.name = name;
        this.description = description;
        this.mapLocation = mapLocation;
        this.fromNauvoo = fromNauvoo;
    }

}
