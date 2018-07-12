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
                + "M - Move to next location\n"
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
                this.console.println("Invalid option");
        }
        return false;
    }
    
    //added by giovanni
    private void viewMap() {        
//       Game game = farwestgame.FarWestGame.getCurrentGame();
        this.console.println(MapControl.displayMap());
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
        this.console.println("Move to location called");
    }

    private void estimateNumberOfResources() {
        this.console.println("Estimate number of resources called");
    }

    private void repairWagons() {
        this.console.println("Repair wagons called");
    }

    private void useTools() {
        this.console.println("Use tools called");
    }

    private void dealSickness() {
        this.console.println("Deal with sickness called");
    }

    private void navigateTerrain() {
        this.console.println("Navigate terrain called");
    }

    private void huntForResources() {
        HuntingView huntingView = new HuntingView();
        huntingView.display();
    }
    
    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
    

    private void getHelp() {
        this.console.println("Get help called");
    }
    
    private void exitGame() {
        ExitGameView exitGameView = new ExitGameView();
        exitGameView.display();
    }
}
