/*----------------------------------------------------------------------------------------------------------------------
Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 tarihleri arasında rasgele bir tarihi yazan printRandomDate isimli
metodu yazınız. Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına denk gelmesi
durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. Tarih ekrana aşağıdaki formatta
yazdırılacaktır:
11th Jul 1983
-----------------------------------------------------------------------------------------------------------------------*/
package randomdate;
import java.util.Random;

public class DateUtil {
    public static String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void printRandomDate(Random r)
    {
        int year = r.nextInt(1900,2101);
        int month = r.nextInt(1,13);
        int day = r.nextInt(1,32);

        System.out.println(printDate(day,month,year));
    }

    public static String printDate(int day, int month, int year)
    {
        return (day + suffix(day)) + " " + months[month] + " " + (year + "") ;
    }
    public static String suffix(int day)
    {
        String suffix ;

        switch (day) {
            case 1,21,31 -> suffix = "st";
            case 2,22 -> suffix =  "nd";
            case 3,23 -> suffix =  "rd";
            default -> suffix = "th";
        }
        return suffix;
    }
    public static int getDayOfYear(int day, int month, int year)
    {
        if (!isValidDate(day, month, year))
            return -1;

        int total = day;

        for (int m = month - 1; m >= 1; --m)
            total += daysOfMonths[m - 1];

        return month > 2 && isLeapYear(year) ? total + 1 : total;
    }
        public static boolean isValidDate(int day, int month, int year)
        {
            return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
        }

        public static int getDays(int month, int year)
        {
            return month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month - 1];
        }

        public static boolean isLeapYear(int year)
        {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
    }

