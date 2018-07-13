package byui.cit260.farWestGame.view;

/**
 *
 * @author Agustin
 */
public class ItemsMenuView extends View {

    public static String menu = "What would you like to purchase:\n"
            + "F - Food\n"
            + "S - Spare Wheels\n"
            + "B - Bullets\n"
            + "W - Wood\n";

    public ItemsMenuView() {
        super(menu);
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "F":
                menuChoice("Food");
                break;
            case "S":
                menuChoice("Spare Wheels");
                break;
            case "B":
                menuChoice("Bullets");
                break;
            case "W":
                menuChoice("Wood");
                break;            
            case "Q":
                return true;
            default:
                this.console.println("Invalid option");
        }
        return false;
    }

    public void menuChoice(String choice) {
        AddRemoveItemView addRemoveItemView = new AddRemoveItemView(choice);
        addRemoveItemView.display();
    }    
   
} /* @Override
    public boolean doAction(String inputs) {

        try {
            totalResourceWeight = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        } // This will let you choose which item you want to get. // This will let you choose which item you want to get.
        finally {
            try {
                int value = Integer.parseInt(inputs); //week 11 put a catch around this so it doesnt' throw an error

                if (value < 0 || value >= items.length) {
                    System.out.println("\nPlease Select a number from the Menu");
                    return false;
                }

                String addValue = String.valueOf(value);

                switch (addValue) {
                    case "0":
                        addFood(remainingNourishment);
                        try {
                            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
                        } catch (ItemControlException ex) {
                            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            showNewItem();
                        }
                        break;

                    case "3":
                        addWheel(beginningWheel);
                        try {
                            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
                        } catch (ItemControlException ex) {
                            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            showNewItem();
                        }
                        break;

                    case "4":
                        addBullets(beginningBullets);
                        try {
                            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
                        } catch (ItemControlException ex) {
                            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            showNewItem();
                        }
                        break;

                    case "5":
                        addWood(beginningWood);
                        try {
                            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
                        } catch (ItemControlException ex) {
                            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            showNewItem();
                        }
                        break;

                    case "Q":
                        return true;

                    default:
                        System.out.println("Invalid option");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError " + e.getMessage());
                System.out.println("\nThis is not a number!!! \nPlease try again.");
            }
        }

        //menuPrompt = getPrimaryItemString(); //if doAction changes the values to the item the value will 
        //get updated with the new info thru this line
        // **** THIS IS NOT UPDATING ****
        return false;

    }*/ /*public static double remainingNourishment = 0;
    public static int beginningWheel = 0;
    public static int beginningBullets = 0;
    public static int beginningWood = 0;
    public static double totalResourceWeight = 0;

    public ItemsMenuView() {
        menuPrompt = getPrimaryItemString();
    }

    private String getPrimaryItemString() {
        String primaryItemItems = "\n\nWhat would you like to purchase:  \n";
        Item[] items = FarWestGame.getCurrentGame().getItems();

        // This will populate the primary resources variables with starting amounts
        for (int count = 0; count < items.length; count++) {
            if (items[count].getName() == "Food") {
                remainingNourishment = items[count].getAmount();
            }
            if (items[count].getName() == "Spare Wheels") {
                beginningWheel = items[count].getAmount();
            }
            if (items[count].getName() == "Bullets") {
                beginningBullets = items[count].getAmount();
            }
            if (items[count].getName() == "Wood") {
                beginningWood = items[count].getAmount();
            }
        }

        //This will show the starting weight amount of resources a player has.  
        for (int count = 0; count < items.length; count++) {
            if (items[count].getName() == "Food" || items[count].getName() == "Spare Wheels" || items[count].getName() == "Bullets" || items[count].getName() == "Wood") {
                primaryItemItems += "\n" + count + " - " + items[count].getName()/* + " - Amount: " + items[count].getWeight() + " pounds."*/; //walk thru list of items
/*      }
        }

        System.out.println("\nCurrent Item"
                + "\n----------------------------------"
                + "\nFood = " + remainingNourishment + " pounds"
                + "\nSpare Wheels = " + beginningWheel
                + "\nBullets = " + beginningBullets
                + "\nWood = " + beginningWood + " cords of wood");
        try {
            totalResourceWeight = calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemsMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Total resource weight = " + totalResourceWeight + " pounds.");

        primaryItemItems += "\nWhat item would you like to get?(Q to Quit)";

        return primaryItemItems;
    }

    public double addFood(double remainingNourishment) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much food do you want to get?");
        String input = scanner.nextLine();
        try {
            double valFood = Double.parseDouble(input);
            ItemsMenuView.remainingNourishment = valFood + ItemsMenuView.remainingNourishment;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
            System.out.println("\n\nThis is not a number!!! \nPlease try again.");
        }
        return ItemsMenuView.remainingNourishment;
    }

    public int addWheel(int beginningWheel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many wheels do you want to get?");
        String input = scanner.nextLine();
        try {
            int valWheel = Integer.parseInt(input);
            ItemsMenuView.beginningWheel = valWheel + ItemsMenuView.beginningWheel;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
            System.out.println("\n\nThis is not a number!!! \nPlease try again.");
        }
        return ItemsMenuView.beginningWheel;
    }

    public int addBullets(int beginningBullets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bullets do you want to get?");
        String input = scanner.nextLine();
        try {
            int valBullets = Integer.parseInt(input);
            ItemsMenuView.beginningBullets = valBullets + ItemsMenuView.beginningBullets;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
            System.out.println("\n\nThis is not a number!!! \nPlease try again.");
        }
        return ItemsMenuView.beginningBullets;
    }

    public int addWood(int beginningWood) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much wood do you want to cut?");
        String input = scanner.nextLine();
        try {
            int valWood = Integer.parseInt(input);
            ItemsMenuView.beginningWood = valWood + ItemsMenuView.beginningWood;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
            System.out.println("\n\nThis is not a number!!! \nPlease try again.");
        }
        return ItemsMenuView.beginningWood;
    }

    public void showNewItem() {
        System.out.println("\nNew Item"
                + "\n----------------------------------"
                + "\nFood = " + remainingNourishment + " pounds"
                + "\nSpare Wheels = " + beginningWheel
                + "\nBullets = " + beginningBullets
                + "\nWood = " + beginningWood + " cords of wood");
        System.out.println("Total resource weight = " + totalResourceWeight + " pounds.");
    }
 */
