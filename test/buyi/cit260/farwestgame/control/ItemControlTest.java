/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.farwestgame.control;

import byui.cit260.farWestGame.control.ItemControl;
import byui.cit260.farWestGame.exceptions.ItemControlException;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calNourishmentUsed method, of class ResourceControl.
     */
    @Test
    
    // Author Giovanni (team assignment)
    public void testCalNourishmentUsed() {
        System.out.println("calNourishmentUsed");
        
        // ---- calNourishmentUsed Test Case 1 ----
        System.out.println("\tTest case 1");
        
        // define the input variables
        int numberActors = 4;
        int milesTraveled = 150;
        
        // define the expected output value
        double expResult = 375;
        
        // call the method
        try{
        double result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 2 ----
        System.out.println("\tTest case 2");
        
        // define the input variables
        numberActors = 3;
        milesTraveled = 150;
        
        // define the expected output value
        expResult = 300;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 3 ----
        System.out.println("\tTest case 3");
        
        // define the input variables
        numberActors = 2;
        milesTraveled = 300;
        
        // define the expected output value
        expResult = 450;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 4 ----
        System.out.println("\tTest case 4");
        
        // define the input variables
        numberActors = 1;
        milesTraveled = 250;
        
        // define the expected output value
        expResult = 250;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 5 ----
        System.out.println("\tTest case 5");
        
        // define the input variables
        numberActors = 4;
        milesTraveled = 199;
        
        // define the expected output value
        expResult = 497.5;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 6 ----
        System.out.println("\tTest case 6");
        
        // define the input variables
        numberActors = 3;
        milesTraveled = 180;
        
        // define the expected output value
        expResult = 360;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calNourishmentUsed Test Case 7 ----
        System.out.println("\tTest case 7");
        
        // define the input variables
        numberActors = 2;
        milesTraveled = 260;
        
        // define the expected output value
        expResult = 390;
        
        // call the method
        result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
   
    // Author Giovanni (individual assignment)
    public void testCalResoure(){
        // Prints out heading for the test
        System.out.println("calResource");
        
        // ---- calResource Test Case 1 ----
        System.out.println("\tTest case 1");
        
        // define the input variables
        int beginningWheel = 3;
        int beginningBullets = 200;
        int beginningWood = 12;
        int remainingNourishment = 200;
        
        // define the expected output value
        double expResult = 490;
        
        // call the method
        double result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calResourse Test Case 2 ----
        System.out.println("\tTest case 2");
        
        // define the input variables
        beginningWheel = 2;
        beginningBullets = 50;
        beginningWood = 20;
        remainingNourishment = 140;
        
        // define the expected output value
        expResult = 445;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calResourse Test Case 3 ----
        System.out.println("\tTest case 3");
        
        // define the input variables
        beginningWheel = 1;
        beginningBullets = 300;
        beginningWood = 10;
        remainingNourishment = 250;
        
        // define the expected output value
        expResult = 430;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
                
        // ---- calResourse Test Case 4 ----
        System.out.println("\tTest case 4");
        
        // define the input variables
        beginningWheel = 4;
        beginningBullets = 150;
        beginningWood = 15;
        remainingNourishment = 100;
        
        // define the expected output value
        expResult = 465;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calResourse Test Case 5 ----
        System.out.println("\tTest case 5");
        
        // define the input variables
        beginningWheel = 0;
        beginningBullets = 0;
        beginningWood = 0;
        remainingNourishment = 500;
        
        // define the expected output value
        expResult = 500;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calResourse Test Case 6 ----
        System.out.println("\tTest case 6");
        
        // define the input variables
        beginningWheel = 4;
        beginningBullets = 0;
        beginningWood = 0;
        remainingNourishment = 300;
        
        // define the expected output value
        expResult = 500;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        
        // ---- calResourse Test Case 7 ----
        System.out.println("\tTest case 7");
        
        // define the input variables
        beginningWheel = 3;
        beginningBullets = 150;
        beginningWood = 18;
        remainingNourishment = 150;
        
        // define the expected output value
        expResult = 495;
        
        // call the method
        result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
    }
    
    //Author Araceli Camarillo (Team Assignment)
    @Test
    public void testCalSupplyUsed() {
        System.out.println("calSupplyUsed");
        
       System.out.println("\tTest case 1");
//       int beginningWheel = 2;
//       int beginningBullets = 200;
//       int beginningWood = 3;
       int wheelUsed = 2;
       int bulletsUsed = 100;
       int woodUsed = 2;
       int beginningWheel = 0;
       int beginningBullets = 100;
       int beginningWood = 1;
       double expResult = -1;
       double result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 2");
       beginningWheel = 5;
       beginningBullets = 500;
       beginningWood = 4;
       wheelUsed = 3;
       bulletsUsed = 250;
       woodUsed = 2;
       beginningWheel = 2;
       beginningBullets = 250;
       beginningWood = 2;
       expResult = -1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 3");
       beginningWheel = 1;
       beginningBullets = 800;
       beginningWood = 2;
       wheelUsed = 0;
       bulletsUsed = 0;
       woodUsed = 0;
       beginningWheel = 1;
       beginningBullets = 800;
       beginningWood = 2;
       expResult = 1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 4");
       beginningWheel = 2;
       beginningBullets = 600;
       beginningWood = 2;
       wheelUsed = 0;
       bulletsUsed = 350;
       woodUsed = 1;
       beginningWheel = 2;
       beginningBullets = 250;
       beginningWood = 1;
       expResult = -1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 5");
       beginningWheel = 3;
       beginningBullets = 100;
       beginningWood = 1;
       wheelUsed = 2;
       bulletsUsed = 89;
       woodUsed = 0;
       beginningWheel = 1;
       beginningBullets = 11;
       beginningWood = 1;
       expResult = -1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 6");
       beginningWheel = 4;
       beginningBullets = 140;
       beginningWood = 2;
       wheelUsed = 4;
       bulletsUsed = 117;
       woodUsed = 1;
       beginningWheel = 0;
       beginningBullets = 23;
       beginningWood = 1;
       expResult = -1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 7");
       beginningWheel = 1;
       beginningBullets = 230;
       beginningWood = 0;
       wheelUsed = 1;
       bulletsUsed = 20;
       woodUsed = 0;
       beginningWheel = 0;
       beginningBullets = 210;
       beginningWood = 0;
       expResult = -1;
       result = ItemControl.calSupplyUsed(beginningWheel, beginningBullets, beginningWood, wheelUsed, bulletsUsed, woodUsed);
       assertEquals(expResult, result, 0.0);
    }
       
    //Author Agustin (FGL) (Team assignment)
    @Test
   public void testCalSupplyFound() {
       System.out.println("calSupplyFound");
       
       System.out.println("\tTest case 1");
       int userWheel = 1;
       int userBullets = 2;
       int userWood = 1;
       int beginningWheel = 2;
       int beginningBullets = 3;
       int beginningWood = 3;
       int wheelAvailable = 2;
       int bulletsAvailable = 5;
       int woodAvailable = 2;
       double expResult = 60.2;
       double result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 2");
       userWheel = 1;
       userBullets = 2;
       userWood = 2;
       beginningWheel = 2;
       beginningBullets = 8;
       beginningWood = 4;
       wheelAvailable = 2;
       bulletsAvailable = 5;
       woodAvailable = 2;
       expResult = 70.2;
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 3");
       userWheel = 2;
       userBullets = 5;
       userWood = 2;
       beginningWheel = 2;
       beginningBullets = 5;
       beginningWood = 3;
       wheelAvailable = 2;
       bulletsAvailable = 5;
       woodAvailable = 2;
       expResult = 120.5;
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 4");
       userWheel = 3;
       userBullets = 2;
       userWood = 2;
       beginningWheel = 2;
       beginningBullets = 3;
       beginningWood = 3;
       wheelAvailable = 4;
       bulletsAvailable = 5;
       woodAvailable = 3;
       expResult = 170.2;        
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 5");
       userWheel = 3;
       userBullets = 5;
       userWood = 1;
       beginningWheel = 2;
       beginningBullets = 3;
       beginningWood = 3;
       wheelAvailable = 4;
       bulletsAvailable = 8;
       woodAvailable = 2;
       expResult = 160.5;
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 6");
       userWheel = 2;
       userBullets = 6;
       userWood = 5;
       beginningWheel = 3;
       beginningBullets = 4;
       beginningWood = 5;
       wheelAvailable = 10;
       bulletsAvailable = 90;
       woodAvailable = 50;
       expResult = 150.6;
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("\tTest case 7");
       userWheel = 1;
       userBullets = 2;
       userWood = 2;
       beginningWheel = 3;
       beginningBullets = 4;
       beginningWood = 5;
       wheelAvailable = 10;
       bulletsAvailable = 90;
       woodAvailable = 50;
       expResult = 70.2;
       result = ItemControl.calSupplyFound(userWheel, userBullets, userWood, beginningWheel, beginningBullets, beginningWood, wheelAvailable, bulletsAvailable, woodAvailable);
       assertEquals(expResult, result, 0.0);
       
    }
}
