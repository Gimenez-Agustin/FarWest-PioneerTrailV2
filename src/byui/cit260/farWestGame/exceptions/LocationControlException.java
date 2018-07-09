/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.exceptions;

/**
 *
 * @author Giovanni
 */
public class LocationControlException extends Exception {
    
    public LocationControlException() {
    }

    public LocationControlException(String message) {
        super(message);
    }

    public LocationControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocationControlException(Throwable cause) {
        super(cause);
    }

    public LocationControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }    
    
}


