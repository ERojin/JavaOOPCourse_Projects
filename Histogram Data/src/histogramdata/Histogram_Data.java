/*----------------------------------------------------------------------------------------------------------------------
Aşağıdaki açıklamalara göre getHistogramData isimli metodu ArrayUtil sınıfı içerisinde yazınız
ve aşağıdaki kod ile test ediniz:
Açıklamalar:
	- Metot int türden bir dizi ve int türden bir n sayısı alacaktır:
	int [] getHistogramData(int [] a, int n)

	- Metot a dizisi içerisinde [0, n] aralığındaki sayılardan jhangisinin kaç tane olduğunu içeren bir sayaç dizisine
	geri dönecektir

	- Sayaç dizisinin her bir indeks numarası [0, n] aralığındaki sayıyı temsil edecektir. Yani örneğinb sıfır numaralı
	indeksteki değer sıfır sdayısının kaç tane olduğu bilgisini içerecektir
-----------------------------------------------------------------------------------------------------------------------*/
package histogramdata;

import static java.lang.Math.floor;
import static org.csystem.util.array.ArrayUtil.max;

public class Histogram_Data {
    public static int [] getHistogramData(int [] a, int n)
    {
        int [] counts = new int[n+1];

        for (int i = 0; i < a.length; ++i)
            ++counts[a[i]];

        return counts;
    }

    public static void drawHistogram(int [] data, int count, char ch)
    {
        int maxVal =max(data);

        for (int i = 0; i < data.length; ++i) {
            int charCount = (int)floor(data[i] * count / (double) maxVal);

            while (charCount -- > 0)
                System.out.print(ch);

            System.out.println();
        }

    }

}
