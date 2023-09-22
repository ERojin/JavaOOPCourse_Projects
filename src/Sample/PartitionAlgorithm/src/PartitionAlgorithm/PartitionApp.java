package PartitionAlgorithm;
import static org.csystem.util.array.ArrayUtil.swap;
public class PartitionApp {
    public static int partition(int [] a, int thresold)
    {
        int partitionIndex = 0;

        while (partitionIndex != a.length && a[partitionIndex] < thresold)
            ++partitionIndex;

        if (partitionIndex == a.length)
            return partitionIndex;

        for (int i = partitionIndex + 1; i < a.length; ++i) {
            if (a[i] < thresold)
                swap(a,i,partitionIndex++);
        }

        return partitionIndex;
    }
}
