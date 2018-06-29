package byui.cit260.farWestGame.model;

import byui.cit260.farWestGame.enums.ActorType;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andres
 */
public class Person implements Serializable{
    private String name;
    private ActorType typePerson;
    private Illness illness;
    private boolean alive;
    private String description; //added, plus getters and setters-Araceli
    
    public Person(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActorType getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(ActorType typePerson) {
        this.typePerson = typePerson;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.typePerson);
        hash = 89 * hash + Objects.hashCode(this.illness);
        hash = 89 * hash + (this.alive ? 1 : 0);
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
        final Person other = (Person) obj;
        if (this.alive != other.alive) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.typePerson, other.typePerson)) {
            return false;
        }
        if (!Objects.equals(this.illness, other.illness)) {
            return false;
        }
        return true;
    }
    
       
    
    
}
