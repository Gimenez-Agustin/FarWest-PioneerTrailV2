/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;
import byui.cit260.farWestGame.control.GameControl;
import farwestgame.FarWestGame;
import byui.cit260.farWestGame.model.Item;
import byui.cit260.farWestGame.control.ItemControl;
import byui.cit260.farWestGame.exceptions.GameControlException;
import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovanni
 */
public class ReportsView extends View {
    
    public ReportsView() {
        menuPrompt = getReportsString(); //this builds menu
    }
    
    private String getReportsString(){
        String reportList = "\n"
            + "\n------------------------------------------------"
            + "\n| Reports Menu                                 |"
            + "\n------------------------------------------------"
            + "\nI - Print Inventory"
            + "\nM - Print Map"   
            + "\nQ - Quit"
            + "\nPlease choose an option: ";
        
        return reportList;
        
        
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "I": // show the inventory
                this.printInventory();
                break;
                case "M": // show the map
                this.printMap();
                break;
            default:
                this.console.println("\nInvalid Selection - Please choose an option from the menu.");
                break;
        }
        
        return false;
    }
    
    //Giovanni
    private void printInventory(){
        String myItems = "";
        Item[] items = FarWestGame.getCurrentGame().getItems();
        
        double remainingNourishment = 0;
        int beginningWheel = 0;
        int beginningBullets = 0;
        int beginningWood = 0;
        double totalResourceWeight = 0;

        // This will populate the primary resources variables with starting amounts
        for (int count = 0; count < items.length; count++) {
            if (items[count].getName() == "Food") {
                remainingNourishment = items[count].getAmount();
            }
            if (items[count].getName() == "Spare Wheels") {
                beginningWheel = items[count].getAmount();
            }
            if (items[count].getName() == "Bullets") {
                beginningBullets = items[count].getAmount();
            }
            if (items[count].getName() == "Wood") {
                beginningWood = items[count].getAmount();
            }
        }
        
        
        myItems += "\nCurrent Inventory"
                + "\n----------------------------------"
                + "\nFood = " + remainingNourishment + " pounds"
                + "\nSpare Wheels = " + beginningWheel
                + "\nBullets = " + beginningBullets
                + "\nWood = " + beginningWood + " cords of wood";
        
        
        
        
        
        //String inputs = null;      
        //console.println("\n*** TO PRINT THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to Quit): ");
        
        String fileName = this.getInputs("\n*** TO PRINT THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to Quit): ");
        if (fileName.toUpperCase().equals("Q")) { // user wants to quit
            //printMessage = inputs;
            return; // exit the view
        }
        try {
            GameControl.printReport(myItems, fileName);
            console.println("Your items were printed to "+ fileName);
            
        } catch (GameControlException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
        private void printMap() {
        int row = 0;
        int column = 0;                         
        String mapCo = "";
        Map map = FarWestGame.getCurrentGame().getMap();
        mapCo += ("| X |  0  |  1  |  2  |  3  |  4  |");
        for (Location location : map.getLocations()) {
            if (column == 0) {
                mapCo+= ("| " + row + " |");
            }
            mapCo+= (currentVisited(location.isVisited(),isCurrent(location, map.getCurrentLocation()), true));
            mapCo+= (createSymbol(location.getLocationDescription().getSymbol()));
            mapCo+= (currentVisited(location.isVisited(),isCurrent(location, map.getCurrentLocation()),false));            
            mapCo+= ("|");
            column++;
            if (column == 5) {               
                mapCo+= ("");
                column = 0;
                row++;
            }
        
        }
      }

    
    
}
