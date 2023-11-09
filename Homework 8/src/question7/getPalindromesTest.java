package question7;

import java.util.Scanner;

public class getPalindromesTest {
    public static void run()
    {
        String s = "Ey Edip Adana'da pide ye yedipadanadapideye Anastassatsana anastasmumsatsana Ali Papila alipapila";

       //System.out.printf("İlk en uzun palindrom :%s%n", getPalindromes.getFirstLongestPalindrome(s));
       System.out.printf("Son en uzun palindrom :%s%n", getPalindromes.getLastLongestPalindrome(s));
    }
}