package byui.cit260.farWestGame.control;
import byui.cit260.farWestGame.model.Map;
import byui.cit260.farWestGame.model.Scene;

/**
 *
 * @author agustin
 */
public class MapControl {
    
    static Map createMap() {
        
        Map map = new Map(2, 13);
        Scene[] scenes = createScenes();
        GameControl.assignScenes(map, scenes);
        
        return map;
    }
    
    
   // added by giovanni
    public enum SceneType {
        nauvoo,
        sugarCreek,
        richardsonPoint,
        charitonRiverCrossing,
        locustCreek,
        gardenGrove,
        nishnabotnaRiver,
        grandEncampment,
        councilBluffs,
        winterQuarters,
        elkhornRiverCrossing,
        platteRiver,
        fortKearney,
        confluencePoint,
        ashHollow,
        chimneyRock,
        scottsBluff,
        fortLaramie,
        sweetwaterRiver,
        independenceRock,
        fortBridger,
        echoCanyon,
        goldenPassRoad,
        emigrationCanyon,
        zion;        
    }
    //done
    
    
    //added by giovanni
    private static Scene[] createScenes() {
        
       /* Following information is from 
          https://history.lds.org/article/pioneer-story-locations?lang=eng
       */
       
        Scene[] scenes = new Scene[SceneType.values().length];
        
        // Nauvoo
        Scene nauvooScene = new Scene();
        nauvooScene.setName("Nauvoo");
        nauvooScene.setDescription(
                "You are about to start your journey to Zion."
              + "\n Make sure to get all the supplies you need for the trip ahead."
              + "\n There will be some rough areas, so be prepared."
              + "\n Good luck!!!");
        nauvooScene.setMapSymbol("NV");
        nauvooScene.setFromNauvoo(0);
        scenes[SceneType.nauvoo.ordinal()] = nauvooScene;
        
        //Sugar Creek
        Scene sugarCreekScene = new Scene();
        sugarCreekScene.setName("Sugar Creek");
        sugarCreekScene.setDescription(
                "You reached the first major campsite in Iowa."
              + "\n Supplies are limited here, so don't waste them."
              + "\n Bone-chilling cold, wind, snow, and ice"
              + "\n plague the refugees with sickness and death."
              + "\n Stay healthy.");
        sugarCreekScene.setMapSymbol("SC");
        sugarCreekScene.setFromNauvoo(7);
        scenes[SceneType.sugarCreek.ordinal()] = sugarCreekScene;
        
        //Richardson's Point
        Scene richardsonPointScene = new Scene();
        richardsonPointScene.setName("Richardson Point");
        richardsonPointScene.setDescription(
                "You reached the first major campsite in Iowa."
              + "\n Supplies are limited here, so don't waste them."
              + "\n Bone-chilling cold, wind, snow, and ice"
              + "\n plague the refugees with sickness and death."
              + "\n Stay healthy.");
        richardsonPointScene.setMapSymbol("RP");
        richardsonPointScene.setFromNauvoo(7);
        scenes[SceneType.richardsonPoint.ordinal()] = richardsonPointScene;
        
        //Chariton River Crossing
        Scene charitonRiverCrossingScene = new Scene();
        charitonRiverCrossingScene.setName("Chariton River Crossing");
        charitonRiverCrossingScene.setDescription(
                "This is a good place to wait out the bad weather."
              + "\n Get some rest, and wait for the other to"
              + "\n catch up."
              + "\n You are doing well!!");
        charitonRiverCrossingScene.setMapSymbol("CRC");
        charitonRiverCrossingScene.setFromNauvoo(80);
        scenes[SceneType.charitonRiverCrossing.ordinal()] = charitonRiverCrossingScene;
        
        //Locust Creek
        Scene locustCreekScene = new Scene();
        locustCreekScene.setName("Locust Creek");
        locustCreekScene.setDescription(
                "ALL IS WELL!! ALL IS WELL!!"
              + "\n We will be going northwest, in order to"
              + "\n get away from some unscrupulous traders."
              + "\n Have you checked your supplies??");
        locustCreekScene.setMapSymbol("LC");
        locustCreekScene.setFromNauvoo(103);
        scenes[SceneType.locustCreek.ordinal()] = locustCreekScene;
        
        //Garden Grove
        Scene gardenGroveScene = new Scene();
        gardenGroveScene.setName("Garden Grove");
        gardenGroveScene.setDescription(
                "There is a substantial camp here."
              + "\n There is plenty of supplies here."
              + "\n Have you checked your supplies??");
        gardenGroveScene.setMapSymbol("GC");
        gardenGroveScene.setFromNauvoo(128);
        scenes[SceneType.gardenGrove.ordinal()] = gardenGroveScene;
        
        
        
        
        
        
        
        return scenes;
    }
    //done
    
    private static class InventoryItem {

        public InventoryItem() {
        }
    }
}
