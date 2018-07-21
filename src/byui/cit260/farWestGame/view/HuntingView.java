/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameValues;
import byui.cit260.farWestGame.control.ItemControl;
import byui.cit260.farWestGame.enums.Animals;
import byui.cit260.farWestGame.exceptions.ItemControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
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
       animalsToHunt += "\n\nWhat would you like to hunt? (Press Q to not hunt for anything.)";
       
       return animalsToHunt;
   }

    @Override
    public boolean doAction(String inputs) {
                
        Animals[] animals = Animals.values();
        try{
        int value = Integer.parseInt(inputs);
        
        if ( value < 0 || value >= animals.length) {
            // System.out.println("\nMake sure to only select an animal from the menu."); //changed per Lesson 12 page 11 instructions
            ErrorView.display(this.getClass().getName(), "\nMake sure to only select an animal from the menu.");
            return false;
        } 
                
        this.console.println("\n\nYou got a " + animals[value].getAnimalName() + "!!\n");
        this.console.println("You used up " + animals[value].getBulletsNeededForHunt() + " bullets, and it gave you " + animals[value].getAnimalMeat() + " pounds of meat.");
            try {
                //GameValues.thisGameBullets = GameValues.thisGameBullets - animals[value].getBulletsNeededForHunt();
                byui.cit260.farWestGame.control.ItemControl.hunt(animals[value].getBulletsNeededForHunt(), animals[value].getAnimalMeat());
            } catch (ItemControlException ex) {
                Logger.getLogger(HuntingView.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.console.println("You have " + GameValues.thisGameBullets + " bullets left.\nYou have " + GameValues.thisGameNourishment + " pounds of food.");
        menuPrompt = getAnimalString();  
        } catch (NumberFormatException e) {  
                    //System.out.println("\nError " + e.getMessage()); //changed per Lesson 12 page 11 instructions
                    ErrorView.display(this.getClass().getName(), "\nError " + e.getMessage());
                    // System.out.println("\nThis is not a number!!! \nPlease try again."); //changed per Lesson 12 page 11 instructions
                    ErrorView.display(this.getClass().getName(), "\nThis is not a number!!! \nPlease try again.");
          }
        return false;
        
    }
    
    
}
