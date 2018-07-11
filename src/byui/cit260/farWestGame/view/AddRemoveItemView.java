package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.cons.UtilsCons;

/**
 *
 * @author Agustin
 */
public class AddRemoveItemView extends View {

    public static String item;    

    public AddRemoveItemView(String item) {
        super(createMenu(item));
        this.item = item;
    }
    
    public static String createMenu(String item){
        return "Do you want to add or remove " + item + "?"
                                + "\n"
                                + "A - Add " + item + "\n"
                                + "R - Remove " + item + "\n"                               
                                + "Q - Quit\n"
                                + "Select an Option: ";
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase(); //all have 2B uppercase and assign to menuItem as uppercases
        switch (menuItem) {
            case "A":
                addItem();
                break;
            case "R":
                removeItem();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid Menu Item");
        }
        return false;
    }

    public void addItem() {
        AddRemoveItemAmountView addRemoveItemAmountView = new AddRemoveItemAmountView(item,UtilsCons.ADD);
        addRemoveItemAmountView.display();
    }

    public void removeItem() {
        AddRemoveItemAmountView addRemoveItemAmountView = new AddRemoveItemAmountView(item,UtilsCons.REMOVE);
        addRemoveItemAmountView.display();
    }

}
