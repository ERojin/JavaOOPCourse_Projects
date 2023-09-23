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

public class Histogram_Data {
    public static int [] getHistogramData(int [] a, int n)
    {
        int [] counts = new int[n+1];

        for (int i = 0; i < a.length; ++i)
            ++counts[a[i]];

        return counts;
    }
}
