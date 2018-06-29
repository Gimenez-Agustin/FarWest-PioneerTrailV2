package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Person;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.model.ActorType;
import byui.cit260.farWestGame.model.Illness;
import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.model.Scene;
import byui.cit260.farWestGame.model.Map;
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
    public static Person[] createActors() {
        //actors = create an array Actor objects
        Person[] actors = new Person[4];
        
        //actor1 = new Actor object
        Person actor = new Person();
        //Assign values to each attribute in the Actor object
        actor.setName("Joe");
        //actor.setDescription("Is the Father of Billy and Gigi and husband to Cora");//based on enum
        actor.setDescription(ActorType.Joe.getDescription());
        actor.setAlive(true);
        Illness illness = new Illness();
        illness.setMortalityRate(50);
        illness.setTypeIllness("Severe");
        illness.setName("Hypothermia");
        actor.setIllness(illness);
        
        actors [ActorType.Joe.ordinal()] = actor; //inactors array pos 0 is gonna be this actor
        
        actor = new Person();
        //Assign values to each attribute in the Actor object
        actor.setName("Cora");
        //actor.setDescription based on enum
        actor.setDescription(ActorType.Cora.getDescription());
        actor.setAlive(true);
        illness = new Illness();
        illness.setMortalityRate(50);
        illness.setTypeIllness("Moderate");
        illness.setName("Broken Bone");
        actor.setIllness(illness);
        
        actors [ActorType.Cora.ordinal()] = actor;
               
        actor = new Person();
        //Assign values to each attribute in the Actor object
        actor.setName("Billy");
        //actor.setDescription based on enum
        actor.setDescription(ActorType.Billy.getDescription());
        actor.setAlive(true);
        illness = new Illness();
        illness.setMortalityRate(50);
        illness.setTypeIllness("Moderate");
        illness.setName("Fever");
        actor.setIllness(illness);
        
        actors [ActorType.Billy.ordinal()] = actor;
        
        actor = new Person();
        //Assign values to each attribute in the Actor object
        actor.setName("Jane");
        //actor.setDescription based on enum
        actor.setDescription(ActorType.Jane.getDescription());
        actor.setAlive(true);
        illness = new Illness();
        illness.setMortalityRate(50);
        illness.setTypeIllness("Severe");
        illness.setName("Snake Bite");
        actor.setIllness(illness);
        
        actors [ActorType.Jane.ordinal()] = actor;
        
        return actors;
}
    //added by giovanni
    static void assignScenes(Map map, Scene[] scenes){
        Location[][] locationS = map.getLocations();
        
        // starting point
        locationS[0][0].setScene(scenes[MapControl.SceneType.nauvoo.ordinal()]);
        locationS[0][1].setScene(scenes[MapControl.SceneType.sugarCreek.ordinal()]);
        locationS[0][2].setScene(scenes[MapControl.SceneType.richardsonPoint.ordinal()]);
        locationS[0][3].setScene(scenes[MapControl.SceneType.charitonRiverCrossing.ordinal()]);
        locationS[0][4].setScene(scenes[MapControl.SceneType.locustCreek.ordinal()]);
        locationS[0][5].setScene(scenes[MapControl.SceneType.gardenGrove.ordinal()]);
        locationS[0][6].setScene(scenes[MapControl.SceneType.nishnabotnaRiver.ordinal()]);
        locationS[0][7].setScene(scenes[MapControl.SceneType.grandEncampment.ordinal()]);
        locationS[0][8].setScene(scenes[MapControl.SceneType.councilBluffs.ordinal()]);
        locationS[0][9].setScene(scenes[MapControl.SceneType.winterQuarters.ordinal()]);
        locationS[0][10].setScene(scenes[MapControl.SceneType.elkhornRiverCrossing.ordinal()]);
        locationS[0][11].setScene(scenes[MapControl.SceneType.ashHollow.ordinal()]);
        locationS[0][12].setScene(scenes[MapControl.SceneType.chimneyRock.ordinal()]);
        locationS[1][0].setScene(scenes[MapControl.SceneType.scottsBluff.ordinal()]);
        locationS[1][1].setScene(scenes[MapControl.SceneType.fortLaramie.ordinal()]);
        locationS[1][2].setScene(scenes[MapControl.SceneType.sweetwaterRiver.ordinal()]);
        locationS[1][3].setScene(scenes[MapControl.SceneType.independenceRock.ordinal()]);
        locationS[1][4].setScene(scenes[MapControl.SceneType.fortBridger.ordinal()]);
        locationS[1][5].setScene(scenes[MapControl.SceneType.echoCanyon.ordinal()]);
        locationS[1][6].setScene(scenes[MapControl.SceneType.goldenPassRoad.ordinal()]);
        locationS[1][7].setScene(scenes[MapControl.SceneType.emigrationCanyon.ordinal()]);
        locationS[1][8].setScene(scenes[MapControl.SceneType.zion.ordinal()]);
    }    
    //done
}
