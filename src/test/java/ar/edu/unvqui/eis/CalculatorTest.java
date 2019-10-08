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
    public void elModuloDe10Dividido3Es1 () {

        assertEquals(1, Calculator.module(10, 3));
    }

    @Test
    public void shouldMultipliNTimes(){

        assertEquals(4, Calculator.pow(2,2));
        assertEquals(27, Calculator.pow(3,3));

    }
}


