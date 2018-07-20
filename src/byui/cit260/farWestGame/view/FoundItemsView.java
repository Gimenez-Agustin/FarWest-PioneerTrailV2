package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.UtilsControl;
import byui.cit260.farWestGame.model.ObjectDTO;

/**
 *
 * @author Agustin
 */
public class FoundItemsView extends View {

    ObjectDTO objectDTO;

    public FoundItemsView(ObjectDTO objectDTO) {
        super(objectDTO.getMenu());
        this.objectDTO = objectDTO;
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        if(UtilsControl.isInteger(menuItem)){
            int num = Integer.valueOf(menuItem);
            if (num > objectDTO.getItems().size()) {
                this.console.println("choose a correct option or choose Q to exit menu");
                return false;
            }else{
                int ind=num-1;
                FoundItemAddView foundItemAddView= new FoundItemAddView(objectDTO.getItems().get(ind));
                foundItemAddView.display();
            }
        }
        else if(menuItem.equals("Q")){
            return true;
        }
        return false;
        
    }

            
    

}
