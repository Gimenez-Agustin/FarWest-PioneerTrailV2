package byui.cit260.farWestGame.view;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Giovanni
 */
public abstract class View implements ViewInterface{
  protected String menuPrompt;   
  protected final BufferedReader keyboard = farwestgame.FarWestGame.getInFile();
  protected final PrintWriter console = farwestgame.FarWestGame.getOutFile();
  
    public View(){
    menuPrompt = "";
    }
    public View(String menu){
    menuPrompt = menu;
    }
    @Override
    public String getInput(){
    return getInputs(menuPrompt);
    }
    
    
    @Override
    public String getInputs(String menu){
        String inputs = "";
        this.console.println(menu);
        boolean valid = false;
        try {
        while (valid == false) {
            /*Scanner scanner = new Scanner(System.in);
            inputs = scanner.nextLine().trim();*/ //removed per lesson 12 team assignment page 7
            
            inputs = this.keyboard.readLine();
            inputs = inputs.trim();  //lines 38-39 per lesson 12 team assignment page 7
            
            if (inputs.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "Name cannot be blank!! \n Please enter your name: ");
             continue;   
            }
            // valid = true;
            break;
        }
        } catch(Exception e) {
            ErrorView.display(this.getClass().getName(), 
                    "Error Reading Input: " + e.getMessage());
        }
        return inputs;
    }
    @Override
     public void display() {
     display(menuPrompt);
     }
     
    @Override
     public void display(String menu){
        boolean endOfView = false;
        do {
            String inputs = getInputs(menu);
            if (inputs.length() < 1 || inputs.toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);            
            
        } while (endOfView != true);
    }
     
}
