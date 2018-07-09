package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.enums.Items;
import byui.cit260.farWestGame.model.Item;
import farwestgame.FarWestGame;
import java.util.ArrayList;
import java.util.Collections;
import byui.cit260.farWestGame.exceptions.ItemControlException;

/**
 *
 * @author agustin
 */
public class ItemControl {

    public static void loadItemsCurrentGame() {
        if (!FarWestGame.getCurrentGame().getMap().getCurrentLocation().isVisited()) {
            //example found in https://stackoverflow.com/questions/8115722/generating-unique-random-numbers-in-java
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i = 0; i < 3; i++) {
                int amount = UtilsControl.getRandom(5);                
                Item item = createItem(getItems(list.get(i)), amount);
                FarWestGame.getCurrentGame().getMap().getCurrentLocation().getItems().add(item);
            }
            LocationControl.updateVisited();
        }
    }

    public static String displayCurrentItems() {
        int total=0;
        String output="";
        for (Item item : LocationControl.getCurrentLocation().getItems()) {
            int subTotal=calTotalWieght(item);
            output+="--------------------------------\n";
            output+="Name:         " + item.getName() + "\n";
            output+="Amount:       " + item.getAmount() + "\n";
            output+="Weight:       " + item.getWeight() + "\n";
            output+="Total Weight: " + subTotal + "\n";
            total+=subTotal;
            output+="--------------------------------\n";
        }
        output+="Total items Weight: " + total + "\n";
        return output;
    }

    public static int calTotalWieght(Item item) {
        return (item.getAmount() * item.getWeight());
    }

    public static Item createItem(Items items, int amount) {
        Item item = new Item();
        item.setAmount(amount);
        item.setName(items.getName());
        item.setTypeItem(items.getTypeItem());
        item.setWeight(items.getWeight());
        return item;
    }
    

    public static Items getItems(int i) {
        for (Items items : Items.values()) {
            if (items.getId() == i) {
                return items;
            }
        }
        return null;
    }

    // Author Giovanni (team assignment)
    public static double calNourishmentUsed (int numberActors, int milesTraveled) throws ItemControlException {
        // checks to make sure you don't have too many or not enough actors
        if (numberActors < 1 || numberActors > 4) {
            throw new ItemControlException("There amount of family members is incorrect.");
        }

        /* checks to make sure the program did not return an 
           invalid number of miles traveled */
        if (milesTraveled < 0) {
            throw new ItemControlException("You can't go backwards in your journey.");
        }

        /*  following blocks of code will check to see if the miles traveled 
            caused the family to use more nourishment than the max allows */
        if (numberActors == 1 && milesTraveled > 500) {
            throw new ItemControlException("You don't have enough food to travel this far.  Game over.");
        }

        if (numberActors == 2 && milesTraveled > 333) {
            throw new ItemControlException("You don't have enough food to travel this far.  Game over.");
        }

        if (numberActors == 3 && milesTraveled > 250) {
            throw new ItemControlException("You don't have enough food to travel this far.  Game over.");
        }

        if (numberActors == 4 && milesTraveled > 200) {
            throw new ItemControlException("You don't have enough food to travel this far.  Game over.");
        }

        // code calculates the nourishment used by the group
        double nourishmentUsed = .5 * milesTraveled * (numberActors + 1);

        return nourishmentUsed;
    }

    // Author Giovanni (individual assignment)
    public static double calResource(int beginningWheel, int beginningBullets, int beginningWood, double remainingNourishment) throws ItemControlException {

        // checks to make sure that beginning wheel does not exceed max
        if (beginningWheel < 0 || beginningWheel > 10) {
            throw new ItemControlException("You can't have more than 10 wheels, or less than none.");
        }

        // checks to make sure that beginning bullets do not exceed max
        if (beginningBullets < 0 || beginningBullets > 5000) {
            throw new ItemControlException("You can't have more than 5000 bullets, or less than none.");
        }

        // checks to make sure that beginning wood does not exceed max
        if (beginningWood < 0 || beginningWood > 50) {
            throw new ItemControlException("You can't have more than 50 pieces of wood, or less than none.");
        }

        // checks to make sure that beginning nourishment does not exceed max
        if (remainingNourishment < 0 || remainingNourishment > 500) {
            throw new ItemControlException("You can't have more than 500 lbs of food, or less than none.");
        }

        // calculates the total resource weight
        double totalResourceWeight = (beginningWheel * 50) + (beginningBullets * .10) + (beginningWood * 10) + remainingNourishment;

        // calculates if total resource weight exceeds limits
        if (totalResourceWeight > 700) {
            throw new ItemControlException("You have too much weight in the wagon.");
        } else {
            return totalResourceWeight;
        }
    }

    //Author Araceli Camarillo (Team Assignment)
    public static double calSupplyUsed(int beginningWheel, int beginningBullets, int beginningWood, int wheelUsed, int bulletsUsed, int woodUsed) throws ItemControlException {
        if (beginningWheel < 0 || beginningWheel > 10) {
            throw new ItemControlException("You can't have more than 10 wheels, or less than none.");
        }

        if (beginningBullets < 0 || beginningBullets > 5000) {
            throw new ItemControlException("You can't have more than 5000 bullets, or less than none.");
        }

        if (beginningWood < 0 || beginningWood > 50) {
            throw new ItemControlException("You can't have more than 50 pieces of wood, or less than none.");
        }

        if (wheelUsed > beginningWheel) {
            throw new ItemControlException("You can't use more wheels than you can have.");
        }

        if (bulletsUsed > beginningBullets) {
            throw new ItemControlException("You can't use more bullets than you can have.");
        }

        if (woodUsed > beginningWood) {
            throw new ItemControlException("You can't use more wood than you can have.");
        }

        beginningWheel = -wheelUsed;
        beginningBullets = -bulletsUsed;
        beginningWood = -woodUsed;

        double supplyWeight = (beginningWheel * 50) + (beginningBullets * 0.1) + (beginningWood * 10);

        double[] supplyResult;
        supplyResult = new double[4]; //create an array of 4 elements
        supplyResult[0] = beginningWheel;
        supplyResult[1] = beginningBullets;
        supplyResult[2] = beginningWood;
        supplyResult[3] = supplyWeight;

        return 1;
        // return 1 and double changed per instructions in Lesson 11 Team assignment page 5
    }

    //Author Agustin Gimenez (FGL) (Team Assignment)
    public static double calSupplyFound(int userWheel, int userBullets, int userWood, int beginningWheel, int beginningBullets, int beginningWood, int wheelAvailable, int bulletsAvailable, int woodAvailable) throws ItemControlException {

        if (beginningWheel < 0 || beginningWheel > 10) {
            throw new ItemControlException("You can't have more than 10 wheels, or less than none.");
        }

        if (beginningBullets < 0 || beginningBullets > 5000) {
            throw new ItemControlException("You can't have more than 5000 bullets, or less than none.");
        }

        if (beginningWood < 0 || beginningWood > 50) {
            throw new ItemControlException("You can't have more than 50 pieces of wood, or less than none.");
        }

        if (userWheel > wheelAvailable) {
            throw new ItemControlException("You can't request more wheels than are available.");
        }

        if (userBullets > bulletsAvailable) {
            throw new ItemControlException("You can't request more bullets than are available.");
        }

        if (userWood > woodAvailable) {
            throw new ItemControlException("You can't request more wood than is available.");
        }

        if (beginningWheel + userWheel > 10) {
            throw new ItemControlException("You can't request more than 10 wheels.");
        }

        if (beginningBullets + userBullets > 10) {
            throw new ItemControlException("You can't request more than 10 bullets.");
        }

        if (beginningWood + userWood > 10) {
            throw new ItemControlException("You can't request more than 10 pieces of wood.");
        }

        int wheel = 50;
        double bullets = 0.1;
        int wood = 10;

        beginningWheel = +userWheel;
        beginningBullets = +userBullets;
        beginningWood = +userWood;

        double supplyWeight = (beginningWheel * wheel) + (beginningBullets * bullets) + (beginningWood * wood);

        if (supplyWeight > 700) {
            throw new ItemControlException("You have more than you can carry.");
        } else {
            return supplyWeight;
        }
    }
}
