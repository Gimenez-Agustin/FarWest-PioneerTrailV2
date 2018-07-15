package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.ItemControl;
import byui.cit260.farWestGame.exceptions.ItemControlException;

/**
 *
 * @author agustin
 */

//agustin individual
public class FamilyItemsReportView extends View{
    
    public static String menu = "P - Print the report\n"
                + "R - Save file of report\n"
                + "B - Print and save report\n"                
                + "Select an Option: ";

    public FamilyItemsReportView() {
        super(menu);
    }    
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase(); 
        switch (menuItem) {
            case "P":
                printReport();
                break;
            case "R":
                saveReport();
                break;
            case "B":
                saveReport();
                printReport();                
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invalid option");
        }
        return false;
    }
    
    public void printReport(){
        try {
            this.console.println(ItemControl.printReport());
        } catch (ItemControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
    
    public void saveReport(){
        this.console.println("\nEnter the name of the file"
                           + "\nto save the Report");
        String filePath = this.getInput();        
        try {           
           ItemControl.saveReport(filePath);           
           this.console.println("Succesfully saved");
        } catch (ItemControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
    
}
