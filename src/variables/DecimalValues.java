package variables;

public class DecimalValues
{
    public static void main(String[] args)
    {
        //float - 4 bytes-32 bits, precision 7 decimal digits
        //double- 8 bytes-64 bits, precision 16 decimal digits

        float f1= (float)1.23456789;
        System.out.println(f1);

        float f2= 12.33333333333333333333f;
        System.out.println(f2);


        double d1= 1.23456789;
        System.out.println(d1);

        double d2= 12.33333333333333333333;
        System.out.println(d2);


        //Char - 2 bytes
        //range - a-z, 0-9, A-Z, special characters
        char c1= 'a';
        System.out.println(c1); //a

        char c2 = 'b';
        System.out.println(c2); //b


        System.out.println(c1+c2);//195

        char c3='A'; // 65
        char c4= 'c';// 99
        System.out.println((int)c3);
        System.out.println((int)c4);
        System.out.println(c3+c4);
        System.out.println(c3+'0');// 65+48

        // boolean - ~1 bit, {true, false}

        boolean b1 =true;
        System.out.println(b1);
        boolean b2= false;
        System.out.println(b2);

        System.out.println('a' + 10.12);

        //System.out.println(12 +true); not possible as 12 is from numeric family and true is from boolean family


        char cc1= 'a';//97
        char cc2= 'b';//98
        System.out.println(cc1+""+cc2);//ab






















    }
}
