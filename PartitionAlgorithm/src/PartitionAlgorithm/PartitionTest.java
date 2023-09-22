package PartitionAlgorithm;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.getRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

public class PartitionTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            System.out.print("Eşik değerini giriniz:");
            int thresold = Integer.parseInt(kb.nextLine());

            int [] a = getRandomArray(r, count, 1, 100);
            System.out.println("--------------------------");
            print(2,a);
            int partitionPoint = PartitionApp.partition(a,thresold);
            System.out.printf("Bölünme noktası %d%n",partitionPoint);
            print(2,a);
            System.out.println("--------------------------");

        }

        System.out.println("Tekrar yapıyor musunuz?");

    }
    public static void main(String [] args)
    {
        run();
    }
}

