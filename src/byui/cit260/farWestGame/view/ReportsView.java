/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import byui.cit260.farWestGame.control.GameValues;
import farwestgame.FarWestGame;
import byui.cit260.farWestGame.model.Item;
import byui.cit260.farWestGame.control.MapControl;
import byui.cit260.farWestGame.exceptions.GameControlException;
import byui.cit260.farWestGame.model.Location;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

    private String getReportsString() {
        String reportList = "\n"
                + "\n------------------------------------------------"
                + "\n| Reports Menu                                 |"
                + "\n------------------------------------------------"
                + "\nI - Print Inventory"
                + "\nM - Print Map"
                + "\nF - Print Family Items"
                + "\nQ - Quit"
                + "\nPlease choose an option: ";

        return reportList;

    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        Location location = new Location();//creating new object of locationControl

        switch (value) {
            case "I": // show the inventory
                this.printInventory();
                break;
            case "M": // show the map
                this.printMap(MapControl.displayMap(), location.getName());
                break;
            case "F":
                this.printFamilyItems();
                break;
            default:
                this.console.println("\nInvalid Selection - Please choose an option from the menu.");
                break;
        }

        return false;
    }

    //Giovanni
    private void printInventory() {
        String myItems = "";
        
        myItems += "\nCurrent Inventory"
                + "\n----------------------------------"
                + "\nFood = " + GameValues.thisGameNourishment + " pounds"
                + "\nSpare Wheels = " + GameValues.thisGameWheel
                + "\nBullets = " + GameValues.thisGameBullets
                + "\nWood = " + GameValues.thisGameWood + " cords of wood"
                + "\n TOTAL WEIGHT = " + GameValues.thisGameResourceWeight + " pounds";

        //String inputs = null;      
        //console.println("\n*** TO PRINT THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to Quit): ");
        console.println(myItems);
        String fileName = this.getInputs("\n*** TO SAVE THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to not save it): ");
        fileName += ".txt";
        if (fileName.toUpperCase().equals("q.txt") || fileName.toUpperCase().equals("Q.txt")) { // user wants to quit
            //printMessage = inputs;
            return; // exit the view
        }
        try {
            GameControl.printReport(myItems, fileName);
            console.println("Your items were printed to " + fileName);

        } catch (GameControlException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Araceli Camarillo
    private void printMap(String content, String location) {
        String fileName = getInputs("Please Enter a File Name or Press (Q) to Cancel");

        BufferedWriter bw = null;
        FileWriter fw = null;
        int i = 0;
        int j = 0;
        String Names = "";

        try {

            Location[][] locations = FarWestGame.getCurrentGame().getMap().getLocations();
            for (i = 0; i < locations.length; i++) {
                for (j = 0; j < locations.length; j++) {
                    String locationName = locations[i][j].getName();//FarWestGame.getCurrentGame().getMap().getCurrentLocation().getName();
                    console.println(locationName);
                    if (locationName != "") {
                        Names = Names + locationName + "\r\n";
                    }
                }
            }
            //String content = "This is the content to write into file\n";

            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content + "\r\n" + Names);

            System.out.println("Done.File "+ fileName+ " Has Been Created");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

    }
    
    //agustin individual
    private void printFamilyItems() {
        FamilyItemsReportView familyItemsReportView = new FamilyItemsReportView();
        familyItemsReportView.display();
    }

    //private void printMap() {}
//MapPrint mapPrint = null;
    //this.console.println(MapControl.displayMap());
//            String fileName = this.("\n*** TO PRINT THIS REPORT, PLEASE ENTER A FILE NAME (or type 'Q' to Quit): ");
//        if (fileName.toUpperCase().equals("Q")) { // user wants to quit
////            //printMessage = inputs;
//            return; // exit the view
//        }
//        try {
//            GameControl.printReport(displayMap, fileName);
//            console.println("Your Map has been printed to "+ fileName);
//            
//        } catch (GameControlException ex) {
//            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      }
}
