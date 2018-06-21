package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Agustin Gimenez 
 */
public class GameMenuView extends View{
    
    public String menu = "V - View Map\n"
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
                + "H - Help\n"
                + "Q - Quit\n"
                + "Select an Option: ";

    public void GameMenuView() {
        
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
    
    private void viewMap() {
        System.out.println("View map called");
    }

    private void viewInventoryItems() {
        System.out.println("View inventory items called");
    }

    private void purchaseSupplies() {
        System.out.println("Purchase supplies called");
    }

    private void exploreLocation() {
        int value = 0;
        while (value == 0) {
            System.out.println("how much do you want to explore?");
            System.out.println("a: 1 hour             Probability to find something:45%");
            System.out.println("b: 2 hours            Probability to find something:65%");
            System.out.println("c: more than 2 hours  Probability to find something:90%");
            Scanner scanner = new Scanner(System.in);
            String val = scanner.nextLine();
            switch (val.toUpperCase()) {
                case "A":
                    value = 1;
                    break;
                case "B":
                    value = 2;
                    break;
                case "C":
                    value = 3;
                    break;
                case "Q":
                    value = -1;
                default:
                    System.out.println("choose a correct option or choose Q to exit menu");
            }
            if (value > 0) {
                GameControl.exploreLocation(value);
            }

        }
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
        System.out.println("Hunt for resources called");
    }

    private void saveGame() {
        System.out.println("Save game called");
    }

    private void getHelp() {
        System.out.println("Get help called");
    }
}
