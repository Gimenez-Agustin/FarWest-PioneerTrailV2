package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.MapControl;
import farwestgame.FarWestGame;

/**
 *
 * @author Agustin Gimenez 
 */
public class GameMenuView extends View{    
    
    public static String menu =   "V - View Map\n"
                                + "I - View list inventory items\n"
                                + "P - Purchase new supplies\n"
                                + "L - Explore a location\n"
                                + "M - Move to location\n"
                                + "X - Print reports\n"
                                + "B - Repair Wagons\n"
                                + "D - Deal with Sickness\n"
                                + "R - Hunt for Resources\n"
                                + "S - Save game\n"
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
            case "X":
                printReports();
                break;
            case "B":
                repairWagons();
                break;            
            case "D":
                dealSickness();
                break;
            case "R":
                huntForResources();
                break;
            case "S":
                saveGame();
                break;
            case "H":
                getHelp();
                break;    
            case "Q":
                FarWestGame.setCurrentGame(null);
                FarWestGame.setPlayer(null);
                return true;
            default:
                this.console.println("Invalid option");
        }
        return false;
    }
    
    //added by giovanni
    private void viewMap() {        
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
        String menu = MapControl.displayMap() + "\n example: if you want to go to Platte River type 2-1" + "\n Select position: ";
        LocationView locationView = new LocationView(menu);
        locationView.display();
    }
    
    private void printReports() {
        ReportsView reportsView = new ReportsView();
        reportsView.display();
    }

    private void repairWagons() {
        this.console.println("Repair wagons called");
    }

    private void dealSickness() {
        this.console.println("Deal with sickness called");
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
    
}
