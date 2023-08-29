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
    public void testReinicio() {
        Relogio relogio = new Relogio();
        relogio.reinicio();
        assertEquals(0, relogio.hora);
        assertEquals(0, relogio.minuto);
        assertEquals(0, relogio.segundo);
    }
}