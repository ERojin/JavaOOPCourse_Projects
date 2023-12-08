package wrapper.test;

import wrapper.IntValue;

public class IntValueCacheTest {
    public static void run()
    {
        IntValue ival1 = IntValue.of(100);
        IntValue ival2 = IntValue.of(100);
        IntValue ival3 = IntValue.of(-129);
        IntValue ival4 = IntValue.of(-129);

        System.out.println(ival1 == ival2 ? "Aynı nesneler" : "Farklı Nesneler");
        System.out.println(ival3 == ival4 ? "Aynı nesneler" : "Farklı Nesneler");
        System.out.println(ival1.getValue());
        System.out.println(ival2.getValue());
        System.out.println(ival3.getValue());
        System.out.println(ival4.getValue());
    }

    public static void main(String[] args)
    {
        run();
    }
}
