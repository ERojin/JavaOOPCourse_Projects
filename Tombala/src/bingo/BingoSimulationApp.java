package bingo;

public class BingoSimulationApp {
    public static void run()
    {
        BingoSimulation simulation = new BingoSimulation();

        simulation.run();
        System.out.printf("1. oyunun kazanma olasılığı %f%n", simulation.p1);
        System.out.printf("2. oyunun kazanma olasılığı %f%n", simulation.p2);
        System.out.printf("3. oyunun kazanma olasılığı %f%n", simulation.p3);
    }
}
