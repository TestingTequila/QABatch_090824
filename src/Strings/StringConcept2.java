package Strings;

public class StringConcept2
{
    public static void main(String[] args) {
//        String str1 = "Selenium"; //1 Object created
//        String str2 = "Selenium"; //No object will be created within SCP
//        String str3 = "selenium";
//
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str3));

        String s1 = new String("testing");// 2
        String s2 = new String("testing");// 1
        String s3="testing";//0
        String s4="testing";//0

        System.out.println("-----------------------");
        System.out.println(s2.equals(s3));
        System.out.println("-----------------------");
        System.out.println(s3==s4);
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s3==s4);//true
        System.out.println(s3.equals(s4));

        String s5= "Testing";
        s5=null;
        System.out.println(s5.length());// NPE
    }
}
