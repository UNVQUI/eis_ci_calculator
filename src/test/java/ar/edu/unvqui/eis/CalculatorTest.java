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

    public void shouldRootSquared()
    {

        assertEquals(2.0, Calculator.root(4));
    }


    public void shouldMultBothNumber() {
        assertEquals(8, Calculator.mult(2, 4));
    }
      
    @Test
    public void shouldMultipliNTimes() {
        assertEquals(4, Calculator.pow(2,2));
        assertEquals(27, Calculator.pow(3,3));
    }

    @Test
    public void shouldDivideByX(){
        assertEquals(1, Calculator.inverse( 1));
    }
    
    @Test
    public void shouldLogX(){
        assertEquals(1.0, Calculator.Log(10.0));
    }

    @Test
    public void shouldDivideBothNumber()
    {

        assertEquals(2, Calculator.div(4,2));
    }
}
