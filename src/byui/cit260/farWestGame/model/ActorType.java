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
public enum ActorType {
    Joe("Is the Father of Billy and Gigi and husband to Cora"),
    Cora("Is the Mother of Billy and Gigi and wife to Joe"),
    Billy("Is Brother to Gigi and Son to Joe and Cora"),
    Gigi("Is Sister to Billy and Daughter to Joe and Cora"); 
    
    private final String description;
    
    ActorType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
//is the player one in specific? or is can it select any?