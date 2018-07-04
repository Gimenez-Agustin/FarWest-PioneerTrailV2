package byui.cit260.farWestGame.view;

/**
 *
 * @author Giovanni
 */
public interface ViewInterface {
    
    public void display(String menu);
    public void display();
    /**
     *
     * @param promptMessage
     * @return
     */
    public String getInputs(String menu);
    public String getInput();
    public boolean doAction(String inputs);    
}
