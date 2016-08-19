


import org.junit.Test;
import static org.junit.Assert.*;

public class SequenciaTest {
    
    Sequencia procura;
    @Test
    public void testValorMin() {
        
        int esperado = -2;
        int result = procura.valorMin();
        
        assertEquals(esperado, result);
    }
    @Test
    public void testValorMax() {
        
        int esperado = 92;
        int result = procura.valorMax();
        
        assertEquals(esperado, result);
    }
    
    @Test
    public void testNumElementos() {
      
        int esperado = 6;
        int result = procura.numElementos();
        
        assertEquals(esperado, result);
    }
    @Test
    public void testValorMedio() {
      
        int esperado = (int) (long) 21.833333333333332;
        long result = (long) procura.media();
        
        assertEquals(esperado, result);
    }
    
}
