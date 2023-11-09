/*----------------------------------------------------------------------------------------------------------------------
Parametresiyle aldığı iki yazınının birincisi içerisinden, ikinci yazının içerisinde bulunan karakterlerin silinmiş olduğu
yeni bir String döndüren squeeze methodunu yazınız ve test ediniz.
---------------------------------------------------------------------------------------------------------------------- */
package question4;

import java.util.Scanner;

public class SquezeeApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Birinci yazıyı giriniz:");
        String s1 = kb.nextLine();
        System.out.print("İkinci yazıyı giriniz:");
        String s2 = kb.nextLine();

        System.out.println(StringUtil.squeeze(s1,s2));
    }

}
