/*----------------------------------------------------------------------------------------------------------------------
1.	Bir tombala torbasında 1'den 99'a kadar numaralanmış (99 dahil) pullar bulunmaktadır. Bu tombala torbasıyla
aşağıdaki oyunlar oynanmaktadır:

Çekilen bir pul torbaya geri atılmamak üzere;
i)	Torbadan 3 pul çekiliyor. Çekilen pulların toplamı 150' den küçük ise oyuncu kazanıyor.
ii)	Torbadan 3 pul çekiliyor. Çekilen pulların toplamı asal sayı ise oyuncu kazanıyor.
iii)	Torbadan 3 pul çekiliyor. En büyük değerli pul ile en küçük değerli pul arasındaki fark ortanca değerli puldan
büyükse oyuncu kazanıyor.

Oynanacak her bir oyun için oyuncunun kazanma olasılığını en az 30000 oyunu simule ederek hesaplayınız.

-----------------------------------------------------------------------------------------------------------------------*/

package bingo;
public class App {
    public static void main(String[] args)
    {
        BingoSimulationApp.run();
    }
}
