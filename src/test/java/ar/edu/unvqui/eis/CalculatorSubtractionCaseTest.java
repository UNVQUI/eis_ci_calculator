package ar.edu.unvqui.eis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubtractionCaseTest
{
    @Test
    public void shouldSubtractBothNumber()
    {
        assertEquals(4, Calculator.subtract(8,4));
    }


}
