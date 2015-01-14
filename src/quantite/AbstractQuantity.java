/*
 * 
 */
package quantite;

/**
 *
 * @author Maxime BLAISE
 */
public abstract class AbstractQuantity implements Quantity {
    
    /**
     * Value of quantity.
     */
    private int value;
    
    /**
     * Limit of quantity.
     */
    private int threshold;

    /**
     * Constructor.
     * @param value value
     */
    public AbstractQuantity(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    
    
    
}
