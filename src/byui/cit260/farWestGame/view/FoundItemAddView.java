package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.cons.UtilsCons;
import byui.cit260.farWestGame.control.ItemControl;
import byui.cit260.farWestGame.control.UtilsControl;
import byui.cit260.farWestGame.model.Item;

/**
 *
 * @author Agustin
 */
public class FoundItemAddView extends View{
    
    Item item;
    
    public FoundItemAddView(Item item) {
        super("How much " + item.getName() + " do you want to add ");
        this.item=item;
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        if(UtilsControl.isInteger(menuItem)){
            int num = Integer.valueOf(menuItem);
            if(item.getAmount()<num){
                this.console.println("the max value is " + item.getAmount() + " please try again.");
                return false;
            }else{
                ItemControl.manageItems(item.getName(), num, UtilsCons.ADD);
                this.console.println("the item was add to your list");
                return true;
            }
        }
        else if(menuItem.equals("Q")){
            return true;
        }
        return false;
    }

}
