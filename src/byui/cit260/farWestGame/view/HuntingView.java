/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

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
       Animal[] animals = FarWestGame.getCurrentGame().getAnimals();
       int mostMeat = 0;
       
       for(int count = 0; count < animals.length; count++){
       animalsToHunt += "\n" + count + " - " + animals[count].getName(); //walk thru list of items
       mostMeat = Integer.max(mostMeat, animals[count].getItemWeight());       
       }
       
       animalsToHunt += "\n\nThe animal that gives you the most meat is a " + mostMeat;
       animalsToHunt += "\n\nWhat would you like to hunt? (Q to Quit)";
       
       return animalsToHunt;
   }

    @Override
    public boolean doAction(String inputs) {
        Animal[] animals = FarWestGame.getCurrentGame().getAnimals();
        int value = Integer.parseInt(inputs);
        
        if ( value < 0 || value >= animals.length) {
            System.out.println("\nMake sure to only select an animal from the menu.");
            return false;
        }
            
        System.out.println("Animal" + animals[value].getName());
        System.out.println("Resoure" + animals[value].getItemName());
        System.out.println("Bullets Needed" + animals[value].getBulletsNeededForHunt());
        System.out.println("Will give you " + animals[value].getItemWeight() + " pounds of meat.");
        
        menuPrompt = getAnimalString();  
        
        return false;
    }
}
