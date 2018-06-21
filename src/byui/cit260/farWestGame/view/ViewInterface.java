package byui.cit260.farWestGame.view;

/**
 *
 * @author Giovanni
 */
public interface ViewInterface {
    
    public void display(String menu);

    /**
     *
     * @param promptMessage
     * @return
     */
    public String getInputs(String menu);
    public boolean doAction(String inputs);    
}
