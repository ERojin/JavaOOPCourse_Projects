/*----------------------------------------------------------------------------------------------------------------------
	 Bir kesri temsil eden Fraction isimli sınıfı aşağıdaki açıklamalara göre yazınız
	Açıklamalar:
	+ Sınıf Matematikteki bir kesri temsil ettiğinden pay ve payda değerleri tutulacaktır

	+ Sınıfın ilgili set ve get metotları yazılacaktır

	+ Pay'ın sıfırdan farklı, paydanın sıfır olması durumunda tanımsızlığa ilişkin bir mesaj verilecektir, pay ve paydanın
	her ikisinin birden sıfır olması durumunda belirsizliğe ilişkin mesaj verilecektir. Her iki durumda da program
	sonlandırılacaktır

	+ Kesir her durumda sadeleşmiş bir biçimde tutulacaktır. Örneğin kesrin pay ve paydası sırasıyla 4 ve 18 olarak
	verildiğinde kesir 2 / 9 olarak tutulacaktır.

	+ Kesir negatif ise işaret payda bulunacaktır. Örneğin kesrin pay ve paydası sırasıyla 3 ve -4 olarak verilmişse
	kesir -3 / 4 biçiminde tutulacaktır

	+ Kesrin pay ve paydasının ikisinin birden negatif olması durumunda kesir pozitif olarak tutulacaktır

	+ Kesrin payının sıfır olması durumunda payda ne olursa olsun 1(bir) yapılacaktır

	+ Sınıfın iki kesri toplayan, bir kesir ile bir tamsayıyı toplayan metotları olacaktır. Aynı işlemler
	 çıkarma, çarpma ve bölme için de yapılacaktır

	+ Sınıfın kesri 1(bir) artıran ve bir azaltan inc ve dec metotları yazılacaktır

	+ Sınıfın toString metodu şu formatta yazı döndürecektir:
	    3 / 10 kesri için -> 3 / 10 = 3.333333
	    10 / 1 kesri için -> 10

	 + Sınıfın default ctor'u "0 / 1" kesrini temsil eden nesneyi yaratmak için kullanılabilecektir

	 + Sınıfın compareTo metodu iki kesrin büyüklük küçüklük karşılaştırmasını yapacaktır

	 + Kesrin double türden ondalık değerini döndüren getRealValue metodu yazılacaktır

	 + Sınıfın public bölümünü değiştirmeden istediğiniz değişikliği ve eklemeleri yapabilirsiniz

----------------------------------------------------------------------------------------------------------------------*/
package math;

public class Fraction {
    private int m_a;
    private int m_b;

    private static Fraction add(int a1, int b1, int a2, int b2)
    {
       return new Fraction(a1 * b2 + b1 * a2, b2 * b1);
    }
    private static Fraction subtract(int a1, int b1, int a2, int b2)
    {
        return add(a1, b1, -a2, b2);
    }
    private static Fraction multiply(int a1, int b1, int a2, int b2)
    {
        return new Fraction(a1 * a2 , b1 * b2);
    }
    private static Fraction divide(int a1, int b1, int a2, int b2)
    {
        return multiply(a1, b1, b2, a2);
    }
    private static void check(int a, int b)
    {
        if (b == 0) {
            if (a == 0)
                throw new NumberFormatException("Indeterminate");

            throw new NumberFormatException("Undefined");
        }
    }

    private void simplify()
    {
        int min = Math.min(Math.abs(m_a), m_b);

        for (int i = min; i > 1; --i)
            if (m_a % i == 0 && m_b % i == 0) {
                m_a /= i;
                m_b /= i;
                break;
            }
    }
    private void setSign()
    {
        if (m_b < 0) {
            m_a = -m_a;
            m_b = -m_b;
        }
    }

    private void set (int a, int b)
    {
        if (a == 0) {
            m_a = 0;
            m_b = 1;
            return;
        }

        m_a = a;
        m_b = b;
        setSign();
        simplify();
    }
    public Fraction()
    {
       m_b = 1;
    }

    public Fraction(int a, int b)
    {
        check(a,b);
        set(a,b);
    }

    public Fraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public int getNumerator()
    {
        return m_a;
    }

   public void setNumerator(int val)
    {
        if (val == m_a)
            return;
        set(val, m_b);
    }

    public int getDenominator()
    {
        return m_b;
    }
    public void setDenominator(int val)
    {
        if (val == m_b)
            return;
        check(m_a, val);
        set(m_a,val);
    }

    public double getRealValue()
    {
        return (double)m_a / m_b;
    }

    public Fraction add(Fraction other)
    {
        return add(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction add(int val)
    {
       return add(m_a,m_b,val,1);
    }

    public Fraction subtract(Fraction other)
    {
        return subtract(m_a,m_b, other.m_a, other.m_b);
    }

    public Fraction subtract(int val)
    {
        return subtract(m_a, m_b, 1, val);
    }

    public Fraction multiply(Fraction other)
    {
        return multiply(m_a,m_b,other.m_a, other.m_b);
    }

    public Fraction multiply(int val)
    {
        return multiply(m_a,m_b,val,1);
    }

    public Fraction divide(Fraction other)
    {
       return divide(m_a,m_b,other.m_a, other.m_b);
    }

    public Fraction divide(int val)
    {
        return divide(m_a,m_b,val,1);
    }

    public void inc()
    {
        m_a += m_b;
    }

    public void dec()
    {
        m_a -= m_b;
    }

    public int compareTo(Fraction other)
    {
        return m_a * other.m_b - m_b * other.m_a;
    }

    public String toString()
    {
       return String.format("%d%s", m_a, m_b != 1 ? String.format(" / %d = %f", m_b, getRealValue()) : "");
    }
}
