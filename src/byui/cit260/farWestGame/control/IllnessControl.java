package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.exceptions.ItemControlException;
import byui.cit260.farWestGame.model.Location;
import byui.cit260.farWestGame.model.Person;
import byui.cit260.farWestGame.view.SaveGameView;
import farwestgame.FarWestGame;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    //Giovanni
    public static int malnutrtionFamily(){
        int numberOfFamilyThatDied = 0;
        try {
            //this will calculate if the family dies due to short food supply
            double nourishmentUsed = ItemControl.calNourishmentUsed(GameValues.thisGameFamilyCount, GameValues.thisGameMilesTraveled);
            GameValues.thisGameNourishment = GameValues.thisGameNourishment - nourishmentUsed;
            if (GameValues.thisGameNourishment < 0){
              numberOfFamilyThatDied = mortalityCalculation(GameValues.thisGameNourishment);  
            System.out.println("You needed " + Math.abs(GameValues.thisGameNourishment) + " pounds more of food for this trip."
                                + "\nDue to the lack of food " + numberOfFamilyThatDied + " member(s) died.");
            GameValues.thisGameNourishment = 0;
            } else {
            System.out.println("You used " + nourishmentUsed + " pounds more of food for this trip."
                                + "\nYou have " + GameValues.thisGameNourishment + " pounds of food left.");    
            }
        } catch (ItemControlException ex) {
            Logger.getLogger(FamilyControl.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
        GameValues.thisGameFamilyCount -= numberOfFamilyThatDied;
        
        gameWonLost2();
        
        return 1;
    }
    
    //Giovanni
    public static int mortalityCalculation(double nourishmentNeeded){
        int numberOfFamilyThatDied = 0;
        nourishmentNeeded = Math.abs(nourishmentNeeded);
        
        if (nourishmentNeeded > 100) {
            numberOfFamilyThatDied = 4;
        } else if (nourishmentNeeded > 70) {
            numberOfFamilyThatDied = 3;
        } else if (nourishmentNeeded > 40) {
            numberOfFamilyThatDied = 2;
        }else if (nourishmentNeeded > 10) {
            numberOfFamilyThatDied = 1;
        }
        
        return numberOfFamilyThatDied;
    }
    
    //Giovanni
    public static int gameWonLost2 () {
        if (GameValues.thisGameFamilyCount < 1){
            System.out.println("\nYou have lost the game. Press any key to end the game");
            Scanner scanner = new Scanner(System.in);               
            String value = scanner.nextLine();
            System.exit(0);
            
        } else if (GameValues.thisGameFamilyCount > 0 && GameValues.thisGameCurrentMile == 1297) {
            System.out.println("\nCONGRATULATIONS!!!\nYOU HAVE WON THE GAME!!!\nPress any key to save your game.");
            Scanner scanner = new Scanner(System.in);               
            String value = scanner.nextLine();
            SaveGameView saveGameView = new SaveGameView();
            saveGameView.display();
        }
        return 1;
    }
    
}
