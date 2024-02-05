package test;

import math.Fraction;

import java.util.Random;
import java.util.Scanner;

public class FractionSubtractTest {
    private static Fraction createRandomFraction(Random r)
    {
        int a, b;

        a = r.nextInt(-10, 10);

        while (true) {
            b = r.nextInt(-10, 10);

            if (b != 0)
                break;
        }

        return new Fraction(a,b);
    }
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = kb.nextInt();

        while (n-- > 0) {
            System.out.println("-----------------------------------------------------------------------------");

            Fraction f1 = createRandomFraction(random);
            Fraction f2 = createRandomFraction(random);
            Fraction result = f1.subtract(f2);
            System.out.printf("%d/%d - %d/%d = %d/%d%n",
                    f1.getNumerator(), f1.getDenominator(),
                    f2.getNumerator(), f2.getDenominator(),
                    result.getNumerator(),result.getDenominator());

            System.out.println("-----------------------------------------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
    public static void main(String[] args)
    {
        run();
    }
}
