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
    public Random r;

    public static void printRandomDate(Random r)
    {
        int year = r.nextInt(1900,2101);
        int month = r.nextInt(1,13);
        int day = r.nextInt(1,32);

        System.out.println(printDate(day,month,year));
    }

    public static String printDate(int day, int month, int year)
    {
        return (suffix(day)) + " " + getMonth(month) + " " + (year + "") ;
    }
    public static String suffix(int day)
    {
        String ordinalnumberofday = "";

        switch (day) {
            case 1,21,31 -> ordinalnumberofday = day + "st";
            case 2,22 -> ordinalnumberofday = day + "nd";
            case 3,23 -> ordinalnumberofday = day + "rd";
            default -> ordinalnumberofday = day + "th";
        }
        return ordinalnumberofday;
    }
    public static String getMonth(int month)
    {
        String nameofmonth = "";

        switch (month) {
            case 1 -> nameofmonth = "Jan";
            case 2 -> nameofmonth = "Feb";
            case 3 -> nameofmonth = "Mar";
            case 4 -> nameofmonth = "Apr";
            case 5 -> nameofmonth = "May";
            case 6 -> nameofmonth = "Jun";
            case 7 -> nameofmonth = "Jul";
            case 8 -> nameofmonth = "Aug";
            case 9 -> nameofmonth = "Sept";
            case 10 -> nameofmonth = "Oct";
            case 11 -> nameofmonth = "Nov";
            case 12 -> nameofmonth = "Dec";
        }
        return nameofmonth;
    }
        public static int getDayOfYear(int day, int month, int year)
        {
            if (!isValidDate(day, month, year))
                return -1;

            int total = day;

            switch (month - 1) {
                case 11:
                    total += 30;
                case 10:
                    total += 31;
                case 9:
                    total += 30;
                case 8:
                    total += 31;
                case 7:
                    total += 31;
                case 6:
                    total += 30;
                case 5:
                    total += 31;
                case 4:
                    total += 30;
                case 3:
                    total += 31;
                case 2:
                    total += 28;
                    if (isLeapYear(year))
                        ++total;
                case 1:
                    total += 31;
            }

            return total;
        }

        public static boolean isValidDate(int day, int month, int year)
        {
            return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
        }

        public static int getDays(int month, int year)
        {
            return switch (month) {
                case 4, 6, 9, 11 -> 30;
                case 2 -> {
                    if (isLeapYear(year))
                        yield 29;

                    yield 28;
                }
                default -> 31;
            };
        }

        public static boolean isLeapYear(int year)
        {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
    }

