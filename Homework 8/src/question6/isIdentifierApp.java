/*----------------------------------------------------------------------------------------------------------------------
Parametresiyle aldığı değişken isminin Java'da geçerli bir değişken ismi olup olmadığını test eden isIdentifier isimli
metodu yazınız ve test ediniz.

Açıklamalar:
- Anahtar sözcük kontrolü yapılmayacaktır.
- Java'da bir karakterin değişken ismi içerisinde kullanılıp kullanılmayacağını test eden standart metodlar vardır.
Bu metotlar kullanılmayacaktır.

---------------------------------------------------------------------------------------------------------------------- */
package question6;

import java.util.Scanner;

import static question6.StringUtil.isIdentifier;

public class isIdentifierApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Değişken ismi giriniz:");
        String variable = kb.nextLine();

        if (isIdentifier(variable))
            System.out.printf("%s değişken ismi olarak kullanılabilir.%n", variable);
        else
            System.out.printf("%s değişken ismi olarak kullanılamaz.%n", variable);

    }
}
