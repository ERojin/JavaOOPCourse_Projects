package test;

import math.Fraction;

public class FractionToStringTest {
    public static void run()
    {
        Fraction f1 = new Fraction(9,12);
        Fraction f2 = new Fraction(-9,12);
        Fraction f3 = new Fraction(10);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
    public static void main(String[] args)
    {
        run();
    }
}
