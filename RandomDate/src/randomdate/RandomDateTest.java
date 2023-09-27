package randomdate;

import java.util.Random;
import java.util.Scanner;

public class RandomDateTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count -- > 0)
            DateUtil.printRandomDate(r);

        System.out.println("Tekrar yapıyor musunuz?");

    }
}
