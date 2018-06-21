/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;

import byui.cit260.farWestGame.control.GameControl;
import byui.cit260.farWestGame.model.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FGL
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Author Agustin (FGL) (Individual assignment)
     * Test of gameWonLost method, of class HealthControl.
     */
   @Test
   public void testGameWonLost() {
       System.out.println("gameWonLost");
       System.out.println("Test Case 1");
       //create actors
       Person father = new Person();
       Person mother = new Person();
       Person children1 = new Person();
       Person children2 = new Person();
       Person children3 = new Person();
       //set alive property
       father.setAlive(true);
       mother.setAlive(true);
       children1.setAlive(true);
       children3.setAlive(true);
       father.setAlive(true);
       //create and add family members to list
       List<Person> family = new ArrayList<>();
       family.add(father);
       family.add(mother);
       family.add(children1);
       family.add(children2);
       family.add(children3);

       GameControl instance = new GameControl();
       boolean expResult = true;
       boolean result = instance.gameWonLost(family);
       assertEquals(expResult, result);
       
       System.out.println("Test Case 2");       
       //set alive property
       father.setAlive(false);
       mother.setAlive(false);
       children1.setAlive(false);
       children3.setAlive(false);
       father.setAlive(true);
       //create and add family members to list
       family = new ArrayList<>();
       family.add(father);
       family.add(mother);
       family.add(children1);
       family.add(children2);
       family.add(children3);
       
       expResult = false;
       result = instance.gameWonLost(family);
       assertEquals(expResult, result);       

   }
    
}
