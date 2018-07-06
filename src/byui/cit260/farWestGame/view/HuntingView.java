/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.enums.Animals;
import byui.cit260.farWestGame.model.Animal;
import farwestgame.FarWestGame;
/**
 *
 * @author Giovanni
 */
// public class HuntingView {
public class HuntingView extends View { 
         
   public HuntingView(){
       menuPrompt = getAnimalString();
   }
   
   private String getAnimalString() {
       String animalsToHunt = "";
       Animals[] animals = Animals.values();
       int mostMeat = 0;
             
       for(int count = 0; count < animals.length; count++){
       animalsToHunt += "\n" + count + " - " + animals[count].getAnimalName(); //walk thru list of items
       mostMeat = Integer.max(mostMeat, animals[count].getAnimalMeat());       
       }
       
       animalsToHunt += "\n\nThe most meat one animal will give you is " + mostMeat + " pounds.";
       animalsToHunt += "\n\nWhat would you like to hunt? (Q to Quit)";
       
       return animalsToHunt;
   }

    @Override
    public boolean doAction(String inputs) {
        Animals[] animals = Animals.values();
        int value = Integer.parseInt(inputs);
        
        if ( value < 0 || value >= animals.length) {
            System.out.println("\nMake sure to only select an animal from the menu.");
            return false;
        }
        // System.out.println(animals[value].getAnimalId());    
        //System.out.println("Animal" + animals[value].getAnimalName());
        //System.out.println("Bullets Needed" + animals[value].getBulletsNeededForHunt());
        //System.out.println("Will give you " + animals[value].getAnimalMeat() + " pounds of meat.");
        
        System.out.println("\n\nYou got a " + animals[value].getAnimalName() + "!!\n");
        System.out.println("You used up " + animals[value].getBulletsNeededForHunt() + " bullets, and it gave you " + animals[value].getAnimalMeat() + " pounds of meat.");
        
        menuPrompt = getAnimalString();  
        
        return false;
    }
    
    
}
