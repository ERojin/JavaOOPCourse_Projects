/*----------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 19.02.2023

	Utility class for string operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;
import java.util.Scanner;
public class ArrayUtil {
    public static void bubbleSortAscending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if(a[k + 1] < a[k])
                    swap(a, k, k+1);
    }
    public static void bubbleSortDecending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if(a[k] < a[k + 1])
                    swap(a, k, k+1);
    }
    public static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for(int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }
    public static void selectionSortDecending(int [] a)
    {
        int max, maxIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for(int k = i + 1; k < a.length; ++k)
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }
    public static void bubbleSort(int [] a , boolean decending)
    {
        if (decending)
            bubbleSortDecending(a);
        else
            bubbleSortAscending(a);
    }
    public static void fillRandomArray(Random random, int [] a, int min, int bound)
    {
        for(int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(min, bound);
    }

    public static void fillRandomArray(Random random, double [] a, double min, double bound)
    {
        for(int i = 0; i < a.length; ++i)
            a[i] = random.nextDouble(min, bound);
    }

    public static int [] getRandomArray(Random random, int count, int min, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static double [] getRandomArray(Random random, int count, double min, double bound)
    {
        double [] a = new double[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static int [] join(int [] a, int [] b)
    {
       int [] result = new int[a.length + b.length];
       int idx = 0;

       for (int i = 0; i < a.length; ++i)
           result[idx++] = a[i];

       for (int i = 0 ; i < b.length; ++i)
           result[idx++] = b[i];

       return result;

    }
    public static int min(int [] a)
    {
        int result = a[0];

        for(int i = 1; i <a.length; ++i)
            if(a[i] < result)
                result = a[i];

        return result;
    }
    public static int max(int [] a)
    {
        int result = a[0];

        for(int i = 1; i <a.length; ++i)
            if(result < a[i])
                result = a[i];

        return result;
    }
    public static void print (int [] a)
    {
       print (1, a);
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }
    public static void reverse(int [] a)
    {
        for(int i = 0; i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }
    public static void selectionSort(int [] a)
    {
        selectionSort(a,false);
    }
    public static void selectionSort(int [] a, boolean descending)
    {
        if(descending)
            selectionSortDecending(a);
        else
            selectionSortAscending(a);
    }
    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(double [] a, int i, int k)
    {
        double temp = a[i];

        a[i] = a[k];
        a[k] = temp;
     }

    public static int sum(int [] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; ++i)
            sum += a[i];

        return sum;
    }
}
