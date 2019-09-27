
package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
      @Test
    public void testModificar(){
        System.out.println("Modificar");
       Venta venta = new Venta("Telefono", 86000, 15);
       ColeccionVentas instance = new ColeccionVentas();
       instance.Agregar(venta);
       boolean esperado=true;
       venta=new Venta("Telefono",100000,14);
       boolean obtenido=instance.modificar(venta);
       Assert.assertEquals(esperado, obtenido);
    }
}
