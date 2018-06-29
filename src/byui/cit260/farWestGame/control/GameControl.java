package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Person;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.model.ActorType;
import java.util.List;

/**
 *
 * @author agustin
 */
public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("Start game called");
    }

    public static void exploreLocation(int hours) {
        int total = DiceControl.rollDices(3);
        switch (hours) {
            case 1:
                if (total > 10) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 2:
                if (total > 6) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 3:
                if (total > 2) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            default:
                System.out.println("There was an error, please try again");
        }
    }

    /**
     *
     * @author Agustin Gimenez FGL (Individual Assignment)
     * @param family
     * @return 
     */
    public boolean gameWonLost(List<Person> family) {
        int count = 0;
        for (Person actor : family) {
            if (actor.isAlive()) {
                count++;
            }
        }
        return count > 2;
    }

    //author Giovanni
    public static void hunting(int animal) {
        animal = 5;
        System.out.println("you killed something");        
    }
    
    //author Araceli create Actors
    public static ActorType[] createActors() {
        //actors = create an array Actor objects
        ActorType[] actors;
        //actor1 = new Actor object
        ActorType actor1 = actors[ActorType.Joe.ordinal()];
        ActorType actor2 = actors[ActorType.Cora.ordinal()];
        ActorType actor3 = actors[ActorType.Billy.ordinal()];
        ActorType actor4 = actors[ActorType.Gigi.ordinal()];
 //Assign values to each attribute in the Actor object
            //Assign actor1 to the next position in the actors array
            //actor2 = new Actor object
            //Assign values to each attribute in the Actor object
            //Assign actor2 to the next position in the actors array
            //…
            //…
    //return items;
}
    
}
