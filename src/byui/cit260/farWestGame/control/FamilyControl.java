package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.enums.ActorType;
import byui.cit260.farWestGame.model.Family;
import byui.cit260.farWestGame.enums.FamilyType;
import byui.cit260.farWestGame.exceptions.ItemControlException;
import byui.cit260.farWestGame.model.Item;
import byui.cit260.farWestGame.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agustin
 */
public class FamilyControl {

    public static Family createFamily() {
        Family family = new Family();
        family.setCurrentWeight(0);        
        family.setTiredness(0);
        family.setCurrentLocation(0);
        family.setFood(0);
        family.setIsWagonBroken(false);
        family.setItems(createItems());
        family.setFamilyMembers(createFamilyMembers());
        return family;
    }

    private static List<Person> createFamilyMembers() {
        List<Person> family = new ArrayList<>();
        Person person = PersonControl.createPerson(FamilyType.Father.getDescription(), ActorType.Joe);
        family.add(person);
        person = PersonControl.createPerson(FamilyType.Mother.getDescription(), ActorType.Cora);
        family.add(person);
        person = PersonControl.createPerson(FamilyType.Children.getDescription(), ActorType.Billy);
        family.add(person);
        person = PersonControl.createPerson(FamilyType.Children.getDescription(), ActorType.Steven);
        family.add(person);
        person = PersonControl.createPerson(FamilyType.Children.getDescription(), ActorType.Jane);
        family.add(person);
        return family;
    }
    
    
    private static List<Item> createItems(){
        List<Item> items = new ArrayList<>();
        return items;
    }
    
    public static int familySurvive (){
        
        
        return 1;
    }
}
