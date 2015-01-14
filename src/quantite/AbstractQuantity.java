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

    
    
}
