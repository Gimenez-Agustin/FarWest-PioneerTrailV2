package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Family;
import byui.cit260.farWestGame.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agustin
 */
public class FamilyControl {

    public Family createFamily() {
        Family family = new Family();
        family.setCurrentWeight(0);
        family.setIsWagonBroken(false);
        family.setRest(100);
        family.setCurrentLocation(0);
        family.setFood(0);
        family.setFamilyMembers(createFamilyMembers());
        return family;
    }

    private List<Person> createFamilyMembers() {
        List<Person> family = new ArrayList<>();
        Person person = PersonControl.createPerson("Father", "Father");
        family.add(person);
        person = PersonControl.createPerson("Mother", "Mother");
        family.add(person);
        person = PersonControl.createPerson("Children1", "Children");
        family.add(person);
        person = PersonControl.createPerson("Children2", "Children");
        family.add(person);
        person = PersonControl.createPerson("Children3", "Children");
        family.add(person);
        return family;
    }
}
