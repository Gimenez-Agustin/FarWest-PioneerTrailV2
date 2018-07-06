package byui.cit260.farWestGame.enums;

/**
 *
 * @author Giovanni
 */
public enum Animals {
    // values are as follows (indexNumber, name, itemName, bulletsNeededForHunt, itemWeight)
    rabbit(0,"rabbit",20,3),
    quail(1,"quail",15,1),
    deer(2,"deer",60,50),
    turkey(3,"turkey",10,8);
    
    //attribute
    private final int animalId;
    private final String animalName;
    private final int bulletsNeededForHunt;
    private final int animalMeat;
    
    //Constructor
    Animals(int animalId, String animalName, int bulletsNeededForHunt, int animalMeat){
        this.animalId = animalId;
        this.animalName = animalName;
        this.bulletsNeededForHunt = bulletsNeededForHunt;
        this.animalMeat = animalMeat;
    }
    
    public int getAnimalId() {
        return animalId;
    }
    
    public String getAnimalName() {
        return animalName;
    }
        
    public int getBulletsNeededForHunt() {
        return bulletsNeededForHunt;
    }
    
    public int getAnimalMeat() {
        return animalMeat;
    }    
    
}
