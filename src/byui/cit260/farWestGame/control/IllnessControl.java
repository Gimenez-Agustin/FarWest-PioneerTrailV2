package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Person;
import java.util.List;

/**
 *
 * @author agustin
 */
public class IllnessControl {
    
    public boolean gameWonLost(List<Person> family){
       int count=0;
       for(Person person: family){
           if(person.isAlive()){
               count++;
           }
       }
       if(count>2){
           return true;
       }else{
           return false;
       }
   }
}
