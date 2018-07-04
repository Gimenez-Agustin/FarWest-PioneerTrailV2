/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.model.Item;
import farwestgame.FarWestGame;

/**
 *
 * @author Araceli Camarillo
 */
public class ViewInventory extends View {

    public ViewInventory() {
    }

    private String getInventoryString () {
    String inventoryItems = "";
    Item[] items = FarWestGame.getCurrentGame().getItems();
    
    return inventoryItems;
    }
    
    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
