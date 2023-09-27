/*----------------------------------------------------------------------------------------------------------------------
Çağrıldığında ekrana 01.01.1900 ve 31.12.2100 tarihleri arasında rasgele bir tarihi yazan printRandomDate isimli
metodu yazınız. Metodun ekrana yazdırdığı tarih geçerli bir tarih olmalıdır. Rasgele tarihin Şubat ayına denk gelmesi
durumunda, seçilen yılın artık yıl olup olmamasına göre, Şubat ayı 29 çekebilecektir. Tarih ekrana aşağıdaki formatta
yazdırılacaktır:
11th Jul 1983
-----------------------------------------------------------------------------------------------------------------------*/
package randomdate;

import java.util.Random;
import static randomdate.DateUtil.getDays;

public class RandomDate {
    public Random r;

    public void printRandomDate()
    {
       int year = r.nextInt(1900,2101);
       int month = r.nextInt(1,13);
       int day = r.nextInt(1,getDays(month, year) + 1);

       printDate(day,month,year);
    }

    public String printDate(int day, int month, int year)
    {
        return (day + suffix(day)) + getMonth(month) + (year + "") ;
    }
    public String suffix(int day)
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
    public String getMonth(int month)
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
}


