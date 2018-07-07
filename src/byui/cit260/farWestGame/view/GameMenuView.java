package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.MapControl;
import byui.cit260.farWestGame.model.Map;
import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Location;

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
                + "G - Goodbye: Leave the game\n"
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
//        System.out.println("View map called");
//        String leftChar;
//        String rightChar;
        
       Game game = farwestgame.FarWestGame.getCurrentGame();
//       game.setSeenMap(true);
       Map map = game.getMap();


        MapControl.displayMap(map);

//        Map map = farwestgame.FarWestGame.getPlayer().getGames().get(0).getMap();
//       int i=1;
//       for(Location location: map.getLocations()){           
//           System.out.println(i + "-" + location.getLocationDescription().getName());
//           i++;
//       }





//       Location[][] locationS = map.getLocations();
       
//        System.out.println("       FAR WEST PIONEER TRAIL");
//        System.out.println("  |");
//          for( int column = 0; column < locationS[0].length; column++){
//            if (column < 10)
//                System.out.println("  " + column + " |");
//            else
//                System.out.println(" " + column + " |");
//          }
          
          
//        System.out.println();
//          for( int row = 0; row < locationS.length; row++){
//           System.out.println(row + " "); 
//            for( int column = 0; column < locationS[row].length; column++){
//              leftChar = " ";
//              rightChar = " ";
//              if(locationS[row][column] == map.getCurrentLocation()){
//                leftChar = ">>"; 
//                rightChar = "<<"; 
//              } 
//              else if(locationS[row][column].isVisited()){
//                 leftChar = "**"; 
//                 rightChar = "**"; 
//              }
//             System.out.println("|");
//              if(locationS[row][column].getScene() == null)
//              {
//                   System.out.println(leftChar + "XXX" + rightChar);
//              }
//              else
//                System.out.println(leftChar
//                   + locationS[row][column].getScene().getMapSymbol()
//                   + rightChar);
//            }
//           System.out.println("|");
//          } 
//          if (map.getCurrentLocation().getScene() != null)
//              System.out.println("Your current location is: "
//                + map.getCurrentLocation().getScene().getName()
//                + "\nYou are " + map.getCurrentLocation().getScene().getFromNauvoo() + " miles from Nauvoo!"
//                + "\n" + map.getCurrentLocation().getScene().getDescription()
//                + "\nYou only have " + (1297 - map.getCurrentLocation().getScene().getFromNauvoo()) 
//                + " miles left to go. \nKeep it up!!");  
    }
    //done
    
    private void viewInventoryItems() {
        ViewInventory viewInventory = new ViewInventory();
        viewInventory.display();
    }

    private void purchaseSupplies() {
        ResourcesMenuView resourcesMenuView = new ResourcesMenuView();
        resourcesMenuView.display();
    }

    private void exploreLocation() {
        ExploreLocationView exploreLocationView = new ExploreLocationView();
        exploreLocationView.display(exploreLocationView.menu);
//        int value = 0;
//        while (value == 0) {
//            System.out.println("how much do you want to explore?");
//            System.out.println("a: 1 hour             Probability to find something:45%");
//            System.out.println("b: 2 hours            Probability to find something:65%");
//            System.out.println("c: more than 2 hours  Probability to find something:90%");
//            Scanner scanner = new Scanner(System.in);
//            String val = scanner.nextLine();
//            switch (val.toUpperCase()) {
//                case "A":
//                    value = 1;
//                    break;
//                case "B":
//                    value = 2;
//                    break;
//                case "C":
//                    value = 3;
//                    break;
//                case "Q":
//                    value = -1;
//                default:
//                    System.out.println("choose a correct option or choose Q to exit menu");
//            }
//            if (value > 0) {
//                GameControl.exploreLocation(value);
//            }
//
//        }
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
        exitGameView.display(exitGameView.menu);
    }
}
