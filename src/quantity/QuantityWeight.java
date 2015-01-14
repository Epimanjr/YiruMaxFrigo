/*
 * By weight, for instance 200g.
 */
package quantity;

/**
 *
 * @author Maxime BLAISE
 */
public class QuantityWeight extends AbstractQuantity {

    /**
     * Unit (g, kg, ...)
     */
    private String unit;
    
    /**
     * Constructor
     * @param value value 
     */
    public QuantityWeight(int value) {
        super(value);
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    
}
