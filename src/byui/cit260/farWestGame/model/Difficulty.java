package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Difficulty implements Serializable{
    
    private String name;
    private String typeDifficulty;
    
    public Difficulty(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeDifficulty() {
        return typeDifficulty;
    }

    public void setTypeDifficulty(String typeDifficulty) {
        this.typeDifficulty = typeDifficulty;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.typeDifficulty);
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
        final Difficulty other = (Difficulty) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.typeDifficulty, other.typeDifficulty)) {
            return false;
        }
        return true;
    }
    
    
}
