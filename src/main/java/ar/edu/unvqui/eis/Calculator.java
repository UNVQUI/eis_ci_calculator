package ar.edu.unvqui.eis;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int pow(int base, int exponent) {
        int res = base;
        for (int i = 1; i < exponent; i++){
            res = res * base;
        }
        return res;
    }

    public static double log(double x){
        return Math.log10(x);
    }
}
