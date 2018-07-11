package byui.cit260.farWestGame.view;

/**
 *
 * @author Araceli Camarillo
 */
public class HelpMenuView extends View {

    public static String menu =   "G - What is the goal of the game?\n"
                                + "M - How to move\n"
                                + "E - Estimate the number of resources\n"
                                + "R - Use the resources\n"
                                + "Q - Quit\n"
                                + "Select an Option: ";

    public HelpMenuView() {
        super(menu);
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase(); //all have 2B uppercase and assign to menuItem as uppercases
        switch (menuItem) {
            case "G":
                goalOfGame();
                break;
            case "M":
                howToMove();
                break;
            case "E":
                estimateNumberOfResources();
                break;
            case "R":
                useTheResources();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid Menu Item");
        }
        return false;
    }

    public void goalOfGame() {
        System.out.println("goal of the game called");
    }

    public void howToMove() {
        System.out.println("how to move called");
    }

    public void useTheResources() {
        System.out.println("use the resource called");
    }

    public void estimateNumberOfResources() {
        System.out.println("estimate number of resources called");
    }

}
