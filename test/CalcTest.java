package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import src.Calc;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    public void testSuma() {
        assertEquals(5, Calc.suma(2, 3));
        assertEquals(-1, Calc.suma(-2, 1));
        assertEquals(0, Calc.suma(0, 0));
    }

    @Test
    public void testResta() {
        assertEquals(1, Calc.resta(3, 2));
        assertEquals(-3, Calc.resta(-2, 1));
        assertEquals(0, Calc.resta(0, 0));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, Calc.multiplicacion(2, 3));
        assertEquals(-2, Calc.multiplicacion(-2, 1));
        assertEquals(0, Calc.multiplicacion(0, 3));
    }
}
