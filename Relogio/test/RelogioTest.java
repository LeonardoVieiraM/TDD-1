package Relogio.test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import Relogio.src.Relogio;

public class RelogioTest {
    @Test
    public void testHora() {
        Relogio relogio = new Relogio();
        int result = relogio.setHora(12);
        assertEquals(12, result);
    }
    @Test
    public void testReinicio() {
        Relogio relogio = new Relogio();
        relogio.reinicio();
        assertEquals(0, relogio.hora);
        assertEquals(0, relogio.minuto);
        assertEquals(0, relogio.segundo);
    }
    @Test
    public void testCronometro(){
        Relogio relogio = new Relogio();
        long result = relogio.cronometro(1,5);
        assertEquals(4, result);
    }
    @Test
    public void testImprimir(){
        Relogio relogio = new Relogio();
        assertEquals(16, relogio.imprimir(1, 16));
        assertEquals(4, relogio.imprimir(2, 16));
    }
}