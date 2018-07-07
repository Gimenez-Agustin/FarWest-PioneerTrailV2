/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.enums;

/**
 *
 * @author agustin
 */
public enum Items {
    /*
    food(0,"Food","Resource",250),
    axe(1,"Axe", "Tool", 50),
    hammer(2,"Hammer","Tool",50),
    spareWheels(3,"Spare Wheels","Resources",200),
    bullets(4,"Bullets","Resources",100),
    wood(5,"Wood","Resource",50),
    rest(6,"Rest","Resource",0),
    water(7,"Water","Resource",50);*/
    
    //Changing the last number from pounds to amount
    food(0,"Food","Resource",250),
    axe(1,"Axe", "Tool", 50),
    hammer(2,"Hammer","Tool",50),
    spareWheels(3,"Spare Wheels","Resources",4),
    bullets(4,"Bullets","Resources",100),
    wood(5,"Wood","Resource",5),
    rest(6,"Rest","Resource",0),
    water(7,"Water","Resource",50);
       
    //attribute
    private final int id;
    private final String name;
    private final String typeItem;
    private final int weight;
    
    //Constructor
    Items(int id, String name, String typeItem, int weight) {
        this.id=id;
        this.name = name;
        this.typeItem= typeItem;
        this.weight= weight;
    }

    public int getId() {
        return id;
    }   

    public String getName() {
        return name;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public int getWeight() {
        return weight;
    }
    
    

}
