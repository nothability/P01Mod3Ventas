package modelos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSubTotal {

    public TestSubTotal() {
    }

    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        ColeccionVentas instance = new ColeccionVentas();
        int result = instance.subTotal(4,4);
        int expResult = 16;
        assertEquals(expResult, result);
    }

}
