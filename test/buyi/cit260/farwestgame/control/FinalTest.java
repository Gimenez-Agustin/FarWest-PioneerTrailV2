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
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Giovanni
 */
public class FinalTest {
    
    @Test
    
    // Author Giovanni (team assignment)
    public void testCalNourishmentUsed() {
        System.out.println("calNourishmentUsed");
        try{
        // ---- calNourishmentUsed Test Case 1 ----
        System.out.println("\tTest case 1");
        
        // define the input variables
        int numberActors = 4;
        int milesTraveled = 150;
        
        // define the expected output value
        double expResult = 375;
        
        // call the method
        
        double result = ItemControl.calNourishmentUsed(numberActors, milesTraveled);
       
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
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
   
    // Author Giovanni (individual assignment)
    public void testCalResoure(){
        try{
        // Prints out heading for the test
        System.out.println("calResource");
        
        // ---- calResource Test Case 1 ----
        System.out.println("\tTest case 1");
        
        // define the input variables
        int beginningWheel = ItemControl.beginningBullets;
        int beginningBullets = 200;
        int beginningWood = 12;
        int remainingNourishment = 200;
        
        
        
        // define the expected output value
        double expResult = 340;
        
        // call the method
        double result = ItemControl.calResource(beginningWheel, beginningBullets, beginningWood, remainingNourishment);
        
        //test to see if the result expected equals the expected result
        assertEquals(expResult, result, 0.0);
        
        System.out.println("begining Wheel = " + beginningWheel);
        
        
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
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
