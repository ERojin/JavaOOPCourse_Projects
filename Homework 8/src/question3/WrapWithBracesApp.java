/*----------------------------------------------------------------------------------------------------------------------
Klavyeden girilen bir yazının başındaki ve sonundaki boşlukları (whitespace) atarak yazıyı parantez içine alan programı
yazınız.Programı bir tane String referans değişkeni kullanarak yazınız.
---------------------------------------------------------------------------------------------------------------------- */
package question3;

import java.util.Scanner;

public class WrapWithBracesApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Bir yazı giriniz:");
        String s = kb.nextLine();

        System.out.println(StringUtil.wrapWithBraces(s));
    }
}
