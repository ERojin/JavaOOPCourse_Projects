/*----------------------------------------------------------------------------------------------------------------------
Klavyeden girilen bir yazıyı ilk karakteri 1. satıra, ilk 2 karakteri 2. satıra ilk 3 karakteri 3. satıra... olacak
şekilde ekrana yazdıran programı yazınız.
Programın örnek çalışması:
Bir yazı giriniz:java
j
ja
jav
java
-----------------------------------------------------------------------------------------------------------------------*/
package question2;

import java.util.Scanner;

import static question2.PrintLetterbyLetter.printText;

class PrintLetterbyLetterApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Bir yazı giriniz:");
        String text = kb.nextLine();

        printText(text);


    }
}
