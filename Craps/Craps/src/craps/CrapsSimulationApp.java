/*----------------------------------------------------------------------------------------------------------------------
Craps hemen hemen dünyanın her yerinde bilinen, iki zarla oynanan bir oyundur. Oyunun kuralları şöyledir :
Zarları atacak oyuncu oyunu kasaya karşı oynar. Atılan iki zarın toplam değeri

i)7 ya da 11 ise oyuncu kazanır.
ii)2, 3, 12 ise oyuncu kaybeder. (Buna craps denir!)
iii)İki zarın toplam değeri yukarıdakilerin dışında bir değer ise (yani 4, 5, 6, 8, 9, 10) oyun şu şekilde devam eder:
Oyuncu aynı sonucu buluncaya kadar zarları tekrar atar. Eğer aynı sonucu bulamadan önce oyuncu 7 atarsa (yani atılan iki
zarın toplam değeri 7 olursa) oyuncu kaybeder.
Eğer 7 gelmeden önce oyuncu aynı sonucu tekrar atmayı başarırsa, kazanır.

Birkaç örnek :
Oyuncu zarları attı, zarların toplam değeri:
11 oyuncu kazandı. Yeni oyun oynanacak. 3 oyuncu kaybetti. Yeni oyun oynanacak. 12 oyuncu kaybetti. Yeni oyun oynanacak.
7 oyuncu kazandı. Yeni oyun oynanacak.
9 sonuç belli değil, oyuncu tekrar zar atacak.
8 sonuç belli değil, oyuncu tekrar zar atacak.
11 sonuç belli değil oyuncu tekrar zar atacak.
5 sonuç belli değil oyuncu tekrar zar atacak.
9 oyuncu kazandı. (7 atmadan aynı zarı tekrar attı). Yeni oyun oynanacak.
6 sonuç belli değil, oyuncu tekrar zar atacak.
3 sonuç belli değil, oyuncu tekrar zar atacak.
10 sonuç belli değil, oyuncu tekrar zar atacak.
7 oyuncu kaybetti. (Aynı zarı tekrar atamadan 7 geldi)

Bu oyunu simüle ederek bilgisayara örneğin 100.000 kez oynatan ve oyuncunun kazanma olasılığını hesaplayan
programı yazınız.

-----------------------------------------------------------------------------------------------------------------------*/
package craps;
import java.util.Scanner;
import java.util.Random;

class App {
    public static void main(String [] args)
    {
        CrapsSimulationApp.run();
    }
}

class CrapsSimulationApp {
    public static void run()
    {
       Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Kaç kez oynatmak istersiniz?");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            CrapsSimulation simulation = new CrapsSimulation();

            simulation.run(count);
            System.out.println("------------------------------------------------------");
            System.out.printf("Kazanma Olasılığı:%f%n", simulation.p);
            System.out.println("------------------------------------------------------");
        }
    }
}

class CrapsSimulation {
  public double p ;

  public void run(int count)
  {
      int winCount = 0;
      Random r = new Random();

      for (int i = 0; i < count; ++i) {
          Craps craps = new Craps(r);

          craps.play();

          if(craps.win)
            ++winCount;
      }

      p = (double)winCount / count;

  }
}

class Craps {
    public boolean win;
    public Random random;
    public int total;

    public int roll()
    {
        return random.nextInt(1,7) +random.nextInt(1,7);
    }

    public void rollIndeterminate(int result)
    {
        while ((total = roll()) != result && total != 7)
            ;

        win = total == result;
    }
    public Craps(Random r)
    {
        random = r;
    }
    public void play()
    {
        total = roll();

        switch(total) {
            case 7,11 -> win = true;
            case 2,3,12 -> win = false;
            default -> rollIndeterminate(total);
        }
    }
}
