package question4;

public class StringUtil {
  public static String squeeze(String s1, String s2)
    {
        String str = "";

        if(s1.equals(s2))
            return str;

        for (int i = 0; i < s1.length(); ++i) {
            char c = s1.charAt(i);

            if (!s2.contains(c + ""))
                str += c;
        }

        return str;
    }
}
