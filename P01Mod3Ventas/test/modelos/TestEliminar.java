
package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="Telefono";
        Venta venta=new Venta("Telefono", 89990, 12);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
   
}
