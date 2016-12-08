import org.junit.Test;
import static org.junit.Assert.*;
import prova3.TarefaFatorial;

public class TestFatorial {
    
    @Test
    public void testFatorial() {
        //Esperado
        TarefaFatorial t = new TarefaFatorial(8);
        double resultadoEsperado8 = 40320;
        double resultado1Obtido8   = t.fatorial(8);
        assertEquals(resultadoEsperado8, resultado1Obtido8, 0.001);
        
        //Não esperado
        double resultadoNEsperado8 = 1000;
        double resultado2Obtido8   = t.fatorial(8);
        assertNotEquals(resultadoNEsperado8, resultado2Obtido8, 0.001);                
    }
}
