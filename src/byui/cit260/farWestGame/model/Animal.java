package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Giovanni
 */
public class Animal implements Serializable{
    private int animalId;
    private String animalName;
    private int bulletsNeededForHunt;
    private int animalMeat;
    
    
    public Animal() {}
    
    public int getAnimalId() {
        return animalId;
    }
    
    public void setAnimalId(int animalId){
        this.animalId = animalId;
    }
     
    public String getAnimalName() {
        return animalName;
    }
    
    public void setAnimalName(String animalName) {
        this.animalName = animalName;        
    }

    public int getBulletsNeededForHunt() {
        return bulletsNeededForHunt;
    }
    
    public void setBulletsNeededForHunt(int bulletsNeededForHunt) {
        this.bulletsNeededForHunt = bulletsNeededForHunt;
    }
    
    public int getAnimalMeat() {
        return animalMeat;
    }
    
    public void setAnimalMeat (int animalMeat) {
        this.animalMeat = animalMeat;
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
        if (this.animalId != other.animalId) {
            return false;
        }
        if (!Objects.equals(this.animalName, other.animalName)) {
            return false;
        }
        if (this.bulletsNeededForHunt != other.bulletsNeededForHunt) {
            return false;
        }
        if (this.animalMeat != other.animalMeat) {
            return false;
        }
        
        return true;
        
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.animalId;
        hash = 29 * hash + Objects.hashCode(this.animalName);
        hash = 29 * hash + this.bulletsNeededForHunt;
        hash = 29 * hash + this.animalMeat;
        return hash;
    }
}
