/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
/**
 *
 * @author Giovanni
 */
// public class HuntingView {
public class HuntingView extends View { 
   
   public String menu = "\nWhat would you like to hunt?\n"
                + "\nR - Hunt for rabbit"
                + "\nB - Hunt for birds"
                + "\nD - Hunt a deer"
                + "\nQ - Stop hunting"
                + "\n";          
           
           
   public HuntingView(){
       
   }
     
   @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "R":
                huntRabbit();
                break;
            case "B":
                huntBirds();
                break;
            case "D":
                huntDeer();
                break;
            case "Q":
                return true;
            default:
                System.out.println("choose a correct option or choose Q to exit menu");
        }
        return false;
    }
    
   
   public void huntRabbit() {
       //Pull number of bullets.  If (bullets > 10 || bullets == 10){
        System.out.println("Rabbit is hunted.");
        System.out.println("10 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
       /* else {
       System.out.println("Rabbits are fast./n You don't have enough bullets to hunt a rabbit.")*/
    }
   
   public void huntBirds() {
        //Pull number of bullets.  If (bullets > 20 || bullets == 20){
        System.out.println("Birds are hunted.");
        System.out.println("20 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
        /* else {
       System.out.println("Birds are quick in the air./n You don't have enough bullets to hunt a bird.")*/
        
    }
   
   public void huntDeer() {
        //Pull number of bullets.  If (bullets > 60 || bullets == 60){
        System.out.println("Deer is hunted.");
        System.out.println("60 bullets removed from inventory");
        System.out.println("Remaining bullet inventory is displayed");
        /* else {
       System.out.println("Deer are difficult to hunt./n You don't have enough bullets to hunt a deer.")*/
    }
   
   /*public void huntingView(int value) {
        GameControl.hunting(value);
   }*/
}
