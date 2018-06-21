package byui.cit260.farWestGame.control;

/**
 *
 * @author Agustin
 */
public class DiceControl {        

    public static int roll() { //roll a dice function
        double random = Math.random() * 6;
        return (int) random + 1;
    }

    public static int rollDices(int numberOfDices) { // roll many dices
        int total = 0;
        System.out.println(    "-----Dice-----");
        for (int i = 0; i < numberOfDices; i++) {
            int subTotal = roll();
            System.out.println("dice N " + (i + 1) + "  : 0" + subTotal);
            total += subTotal;
        }
        System.out.println(    "Total dice: " + total);
        System.out.println(    "--------------");
        
        return total;
    }
}
