package ar.edu.unvqui.eis;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorSubtractionCaseTest
{
    @Test
    public void shouldSubtractBothNumber()
    {
        assertEquals(4, Calculator.subtract(8,4));
    }


}
