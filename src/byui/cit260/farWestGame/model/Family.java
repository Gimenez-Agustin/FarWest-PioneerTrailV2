package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Family implements Serializable{
    private boolean isWagonBroken;
    private List<Person> familyMembers;
    private int rest;
    private int food;
    private List<Item> items;
    private int currentWeight;
    private int currentLocation;
    
    public Family(){}

    public boolean isIsWagonBroken() {
        return isWagonBroken;
    }

    public void setIsWagonBroken(boolean isWagonBroken) {
        this.isWagonBroken = isWagonBroken;
    }

    public List<Person> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<Person> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.isWagonBroken ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.familyMembers);
        hash = 37 * hash + this.rest;
        hash = 37 * hash + this.food;
        hash = 37 * hash + Objects.hashCode(this.items);
        hash = 37 * hash + this.currentWeight;
        hash = 37 * hash + this.currentLocation;
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
        final Family other = (Family) obj;
        if (this.isWagonBroken != other.isWagonBroken) {
            return false;
        }
        if (this.rest != other.rest) {
            return false;
        }
        if (this.food != other.food) {
            return false;
        }
        if (this.currentWeight != other.currentWeight) {
            return false;
        }
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        if (!Objects.equals(this.familyMembers, other.familyMembers)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

            
    
}
