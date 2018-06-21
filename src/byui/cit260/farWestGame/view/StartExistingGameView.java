package byui.cit260.farWestGame.view;

/**
 *
 * @author Agustin Gimenez 
 */
public class StartExistingGameView extends View{

    void displayStartExistingGameView() {
        System.out.println("displayStartExistingGameView called");
    }

    @Override
    public boolean doAction(String inputs) {
        System.out.println("doAction called");
        return true;
    }
    
}
