package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameValues;
import byui.cit260.farWestGame.control.LocationControl;

/**
 *
 * @author Agustin
 */
public class LocationView extends View {    

    public LocationView(String menu) {
        super(menu);
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "Q":
                return true;
            default:
                moveLocation(menuItem);
                return true;                
        }
    }

    public static void moveLocation(String input) {
        LocationControl.moveLocation(input);
        System.out.println("This is " + GameValues.thisGameDestinationMile + " miles from Nauvoo");
    }
}
