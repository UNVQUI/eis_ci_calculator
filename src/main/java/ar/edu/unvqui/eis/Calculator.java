package ar.edu.unvqui.eis;

import java.math.MathContext;
import java.math.*;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double root(int a) {return Math.sqrt(a);}

    public static int mult(int a, int b) {
        return a * b; 
    }
  
    public static int pow(int base, int exponent) {
        int res = base;
        for (int i = 1; i < exponent; i++){
            res = res * base;
        }
        return res;
    }
  
    public static int inverse(int x) {
        return (1/x);
    }

    public static int subtract(int a, int b){ return a - b;}

    public static Double Log(Double x) {
        return Math.log10(x);
    }

    public static int div(int a, int b) { return a / b; }
}
