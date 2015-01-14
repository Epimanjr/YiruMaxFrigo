/*
 * 
 */
package fridge;

import quantite.Quantity;

/**
 *
 * @author Maxime BLAISE
 */
public class Nutrient {
    
    /**
     * Name of this nutrient.
     */
    private String name;
    
    /**
     * Limit of quantity.
     */
    private Quantity threshold;

    /**
     * Constructor.
     * @param name name.
     * @param threshold threshold
     */
    public Nutrient(String name, Quantity threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quantity getThreshold() {
        return threshold;
    }

    public void setThreshold(Quantity threshold) {
        this.threshold = threshold;
    }
    
    
}
