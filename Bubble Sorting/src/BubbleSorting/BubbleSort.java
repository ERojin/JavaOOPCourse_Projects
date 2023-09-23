package BubbleSorting;
import static org.csystem.util.array.ArrayUtil.*;

public class BubbleSort {
    public static void bubbleSortAscending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k+1);
    }
    public static void bubbleSortDecending(int [] a)
    {
        for(int i = 0; i < a.length - 1; ++i)
            for(int k = 0; k < a.length - 1 - i; ++k)
                if(a[k] < a[k + 1])
                    swap(a, k, k+1);
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
}
