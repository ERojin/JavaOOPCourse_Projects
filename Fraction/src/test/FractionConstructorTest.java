package test;

import math.Fraction;

import java.util.Random;
import java.util.Scanner;

public class FractionConstructorTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = kb.nextInt();
        int a, b;

        while (n-- > 0) {
            a = random.nextInt(-100, 100);

            while (true) {
                b = random.nextInt(-100, 100);

                if (b != 0)
                    break;
            }

            System.out.println("-----------------------------------------------------------------------------");

            Fraction f = new Fraction(a, b);

            System.out.printf("a = %d, b = %d%n", a, b);
            System.out.printf("%d / %d%n", f.getNumerator(), f.getDenominator());

            System.out.println("-----------------------------------------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
    public static void main(String[] args)
    {
        run();
    }
}
