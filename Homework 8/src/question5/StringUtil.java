package question5;

public class StringUtil {
    public static String changeCase(String s)
    {
        String str = "";

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            str += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        return str;
    }
}
