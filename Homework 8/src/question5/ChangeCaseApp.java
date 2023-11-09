/*----------------------------------------------------------------------------------------------------------------------
Parametresiyle aldığı yazının içerisindeki küçük harfleri büyük harfe, büyük harfleri ise küçük harfe çevirip yeni bir
String ile geri dönen changeCase isimli metodu yazınız.
---------------------------------------------------------------------------------------------------------------------- */
package question5;

import java.util.Scanner;

public class ChangeCaseApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bir yazı giriniz:");
        String s = kb.nextLine();

        System.out.println(StringUtil.changeCase(s));
    }
}
