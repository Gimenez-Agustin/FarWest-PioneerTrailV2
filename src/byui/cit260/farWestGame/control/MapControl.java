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
        fortKearny,
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
        gardenGroveScene.setMapSymbol("GG");
        gardenGroveScene.setFromNauvoo(128);
        scenes[SceneType.gardenGrove.ordinal()] = gardenGroveScene;
        
        //Nishnabotna River
        Scene nishnabotnaRiverScene = new Scene();
        nishnabotnaRiverScene.setName("Nishnabotna River");
        nishnabotnaRiverScene.setDescription(
                "There are other refugees here as well."
              + "\n The Potawatomi Indians are here."
              + "\n Have you and your family rested??");
        nishnabotnaRiverScene.setMapSymbol("NR");
        nishnabotnaRiverScene.setFromNauvoo(232);
        scenes[SceneType.nishnabotnaRiver.ordinal()] = nishnabotnaRiverScene;
        
        //Grand Encampment
        Scene grandEncampmentScene = new Scene();
        grandEncampmentScene.setName("Grand Encampment");
        grandEncampmentScene.setDescription(
                "This broad open area is a great place to stop."
              + "\n If you are interested, join the army."
              + "\n 500 volunteers of the Mormon Battalion have mustered.");
        grandEncampmentScene.setMapSymbol("GE");
        grandEncampmentScene.setFromNauvoo(255);
        scenes[SceneType.grandEncampment.ordinal()] = grandEncampmentScene;
        
        //Council Bluffs
        Scene councilBluffsScene = new Scene();
        councilBluffsScene.setName("Council Bluffs");
        councilBluffsScene.setDescription(
                "This is a major outfitting post for anyone heading west."
              + "\n This used to be called Miller's Hollow."
              + "\n Get your supplies before crossing the Missouri River.");
        councilBluffsScene.setMapSymbol("CB");
        councilBluffsScene.setFromNauvoo(265);
        scenes[SceneType.councilBluffs.ordinal()] = councilBluffsScene;
        
        //Winter Quarters
        Scene winterQuartersScene = new Scene();
        winterQuartersScene.setName("Winter Quarters");
        winterQuartersScene.setDescription(
                "Crossing the river is no joke."
              + "\n That was a huge trail getting across 1 mile of water."
              + "\n Take shelter in one of the 700 homes, and count your blessings"
              + "\n for making it across.  Good luck the rest of the way.");
        winterQuartersScene.setMapSymbol("WQ");
        winterQuartersScene.setFromNauvoo(266);
        scenes[SceneType.winterQuarters.ordinal()] = winterQuartersScene;
        
        //Elkhorn River Crossing
        Scene elkhornRiverCrossingScene = new Scene();
        elkhornRiverCrossingScene.setName("Elkhorn River Crossing");
        elkhornRiverCrossingScene.setDescription(
                "Here is another river to cross."
              + "\n This is a major one as well."
              + "\n Captain Dan Jones and Captain Silas Richards are"
              + "\n awaiting your arrival.  Do what you can to stay warm.");
        elkhornRiverCrossingScene.setMapSymbol("ERC");
        elkhornRiverCrossingScene.setFromNauvoo(293);
        scenes[SceneType.elkhornRiverCrossing.ordinal()] = elkhornRiverCrossingScene;
        
        //Platte River
        Scene platteRiverScene = new Scene();
        platteRiverScene.setName("Platte River");
        platteRiverScene.setDescription(
                "Water, water, and more water."
              + "\n You will find friendlier travelers on the north side"
              + "\n of the river.  Food for you and your stock is plentiful."
              + "\n The other side is just as bountiful.");
        platteRiverScene.setMapSymbol("PR");
        platteRiverScene.setFromNauvoo(305);
        scenes[SceneType.platteRiver.ordinal()] = platteRiverScene;
        
        //Fort Kearny
        Scene fortKearnyScene = new Scene();
        fortKearnyScene.setName("Fort Kearny");
        fortKearnyScene.setDescription(
                "This fort was named after Stephen Watts Kearny."
              + "\n It was purchased from the Pawnee Indians for"
              + "\n $2000 in goods."
              + "\n Do you have enough supplies?");
        fortKearnyScene.setMapSymbol("FK");
        fortKearnyScene.setFromNauvoo(469);
        scenes[SceneType.fortKearny.ordinal()] = fortKearnyScene;
        
        //Confluence Point
        Scene confluencePointScene = new Scene();
        confluencePointScene.setName("Confluence Point");
        confluencePointScene.setDescription(
                "Green pasture as far as you can see."
              + "\n Looks like things are good for now."
              + "\n Enjoy the blessings."
              + "\n Did you pray today?");
        confluencePointScene.setMapSymbol("CP");
        confluencePointScene.setFromNauvoo(563);
        scenes[SceneType.confluencePoint.ordinal()] = confluencePointScene;
        
        //Ash Hollow
        Scene ashHollowScene = new Scene();
        ashHollowScene.setName("Ash Hollow");
        ashHollowScene.setDescription(
                "Meet some new friends."
              + "\n The Sioux Indians are here."
              + "\n The water here seems unhealthy."
              + "\n Careful not to get sick from it.");
        ashHollowScene.setMapSymbol("AH");
        ashHollowScene.setFromNauvoo(646);
        scenes[SceneType.ashHollow.ordinal()] = ashHollowScene;
        
        //Chimney Rock
        Scene chimneyRockScene = new Scene();
        chimneyRockScene.setName("Chimney Rock");
        chimneyRockScene.setDescription(
                "Many past travelers have erected shelters"
              + "\n for others to use in their travels."
              + "\n Take time to look around at the beauty this"
              + "\n place has.  Just look at that 500 foot finger"
              + "\n of Brule clay jutting into the Nebraska sky.");
        chimneyRockScene.setMapSymbol("CR");
        chimneyRockScene.setFromNauvoo(718);
        scenes[SceneType.chimneyRock.ordinal()] = chimneyRockScene;
        
        //Scotts Bluff
        Scene scottsBluffScene = new Scene();
        scottsBluffScene.setName("Scotts Bluff");
        scottsBluffScene.setDescription(
                "This is where Priscilla Merriman"
              + "\n Evans was almost traded to the Indians"
              + "\n for a pony because of a joke her husband made."
              + "\n The captain had to be called over to settle the situation."
              + "\n Many died here from disease.");
        scottsBluffScene.setMapSymbol("SB");
        scottsBluffScene.setFromNauvoo(738);
        scenes[SceneType.scottsBluff.ordinal()] = scottsBluffScene;
        
        //Fort Laramie
        Scene fortLaramieScene = new Scene();
        fortLaramieScene.setName("Fort Laramie");
        fortLaramieScene.setDescription(
                "Enjoy some rest and stock up on supplies."
              + "\n The snow storm to the west are brutal,"
              + "\n and if you don't have enought supplies you"
              + "\n will not survive the journey.");
        fortLaramieScene.setMapSymbol("FL");
        fortLaramieScene.setFromNauvoo(788);
        scenes[SceneType.fortLaramie.ordinal()] = fortLaramieScene;
        
        //Sweetwater River
        Scene sweetwaterRiverScene = new Scene();
        sweetwaterRiverScene.setName("Sweetwater River");
        sweetwaterRiverScene.setDescription(
                "It was a high, dry, and difficult 50-mile."
              + "\n overland journey from the North Platter to"
              + "\n Sweetwater.  The journey is rought,"
              + "\n but at the end, the blessing will be great.");
        sweetwaterRiverScene.setMapSymbol("SR");
        sweetwaterRiverScene.setFromNauvoo(953);
        scenes[SceneType.sweetwaterRiver.ordinal()] = sweetwaterRiverScene;
        
        //Independence Rock
        Scene independenceRockScene = new Scene();
        independenceRockScene.setName("Independence Rock");
        independenceRockScene.setDescription(
                "Carve you name on the rock for others to know"
              + "\n you were here.  Leave words of encouragement."
              + "\n Don't give up hope.  The end is getting"
              + "\n nearer and nearer.  Keep it up!!");
        independenceRockScene.setMapSymbol("IR");
        independenceRockScene.setFromNauvoo(965);
        scenes[SceneType.independenceRock.ordinal()] = independenceRockScene;
        
        //Fort Bridger
        Scene fortBridgerScene = new Scene();
        fortBridgerScene.setName("Fort Bridger");
        fortBridgerScene.setDescription(
                "You put your shoulder to the wheel and have traveled"
              + "\n very, very far."
              + "\n Don't give up hope.  The end is getting"
              + "\n nearer and nearer.  Keep it up!!");
        fortBridgerScene.setMapSymbol("FB");
        fortBridgerScene.setFromNauvoo(1183);
        scenes[SceneType.fortBridger.ordinal()] = fortBridgerScene;        
  
        //Echo Canyon
        Scene echoCanyonScene = new Scene();
        echoCanyonScene.setName("Fort Bridger");
        echoCanyonScene.setDescription(
                "Those are not voices you hear, just you."
              + "\n The high rock walls and narrow profile"
              + "\n make it a veritable, and frequently noted, "
              + "\n echo chamber.  You're almost there!!!");
        echoCanyonScene.setMapSymbol("EC");
        echoCanyonScene.setFromNauvoo(1246);
        scenes[SceneType.echoCanyon.ordinal()] = echoCanyonScene;
        
        //Golden Pass Road
        Scene goldenPassRoadScene = new Scene();
        goldenPassRoadScene.setName("Golden Pass Road");
        goldenPassRoadScene.setDescription(
                "This was built by Parley P. Pratt in order."
              + "\n to have another entrance in to Salt Lake valley."
              + "\n It got its nickname because of all the goldminers"
              + "\n that used it to get to California.");
        goldenPassRoadScene.setMapSymbol("GPR");
        goldenPassRoadScene.setFromNauvoo(1281);
        scenes[SceneType.goldenPassRoad.ordinal()] = goldenPassRoadScene;
        
        //Emigration Canyon
        Scene emigrationCanyonScene = new Scene();
        emigrationCanyonScene.setName("Emigration Canyon");
        emigrationCanyonScene.setDescription(
                "This is the last obstacle before reaching Zion."
              + "\n It is better to push through than to climb.");
        emigrationCanyonScene.setMapSymbol("EC");
        emigrationCanyonScene.setFromNauvoo(1283);
        scenes[SceneType.emigrationCanyon.ordinal()] = emigrationCanyonScene;
        
        //Zion
        Scene zionScene = new Scene();
        zionScene.setName("Zion");
        zionScene.setDescription(
                "CONGRATULATIONS!!!!!"
              + "\n Your travels are over and you have made it.");
        zionScene.setMapSymbol("ZN");
        zionScene.setFromNauvoo(1297);
        scenes[SceneType.zion.ordinal()] = zionScene;
        
        
        return scenes;
    }
    //done
    
    private static class InventoryItem {

        public InventoryItem() {
        }
    }
}
