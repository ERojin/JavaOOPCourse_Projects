package test;

import math.Fraction;

public class FractionConstructorUndefinedTest {
    public static void run()
    {
        try {
            Fraction fraction = new Fraction(10, 0);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
