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
public class Animal implements Serializable{
    private String name;
    private String itemName;
    private int bulletsNeededForHunt;
    private int animalAmount;
    private int itemWeight;
    
    
    public Animal() {}
     
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;        
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public int getBulletsNeededForHunt() {
        return bulletsNeededForHunt;
    }
    
    public void setBulletsNeededForHunt(int bulletsNeededForHunt) {
        this.bulletsNeededForHunt = bulletsNeededForHunt;
    }
    
    public int getAnimalAmount() {
        return animalAmount;
    }

    public void setAnimalAmount(int animalAmount) {
        this.animalAmount = animalAmount;
    }
    
    public int getItemWeight() {
        return itemWeight;
    }
    
    public void setItemWeight (int itemWeight) {
        this.itemWeight = itemWeight;
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
        final Animal other = (Animal) obj;
        if (this.bulletsNeededForHunt != other.bulletsNeededForHunt) {
            return false;
        }
       if (this.animalAmount != other.animalAmount) {
            return false;
        }
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
        
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.itemName);
        hash = 29 * hash + this.bulletsNeededForHunt;
        hash = 29 * hash + this.animalAmount;
        hash = 29 * hash + this.itemWeight;
        return hash;
    }
}
