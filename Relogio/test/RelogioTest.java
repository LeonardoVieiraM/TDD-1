package Relogio.test;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RelogioTest {
    @Test
    public void testSum() {
        Relogio relogio = new Relogio();
        int result = relogio.hora(12);
        assertEquals(12, result);
    }
}