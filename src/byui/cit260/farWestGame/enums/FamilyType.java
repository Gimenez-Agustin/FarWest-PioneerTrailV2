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
public enum FamilyType {
    //keywords and values/descriptions
    Father("Father"),
    Mother("Mother"),
    Children("Children"); 
    
    //attribute
    private final String description;
    
    //Constructor
    FamilyType(String description) {
        this.description = description;
    }
    
    //GetterFunction
    public String getDescription() {
        return description;
    }
}
