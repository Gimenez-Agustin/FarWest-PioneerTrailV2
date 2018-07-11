package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.MapControl;
import byui.cit260.farWestGame.model.Map;
import byui.cit260.farWestGame.model.Game;

/**
 *
 * @author Agustin Gimenez 
 */
public class GameMenuView extends View{    
    
    public static String menu = "V - View Map\n"
                + "I - View list inventory items\n"
                + "P - Purchase new supplies\n"
                + "L - Explore a location\n"
                + "M - Move to new location\n"
                + "E - Estimate the resources needed\n"
                + "B - Repair Wagons\n"
                + "C - Utilize tools\n"
                + "D - Deal with Sickness\n"
                + "N - Navigate Terrain\n"
                + "R - Hunt for Resources\n"
                + "S - Save game\n"
                + "G - Goodbye: Leave the game\n"
                + "H - Help\n"
                + "Q - Quit\n"
                + "Select an Option: ";

    public GameMenuView() {
        super(menu);
    }    
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase(); 
        switch (menuItem) {
            case "V":
                viewMap();
                break;
            case "I":
                viewInventoryItems();
                break;
            case "P":
                purchaseSupplies();
                break;
            case "L":
                exploreLocation();
                break;
            case "M":
                moveToLocation();
                break;
            case "E":
                estimateNumberOfResources();
                break;
            case "B":
                repairWagons();
                break;
            case "C":
                useTools();
                break;
            case "D":
                dealSickness();
                break;
            case "N":
                navigateTerrain();
                break;
            case "R":
                huntForResources();
                break;
            case "S":
                saveGame();
                break;
            case "G":
                exitGame();
                break;
            case "H":
                getHelp();
                break;    
            case "Q":
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }
    
    //added by giovanni
    private void viewMap() {        
//       Game game = farwestgame.FarWestGame.getCurrentGame();
        System.out.println(MapControl.displayMap());
    }
    //done
    
    private void viewInventoryItems() {
        ViewInventory viewInventory = new ViewInventory();
        viewInventory.display();
    }

    private void purchaseSupplies() {
        ItemsMenuView itemMenuView = new ItemsMenuView();
        itemMenuView.display();
    }

    private void exploreLocation() {
        ExploreLocationView exploreLocationView = new ExploreLocationView();
        exploreLocationView.display(exploreLocationView.menu);
    }

    private void moveToLocation() {
        System.out.println("Move to location called");
    }

    private void estimateNumberOfResources() {
        System.out.println("Estimate number of resources called");
    }

    private void repairWagons() {
        System.out.println("Repair wagons called");
    }

    private void useTools() {
        System.out.println("Use tools called");
    }

    private void dealSickness() {
        System.out.println("Deal with sickness called");
    }

    private void navigateTerrain() {
        System.out.println("Navigate terrain called");
    }

    private void huntForResources() {
        HuntingView huntingView = new HuntingView();
        huntingView.display();
    }

    private void saveGame() {
        System.out.println("Save game called");
    }

    private void getHelp() {
        System.out.println("Get help called");
    }
    
    private void exitGame() {
        ExitGameView exitGameView = new ExitGameView();
        exitGameView.display();
    }
}
