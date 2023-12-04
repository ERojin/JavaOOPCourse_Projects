/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden bir yazı giriniz. Yazı içerisinde iç içe küme parantezleri bulunuyor olsun. En içteki parantezinin
	içerisindeki yazıyı yazdırınız.
	Aşağıdaki örnek yazıları kopyalayıp yapıştırabilirsiniz:
	- Bu örnek {aslında {hiç zor} değil}
	- Bu örnekten {daha {zor {örnekler de yapacağız} değil}} mi?
	- Yanlış bir {giriş için hata mesajı yazdırılacak
	- Bu örnekten {daha
	- Bu örnekten daha zor }örnekler
	- {test}
	- {{test}}
	- {}
	- Bu örnekten }daha zor {örnekler
-----------------------------------------------------------------------------------------------------------------------*/
package Question1;

import java.util.Scanner;

public class FindTextInCurlyApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            FindTextInCurly findTextInCurly = new FindTextInCurly(s);

            findTextInCurly.parse();

            System.out.println(findTextInCurly.isValid() ? findTextInCurly.getResult() : "yanlış bir giriş");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
