package Strings;

public class StringConcept
{
    //equals method rather than ==

    public static void main(String[] args) {
        String s1="Selenium"; //String Literals
        String s2 ="Selenium";//String Literals
        System.out.println(s1==s2); // We should avoid using == while comparing Strings
        System.out.println(s1.equals(s2));

        //byte, short, int, long, float, double, char, boolean ---> Primitive Data Types
        //String, Arrays.....    ------------> Non-Primitive Data Type

        String s3= new String("Selenium");

        System.out.println(s1==s3);//This compares the object itself
        System.out.println(s1.equals(s3));// Compares the value/s of the objects


    }


}
