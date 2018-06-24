/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

/**
 *
 * @author Araceli Camarillo
 */
public class IllnessView extends View {
    public String menu = "\nYou Have been attacked by an illness, What would you like to do?\n"
                + "\nW - Drink Water"
                + "\nR - Stop to Rest"
                + "\nF - Eat some Food"
                + "\nQ - Exit"
                + "\n";          
           
           
   public IllnessView(){
       
   }
     
   @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "W":
                useWater();
                break;
            case "R":
                useRest();
                break;
            case "F":
                useFood();
                break;
            case "Q":
                return true;
            default:
                System.out.println("choose a correct option or choose Q to exit menu");
        }
        return false;
    }
    
   
   public void useWater() {
       //Pull amount of Water.  If (water > 50% == actorHeals){
        System.out.println("You have enough water available.");
        System.out.println("Your water amount has reduced by 5%"); //new water amount
        System.out.println("Remaining bullet inventory is displayed");
       /* else {
       System.out.println("You don't have enough water, please select another resource to heal.")*/
    }
   
   public void useRest() {
        //Pull number of bullets.  If (rest > 50% == actorHeals){
        System.out.println("Rest has been Selected.");
        System.out.println("Your Rest amount has been used by 10%");
        System.out.println("Remaining Rest amount is displayed");
        /* else {
       System.out.println("You have used up your rest amount for the day, please select another resource to heal.")*/
        
    }
   
   public void useFood() {
        //Pull number of bullets.  If ((Food > 50% == actorHeals)){
        System.out.println("Food Selected");
        System.out.println("Your Food amount has been reduced by 25lbs");
        System.out.println("Remaining food amount is displayed");
        /* else {
       System.out.println("You don't have enough food, please select another resource to heal.")*/
    }
    
}
