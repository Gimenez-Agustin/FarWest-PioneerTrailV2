/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.model.Item;
import farwestgame.FarWestGame;

/**
 *
 * @author Araceli Camarillo
 */
public class ViewInventory extends View {

    public ViewInventory() {
        menuPrompt = getInventoryString(); //this builds menu
    }

    private String getInventoryString () {
    String inventoryItems = "";
    Item[] items = FarWestGame.getCurrentGame().getItems();
    int heaviestItem = 0;
    
    for(int count = 0; count < items.length; count++){
    inventoryItems += "\n"+count+" - "+items[count].getName(); //walk thru list of items
    heaviestItem = Integer.max(heaviestItem, items[count].getWeight());
    }
    
    inventoryItems += "\n\nThe Heaviest Item weighs "+heaviestItem;
    inventoryItems += "\n\nWhat Item Would you Like to Look at?(Q to Quit)";
    
    
    return inventoryItems;
    }
    
    @Override
    public boolean doAction(String inputs) {
        Item[] items = FarWestGame.getCurrentGame().getItems();
        try{   //This is being placed here to make sure the program doesn't error out if a letter is inputted.
        int value = Integer.parseInt(inputs); //week 11 put a catch around this so it doesnt' throw an error
        
        if (value <0 || value >= items.length) {
            System.out.println("\nPlease Select a number from the Menu");
            return false;
        }
        
        System.out.println("Name:"+items[value].getName());
        System.out.println("Type:"+items[value].getTypeItem());
        System.out.println("Amount:"+items[value].getAmount());
        System.out.println("Weight:"+items[value].getWeight());
        menuPrompt = getInventoryString(); //if doAction changes the values to the item the value will 
                                            //get updated with the new info thru this line
        } catch (NumberFormatException e) {  //This will catch the error if a letter is inputted and will ask the user to try again.
                    System.out.println("\nError " + e.getMessage());
                    System.out.println("\nThis is not a number!!! \nPlease try again.");
          }                                    
        return false;
    }
    
}
