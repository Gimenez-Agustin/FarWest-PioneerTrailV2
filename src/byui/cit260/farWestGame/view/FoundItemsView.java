package byui.cit260.farWestGame.view;

/**
 *
 * @author Agustin
 */
public class FoundItemsView extends View{

    

    public FoundItemsView(String menu) {
        super(menu);
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "A":
                
                break;
            case "B":
               
                break;
            case "C":
               
                break;
            case "Q":
                return true;
            default:
                this.console.println("choose a correct option or choose Q to exit menu");
        }
        return false;
    }
    
}
