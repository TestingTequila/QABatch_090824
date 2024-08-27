package variables;

public class Operators
{
    public static void main(String[] args) {
        //1. I/I = I part only

        int a =10;
        int b =6;
        System.out.println(a/b);

        //2. Decimal in numerator or denominator = Decimal Result

        double d1 =10.0;
        int d2= 6;
        System.out.println(d1/d2);

        //3. Modulo operator - remainder
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(10.0%3);
    }
}
