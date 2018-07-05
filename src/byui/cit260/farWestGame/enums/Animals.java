package byui.cit260.farWestGame.enums;

/**
 *
 * @author Giovanni
 */
public enum Animals {
    // values are as follows (indexNumber, name, itemName, bulletsNeededForHunt, itemWeight)
    rabbit(0,"rabbit","Food",20,3),
    quail(1,"quail","Food",15,1),
    deer(2,"deer","Food",60,60),
    turkey(3,"turkey","Food",10,8);
    
    //attribute
    private final int id;
    private final String name;
    private final String itemName;
    private final int bulletsNeededForHunt;
    private final int itemWeight;
    
    //Constructor
    Animals(int id, String name, String itemName, int bulletsNeededForHunt, int itemWeight){
        this.id = id;
        this.name = name;
        this.itemName = itemName;
        this.bulletsNeededForHunt = bulletsNeededForHunt;
        this.itemWeight = itemWeight;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public int getBulletsNeededForHunt() {
        return bulletsNeededForHunt;
    }
    
    public int getItemWeight() {
        return itemWeight;
    }    
    
}
