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
}
