/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.model;

/**
 *
 * @author Araceli Camarillo
 */
public enum ItemType {
        //keywords and values/descriptions
    Food(""),
    Axe(""),
    Hammer(""),
    SpareWheels(""),
    Bullets(""),
    Wood(""),
    Rest(""),
    DrinkingWater("");    
            
    //attribute
    private final String description;
    
    //Constructor
    ItemType(String description) {
        this.description = description;
    }
    
    //GetterFunction
    public String getDescription() {
        return description;
    }
}
