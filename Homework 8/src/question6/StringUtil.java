package question6;

public class StringUtil {
    public static boolean isIdentifier(String variable)
    {
        if (variable.isBlank() || variable.equals("_") || variable.contains(" "))
            return false;

        char c = variable.charAt(0);

        if (Character.isDigit(c))
            return false;

        for (int i = 1; i < variable.length(); ++i) {
            c = variable.charAt(i);

            if ( !Character.isLetter(c) && !Character.isDigit(c) && c != '$' && c != '_')
                return false;
        }


        return true;
    }
}
