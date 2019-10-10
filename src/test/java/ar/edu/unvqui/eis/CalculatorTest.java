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
    public void shouldLogNumber()
    {
        assertEquals(1.0, Calculator.log(10.0));
    public void shouldMultipliNTimes(){

        assertEquals(4, Calculator.pow(2,2));
        assertEquals(27, Calculator.pow(3,3));
    }

    @Test
    public void shouldDivideByX(){
        assertEquals(1, Calculator.inverse( 1));
    }
}
