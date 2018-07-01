package byui.cit260.farWestGame.control;

import java.util.Random;

/**
 *
 * @author agustin
 */
public class UtilsControl {

    public static int getRandom(int totalSize) {
        Random r = new Random();
        int result = r.nextInt(totalSize);
        return result;
    }
}
