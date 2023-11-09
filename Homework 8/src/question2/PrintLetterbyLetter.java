package question2;

class PrintLetterbyLetter {
    public static void printText(String text)
    {
        int length = text.length();

        for (int i = 0; i <= length; ++i) {
            System.out.println(text.substring(0,i));
        }


    }
}
