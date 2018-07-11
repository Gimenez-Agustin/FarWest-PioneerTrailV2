package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.ItemControl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class AddRemoveItemAmountView extends View {

    public static String item;
    public static String action;

    public AddRemoveItemAmountView(String item, String action) {
        super(createMenu(item, action));
        this.item = item;
        this.action = action;
    }

    public static String createMenu(String item, String action) {
        return "How much do you want to " + createAction(action) + " " + item + "?"
                + "\n"
                + "Select an amount or Q to quit: ";
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem) {
            case "Q":
                return true;
            default:
                try {
                    int amount = ItemControl.getAmount(inputs);
                    this.console.println(ItemControl.manageItems(item, amount, action));
                    return true;
                } catch (NumberFormatException e) {
                    Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, e);
                    //System.out.println("\nError " + e.getMessage()); //changed per Lesson 12 page 11 instructions
                    ErrorView.display(this.getClass().getName(), "\nError " + e.getMessage());
                    // System.out.println("\nThis is not a number!!! \nPlease try again."); //changed per Lesson 12 page 11 instructions
                    ErrorView.display(this.getClass().getName(), "\nThis is not a number!!! \nPlease try again.");
                }
        }
        return false;
    }

    public static String createAction(String action) {
        return(action);
    }

}
