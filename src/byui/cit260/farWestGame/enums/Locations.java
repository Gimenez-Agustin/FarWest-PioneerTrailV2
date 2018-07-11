package byui.cit260.farWestGame.enums;

import byui.cit260.farWestGame.cons.LocationDescriptionCons;
import byui.cit260.farWestGame.cons.LocationSymbolCons;

/**
 *
 * @author agustin
 */
public enum Locations {

    nauvoo(0,"Nauvoo", LocationDescriptionCons.NAUVOO, LocationSymbolCons.NAUVOO, 0),
    sugarCreek(1,"Sugar Creek", LocationDescriptionCons.SUGARCREEK, LocationSymbolCons.SUGARCREEK, 7),
    richardsonPoint(2,"Richardson Point", LocationDescriptionCons.RICHARDSONPOINT, LocationSymbolCons.RICHARDSONPOINT, 7),
    charitonRiverCrossing(3,"Chariton River Crossing", LocationDescriptionCons.CHARITONRIVERCROSSING, LocationSymbolCons.CHARITONRIVERCROSSING, 7),
    locustCreek(4,"Locust Creek", LocationDescriptionCons.LOCUSTCREEK, LocationSymbolCons.LOCUSTCREEK, 80),
    gardenGrove(5,"Garden Grove", LocationDescriptionCons.GARDENGROVE, LocationSymbolCons.GARDENGROVE, 103),
    nishnabotnaRiver(6,"Nishnabotna River", LocationDescriptionCons.NISHNABOTNARIVER, LocationSymbolCons.NISHNABOTNARIVER, 128),
    grandEncampment(7,"Grand Encampment", LocationDescriptionCons.GRANDENCAMPMENT, LocationSymbolCons.GRANDENCAMPMENT, 232),
    councilBluffs(8,"Council Bluffs", LocationDescriptionCons.COUNCILBLUFFS, LocationSymbolCons.COUNCILBLUFFS, 255),
    winterQuarters(9,"Winter Quarters", LocationDescriptionCons.WINTERQUARTERS, LocationSymbolCons.WINTERQUARTERS, 265),
    elkhornRiverCrossing(10,"Elkhorn River Crossing", LocationDescriptionCons.ELKHORNRIVERCROSSING, LocationSymbolCons.ELKHORNRIVERCROSSING, 266),
    platteRiver(11,"Platte River", LocationDescriptionCons.PLATTERIVER, LocationSymbolCons.PLATTERIVER, 293),
    fortKearny(12,"Fort Kearny", LocationDescriptionCons.FORTKEARNY, LocationSymbolCons.FORTKEARNY, 305),
    confluencePoint(13,"Confluence Point", LocationDescriptionCons.CONFLUENCEPOINT, LocationSymbolCons.CONFLUENCEPOINT, 469),
    ashHollow(14,"Ash Hollow", LocationDescriptionCons.ASHHOLLOW, LocationSymbolCons.ASHHOLLOW, 563),
    chimneyRock(15,"Chimney Rock", LocationDescriptionCons.CHIMNEYROCK, LocationSymbolCons.CHIMNEYROCK, 646),
    scottsBluff(16,"Scotts Bluff", LocationDescriptionCons.SCOTTSBLUFF, LocationSymbolCons.SCOTTSBLUFF, 718),
    fortLaramie(17,"Fort Laramie", LocationDescriptionCons.FORTLARAMIE, LocationSymbolCons.FORTLARAMIE, 738),
    sweetwaterRiver(18,"Sweetwater River", LocationDescriptionCons.SWEETWATERRIVER, LocationSymbolCons.SWEETWATERRIVER, 788),
    independenceRock(19,"Independence Rock", LocationDescriptionCons.INDEPENDENCEROCK, LocationSymbolCons.INDEPENDENCEROCK, 953),
    fortBridger(20,"Fort Bridger", LocationDescriptionCons.FORTBRIDGER, LocationSymbolCons.FORTBRIDGER, 965),
    echoCanyon(21,"Echo Canyon", LocationDescriptionCons.ECHOCANYON, LocationSymbolCons.ECHOCANYON, 1183),
    goldenPassRoad(22,"Golden Pass Road", LocationDescriptionCons.GOLDENPASSROAD, LocationSymbolCons.GOLDENPASSROAD, 1246),
    emigrationCanyon(23,"Emigration Canyon", LocationDescriptionCons.EMIGRATIONCANYON, LocationSymbolCons.EMIGRATIONCANYON, 1281),
    zion(24,"Zion", LocationDescriptionCons.ZION, LocationSymbolCons.ZION, 1297);

    //attribute
    private final int id;
    private final String name;
    private final String description;
    private final String symbol;
    private final int fromNauvoo;

    //Constructor
    Locations(int id, String name, String description, String symbol, int fromNauvoo) {
        this.id= id;
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.fromNauvoo = fromNauvoo;
    }

    //GetterFunction
    
    public int getId(){
        return id;
    }
    
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
