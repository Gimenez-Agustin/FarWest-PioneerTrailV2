/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.enums;

/**
 *
 * @author Araceli Camarillo
 */
public enum ActorType {
    //keywords and values/descriptions
    Joe("Is the Father of Billy and Jane and husband to Cora"),
    Cora("Is the Mother of Billy and Jane and wife to Joe"),
    Billy("Is Brother to Jane and Son to Joe and Cora"),
    Jane("Is Sister to Billy and Steven and Daughter to Joe and Cora"),
    Steven("Is brother to Billy and Jane and Daughter to Joe and Cora"); 
    
    //attribute
    private final String description;
    
    //Constructor
    ActorType(String description) {
        this.description = description;
    }
    
    //GetterFunction
    public String getDescription() {
        return description;
    }
}
