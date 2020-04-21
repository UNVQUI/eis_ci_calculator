package ar.edu.unvqui.eis;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAddBothNumber() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void shouldRootSquared() {

        assertEquals(2.0, Calculator.root(4));
    }

    @Test
    public void shouldMultBothNumber() {
        assertEquals(8, Calculator.mult(2, 4));
    }

    @Test
    public void shouldMultipliNTimes() {
        assertEquals(4, Calculator.pow(2, 2));
        assertEquals(27, Calculator.pow(3, 3));

    }

    @Test
    public void shouldDivideByX() {
        assertEquals(1, Calculator.inverse(1));
    }

    @Test
    public void shouldLogNumber()
    {
        assertEquals(1.0, Calculator.log(10.0));
    }

    @Test
    public void shouldLogX() {
        assertEquals(1.0, Calculator.Log(10.0));
    }

    @Test
    public void shouldDivideBothNumber() {

        assertEquals(2, Calculator.div(4, 2));
    }

    @Test
    public void elModuloDe10Dividido3Es1() {

        assertEquals(1, Calculator.module(10, 3));
    }

    @Test
    public void ElFactorialDe5Es120() {

        assertEquals(120.0, 0, Calculator.factorial(5));
    }

    @Test
    public void shouldMultiplyXBySinX() {
        //sin = 1.
        assertEquals(89.9999999999427, Calculator.xSinX(89.9999999999427));
        //sin = 0
        assertEquals(0.0, Calculator.xSinX(0.0));
    }


    @Test
    public void shouldDouble() {
        assertEquals(400, Calculator.twice(20));
    }

    @Test
    public void shouldPorTres() {
        assertEquals(60, Calculator.tres(20));
    }

}


