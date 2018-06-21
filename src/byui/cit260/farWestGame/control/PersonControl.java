package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Person;

/**
 *
 * @author agustin
 */
public class PersonControl {
    
    
    public static Person createPerson(String name, String typePerson){
        Person person = new Person();
        person.setName(name);
        person.setAlive(true);
        person.setIllness(null);
        person.setTypePerson(typePerson);
        return person;
    }
}
