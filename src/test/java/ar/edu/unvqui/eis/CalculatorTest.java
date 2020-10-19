package ar.edu.unvqui.eis;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAddBothNumber()
    {

        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    public void shouldSubtractBothNumber()
    {

        assertEquals(0, Calculator.substract(2,2));
    }

    @Test
    public void shouldTimeBothNumber()
    {

        assertEquals(6, Calculator.time(3,2));
    }

    @Test
    public void shouldDivideBothNumber()
    {

        assertEquals(2, Calculator.div(4,2));
    }
}
