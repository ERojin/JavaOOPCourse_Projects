package bingo;

import java.util.Random;
import static org.csystem.util.numeric.NumberUtil.*;

public class Bingo {
    public boolean win1;
    public boolean win2;
    public boolean win3;
    public Random random;

    public int getFirst()
    {
        return random.nextInt(1,100);
    }

    public int getSecond(int first)
    {
        int second;

        while((second = random.nextInt(1,100)) == first)
            ;

        return second;
    }
    public int getThird(int first, int second)
    {
        int third;

        while ((third = random.nextInt(1,100)) == first || third == second)
            ;
        return third;
    }
    public Bingo(Random r)
    {
        random = r;
    }
    public void game1(int first, int second, int third)
    {
        win1 = first + second + third < 150;
    }

    public void game2(int first, int second, int third)
    {
        win2 = isPrime(first + second + third);
    }
    public void game3(int first, int second, int third)
    {
        win2 = mid(first, second, third) < max(first,second,third) - min(first,second,third);
    }
    public void play()
    {
        int first = getFirst();
        int second = getSecond(first);
        int third = getThird(first,second);

        game1(first,second,third);
        game2(first,second,third);
        game3(first,second,third);
    }
}
