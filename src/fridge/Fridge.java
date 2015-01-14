
package fridge;

import java.util.HashMap;
import quantity.Quantity;

/**
 *
 * @author Maxime BLAISE
 */
public class Fridge {
    
    /**
     * Id of Fridge
     */
    private int id;
    
    /**
     * Content of the fridge.
     */
    private HashMap<Nutrient, Quantity> content;
}
