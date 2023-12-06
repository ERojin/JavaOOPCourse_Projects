package Lottery;
import java.util.Random;
 
public class NumericLottery {
    private Random m_random;

    private static int [] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];
        int idx = 0;

        for (int i = 0; i < 50; ++i)
            if (flags[i])
                numbers[idx++] = i;

        return numbers;

    }

    private boolean [] getflags()
    {
        boolean flags [] = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            for (;;) {
                val = random.nextInt(1, 50);

                if(!flags[val])
                    break;
            }

            flags[val] = true;
        }

        return flags;
    }

    public NumericLottery()
    {
        m_random = new Random();
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getflags());
    }
}
