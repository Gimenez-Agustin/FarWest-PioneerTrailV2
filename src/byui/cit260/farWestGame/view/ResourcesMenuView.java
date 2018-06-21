package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Araceli Camarillo
 */
public class ResourcesMenuView extends View{
    
    public String menu = "F - Insert Amount of Food\n"
                + "A - Insert Amount of Axe\n"
                + "H - Insert Amount of Hammer\n"
                + "W - Insert Amount of Spare Wheels\n"
                + "B - Insert Amount of Bullets\n"
                + "W - Insert Amount of Wood\n"
                + "R - Insert Amount of Rest\n"
                + "D - Insert Amount of Drinking Water\n"
                + "Q - Quit\n"
                + "Select an Option: ";
    
    public ResourcesMenuView() {
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "F":
                amountOfFood();
                break;
            case "A":
                toolAmountAxe();
                break;
            case "H":
                toolAmountHammer();
                break;
            case "W":
                resourceAmountWheels();
                break;
            case "B":
                resourceAmountBullets();
                break;
            case "R":
                restAmount();
                break;
            case "D":
                resourceAmountWater();
                break;    
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    public void amountOfFood() {
        System.out.println("Insert Amount of Food"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountAxe() {
        System.out.println("Insert Amount of Axe"); //To change body of generated methods, choose Tools | Templates.
    }

    public void toolAmountHammer() {
        System.out.println("Insert Amount of Hammer"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWheels() {
        System.out.println("Insert Amount of Spare Wheels"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountBullets() {
        System.out.println("Insert Amount of Bullets"); //To change body of generated methods, choose Tools | Templates.
    }

    public void restAmount() {
        System.out.println("Insert Amount of Rest"); //To change body of generated methods, choose Tools | Templates.
    }

    public void resourceAmountWater() {
        System.out.println("Insert Amount of Drinking Water"); //To change body of generated methods, choose Tools | Templates.
    }

  
}
