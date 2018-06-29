package byui.cit260.farWestGame.enums;

import byui.cit260.farWestGame.cons.LocationDescriptionCons;
import byui.cit260.farWestGame.cons.LocationSymbolCons;

/**
 *
 * @author agustin
 */
public enum Locations {

    nauvoo("Nauvoo", LocationDescriptionCons.NAUVOO, LocationSymbolCons.NAUVOO, 0),
    sugarCreek("Sugar Creek", LocationDescriptionCons.SUGARCREEK, LocationSymbolCons.SUGARCREEK, 7),
    richardsonPoint("Richardson Point", LocationDescriptionCons.RICHARDSONPOINT, LocationSymbolCons.RICHARDSONPOINT, 7),
    charitonRiverCrossing("Chariton River Crossing", LocationDescriptionCons.CHARITONRIVERCROSSING, LocationSymbolCons.CHARITONRIVERCROSSING, 7),
    locustCreek("Locust Creek", LocationDescriptionCons.LOCUSTCREEK, LocationSymbolCons.LOCUSTCREEK, 80),
    gardenGrove("Garden Grove", LocationDescriptionCons.GARDENGROVE, LocationSymbolCons.GARDENGROVE, 103),
    nishnabotnaRiver("Nishnabotna River", LocationDescriptionCons.NISHNABOTNARIVER, LocationSymbolCons.NISHNABOTNARIVER, 128),
    grandEncampment("Grand Encampment", LocationDescriptionCons.GRANDENCAMPMENT, LocationSymbolCons.GRANDENCAMPMENT, 232),
    councilBluffs("Council Bluffs", LocationDescriptionCons.COUNCILBLUFFS, LocationSymbolCons.COUNCILBLUFFS, 255),
    winterQuarters("Winter Quarters", LocationDescriptionCons.WINTERQUARTERS, LocationSymbolCons.WINTERQUARTERS, 265),
    elkhornRiverCrossing("Elkhorn River Crossing", LocationDescriptionCons.ELKHORNRIVERCROSSING, LocationSymbolCons.ELKHORNRIVERCROSSING, 266),
    platteRiver("Platte River", LocationDescriptionCons.PLATTERIVER, LocationSymbolCons.PLATTERIVER, 293),
    fortKearny("Fort Kearny", LocationDescriptionCons.FORTKEARNY, LocationSymbolCons.FORTKEARNY, 305),
    confluencePoint("Confluence Point", LocationDescriptionCons.CONFLUENCEPOINT, LocationSymbolCons.CONFLUENCEPOINT, 469),
    ashHollow("Ash Hollow", LocationDescriptionCons.ASHHOLLOW, LocationSymbolCons.ASHHOLLOW, 563),
    chimneyRock("Chimney Rock", LocationDescriptionCons.CHIMNEYROCK, LocationSymbolCons.CHIMNEYROCK, 646),
    scottsBluff("Scotts Bluff", LocationDescriptionCons.SCOTTSBLUFF, LocationSymbolCons.SCOTTSBLUFF, 718),
    fortLaramie("Fort Laramie", LocationDescriptionCons.FORTLARAMIE, LocationSymbolCons.FORTLARAMIE, 738),
    sweetwaterRiver("Sweetwater River", LocationDescriptionCons.SWEETWATERRIVER, LocationSymbolCons.SWEETWATERRIVER, 788),
    independenceRock("Independence Rock", LocationDescriptionCons.INDEPENDENCEROCK, LocationSymbolCons.INDEPENDENCEROCK, 953),
    fortBridger("Fort Bridger", LocationDescriptionCons.FORTBRIDGER, LocationSymbolCons.FORTBRIDGER, 965),
    echoCanyon("Echo Canyon", LocationDescriptionCons.ECHOCANYON, LocationSymbolCons.ECHOCANYON, 1183),
    goldenPassRoad("Golden Pass Road", LocationDescriptionCons.GOLDENPASSROAD, LocationSymbolCons.GOLDENPASSROAD, 1246),
    emigrationCanyon("Emigration Canyon", LocationDescriptionCons.EMIGRATIONCANYON, LocationSymbolCons.EMIGRATIONCANYON, 1281),
    zion("Zion", LocationDescriptionCons.ZION, LocationSymbolCons.ZION, 1297);

    //attribute
    private final String name;
    private final String description;
    private final String symbol;
    private final int fromNauvoo;

    //Constructor
    Locations(String name, String description, String symbol, int fromNauvoo) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.fromNauvoo = fromNauvoo;
    }

    //GetterFunction
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getFromNauvoo() {
        return fromNauvoo;
    }

}
