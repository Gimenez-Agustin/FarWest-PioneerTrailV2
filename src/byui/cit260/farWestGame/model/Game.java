package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Game implements Serializable{
    
    private Family family;
    private Map map;
    private Player player;
    private Person[] actors;
    private Item[] items;
    //private Animal[] animals;
       
    public Game(){}

    public Person[] getActors() {
        return actors;
    }

    public void setActors(Person[] actors) {
        this.actors = actors;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    /*public Animal[] getAnimals(){
        return animals;
    }
    
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }*/
    
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.family);
        hash = 71 * hash + Objects.hashCode(this.map);        
        hash = 71 * hash + Objects.hashCode(this.player);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;       
        if (!Objects.equals(this.family, other.family)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }
    
    
    
}
