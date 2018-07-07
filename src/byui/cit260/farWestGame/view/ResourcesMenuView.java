package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.exceptions.ItemControlException;
import byui.cit260.farWestGame.model.Item;
import farwestgame.FarWestGame;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Araceli Camarillo
 */
public class ResourcesMenuView extends View{
    
    public static double remainingNourishment = 0;
    public static int beginningWheel = 0;
    public static int beginningBullets = 0;
    public static int beginningWood = 0;
    public static double totalResourceWeight = 0;
           
    public ResourcesMenuView() {
        menuPrompt = getPrimaryInventoryString();
    }  
    
    
    private String getPrimaryInventoryString () {
    String primaryInventoryItems = "\n\nYou have the following items:  \n";
    Item[] items = FarWestGame.getCurrentGame().getItems();
    
    //This will show the starting weight amount of resources a player has.  
    for(int count = 0; count < items.length; count++){
        if (items[count].getName() == "Food" || items[count].getName() == "Spare Wheels" || items[count].getName() == "Bullets" || items[count].getName() == "Wood"){
        primaryInventoryItems += "\n" + count + " - " + items[count].getName() + " - Amount: " + items[count].getWeight() + " pounds."; //walk thru list of items
        }
    }    
      
    //This will populate the primary resources variables with starting amounts
        for(int count = 0; count < items.length; count++){
            if (items[count].getName() == "Food"){
                remainingNourishment = items[count].getAmount();
            }
            if (items[count].getName() == "Spare Wheels"){
                beginningWheel = items[count].getAmount();
            }
            if (items[count].getName() =="Bullets"){
               beginningBullets = items[count].getAmount();
            }
            if (items[count].getName() == "Wood"){
                beginningWood = items[count].getAmount();
            }
        }    
    
    primaryInventoryItems += "\n\nWhat Item Would you Like to get?(Q to Quit)";
       
    return primaryInventoryItems;
    }
    
    
    @Override
    public boolean doAction(String inputs) {
        Item[] items = FarWestGame.getCurrentGame().getItems();
      
        
        try {
            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);            
        } catch (ItemControlException ex) {
            Logger.getLogger(ResourcesMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
// This will let you choose which item you want to get.
        finally { 
            // System.out.println("\nYou have " + totalResourceWeight + " pounds of resources.\n");
        int value = Integer.parseInt(inputs); //week 11 put a catch around this so it doesnt' throw an error
        
        if (value < 0 || value >= items.length) {
            System.out.println("\nPlease Select a number from the Menu");
            return false;
        }      
          
            String addValue = String.valueOf(value);
            switch (addValue) {
                case "0":
                addFood(remainingNourishment);   
                
        try {
            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);            
        } catch (ItemControlException ex) {
            Logger.getLogger(ResourcesMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
                System.out.println("\n\nYou now have " + remainingNourishment + " pounds of food for a total of " + totalResourceWeight + " pounds of resources.\n\n");
        } break;
        
            case "3":
                addWheel();
                break;
            case "4":
                addBullets();
                break;
            case "5":
                addWood();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
            }
        }
        //menuPrompt = getPrimaryInventoryString(); //if doAction changes the values to the item the value will 
                                            //get updated with the new info thru this line
        return false;
    
    }
    
    public static double calResource(int beginningWheel, int beginningBullets, int beginningWood, double remainingNourishment) throws ItemControlException {

        // calculates the total resource weight
        double totalResourceWeight = (beginningWheel * 50) + (beginningBullets * .10) + (beginningWood * 10) + remainingNourishment;

        // calculates if total resource weight exceeds limits
        if (totalResourceWeight > 500500) {
            throw new ItemControlException("You have too much weight in the wagon.");
        } else {
            
            return totalResourceWeight;
        }
    }
    
    public double addFood(double remainingNourishment){
        Scanner scanner = new Scanner( System.in );
        System.out.println("How much food do you want to get?");
        String input = scanner.nextLine();
        double valFood = Integer.parseInt( input );         
        ResourcesMenuView.remainingNourishment = valFood + ResourcesMenuView.remainingNourishment;
        return ResourcesMenuView.remainingNourishment;
    }
        
    
    public void addWheel() {
        System.out.println("addWheel() called");
    }
    
    public void addBullets() {
        System.out.println("addBullets() called");
    }
    
    public void addWood() {
        System.out.println("addWood() called");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public String menu = "F - Insert Amount of Food\n"
                + "A - Insert Amount of Axe\n"
                + "H - Insert Amount of Hammer\n"
                + "W - Insert Amount of Spare Wheels\n"
                + "B - Insert Amount of Bullets\n"
                + "W - Insert Amount of Wood\n"
                + "R - Insert Amount of Rest\n"
                + "D - Insert Amount of Drinking Water\n"
                + "Q - Quit\n"
                + "Select an Option: ";
    
    public ResourcesMenuView() {
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "F":
                amountOfFood();
                break;
            case "A":
                toolAmountAxe();
                break;
            case "H":
                toolAmountHammer();
                break;
            case "W":
                resourceAmountWheels();
                break;
            case "B":
                resourceAmountBullets();
                break;
            case "R":
                restAmount();
                break;
            case "D":
                resourceAmountWater();
                break;    
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    public void amountOfFood() {
        System.out.println("Insert Amount of Food"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountAxe() {
        System.out.println("Insert Amount of Axe"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountHammer() {
        System.out.println("Insert Amount of Hammer"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWheels() {
        System.out.println("Insert Amount of Spare Wheels"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountBullets() {
        System.out.println("Insert Amount of Bullets"); //To change body of generated methods, choose Tools | Templates.
    }

    public void restAmount() {
        System.out.println("Insert Amount of Rest"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWater() {
        System.out.println("Insert Amount of Drinking Water"); //To change body of generated methods, choose Tools | Templates.
    }

  */
}
