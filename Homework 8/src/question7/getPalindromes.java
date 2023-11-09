package question7;

public class getPalindromes {
    public static String getLastLongestPalindrome(String s)
    {
        String result = s;

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin, end--);

                if (str.length() >= 26 && isPalindrome(str) && str.length() < result.length())
                    result = str;
            }

            ++begin;
        }

        return result;
    }
    public static String getFirstLongestPalindrome(String s)
    {
        String result = s;

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);

                if (str.length() >= 26 && isPalindrome(str) && str.length() < result.length())
                    result = str;
            }

            --end;
        }

        return result;
    }
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        boolean cLeftSelected = false, cRightSelected = false;
        char cLeft = '\0', cRight;

        while (left < right) {
            if (!cLeftSelected) {
                cLeft = Character.toLowerCase(s.charAt(left));

                if (!Character.isLetter(cLeft)) {
                    ++left;
                    continue;
                }
                cLeftSelected = true;
            }

            if (!cRightSelected) {
                cRight = Character.toLowerCase(s.charAt(right));

                if (!Character.isLetter(cRight)) {
                    --right;
                    continue;
                }

                if (cLeft != cRight)
                    return false;

                cRightSelected = true;
            }
            ++left;
            --right;
            cLeftSelected = cRightSelected = false;

        }
        return true;
    }
}
