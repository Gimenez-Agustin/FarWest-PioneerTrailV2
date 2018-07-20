/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import byui.cit260.farWestGame.exceptions.GameControlException;

/**
 *
 * @author Agustin Gimenez
 */
public class ExploreLocationView extends View {

    public static String menu = "how much do you want to explore?\n"
            + "A: 1 hour             Probability to find something:45%\n"
            + "B: 2 hours            Probability to find something:65%\n"
            + "C: More than 2 hours  Probability to find something:90%\n"
            + "Q: Exit menu";

    public ExploreLocationView() {
        super(menu);
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "A":
                this.exploreLocation(1);
                break;
            case "B":
                this.exploreLocation(2);
                break;
            case "C":
                this.exploreLocation(3);
                break;
            case "Q":
                return true;
            default:
                this.console.println("choose a correct option or choose Q to exit menu");
        }
        return false;
    }

    public void exploreLocation(int value) {
        try {            
            FoundItemsView foundItemsView = new FoundItemsView(GameControl.exploreLocation(value));
            foundItemsView.display();
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
