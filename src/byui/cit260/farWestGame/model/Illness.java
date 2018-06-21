package byui.cit260.farWestGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Agustin
 */
public class Illness implements Serializable{
    private String name;
    private String typeIllness;
    private int mortalityRate;
    
    public Illness(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeIllness() {
        return typeIllness;
    }

    public void setTypeIllness(String typeIllness) {
        this.typeIllness = typeIllness;
    }

    public int getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(int mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.typeIllness);
        hash = 71 * hash + this.mortalityRate;
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
        final Illness other = (Illness) obj;
        if (this.mortalityRate != other.mortalityRate) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.typeIllness, other.typeIllness)) {
            return false;
        }
        return true;
    }
    
    
    
}
