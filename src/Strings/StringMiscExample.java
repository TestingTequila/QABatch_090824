package Strings;

public class StringMiscExample
{
    public static void main(String[] args) {
        String s1 = new String("Test");
        String s2 = new String("Test");
        s1=s2;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
