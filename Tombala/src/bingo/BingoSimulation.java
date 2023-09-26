package bingo;

import java.util.Random;

public class BingoSimulation {
    public double p1;
    public double p2;
    public double p3;

    public void run()
    {
        Random r = new Random();

        int winCount1 , winCount2, winCount3;
        winCount1 = winCount2 = winCount3 = 0;

        for(int i = 0; i < 30000; ++i) {
            Bingo bingo = new Bingo(r);

            bingo.play();

            if (bingo.win1)
                ++winCount1;
            if (bingo.win2)
                ++winCount2;
            if (bingo.win3)
                ++winCount3;
        }

        p1 = (double) winCount1 / 30000;
        p2 = (double) winCount2 / 30000;
        p3 = (double) winCount3 / 30000;
    }
}
