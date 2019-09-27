package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    
     @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta = new Venta("SSD 150 GB", 29990, 5);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
}
