package Strings;

import java.util.Arrays;

public class StringManipulation
{
    public static void main(String[] args) {
        String s1 ="10";
        String s2="20";
        String sum = s1+s2;
//        System.out.println(sum);

        String str = "Hi this is my Java Code";
//        System.out.println(str.length());
        //li=0
        //hi=length-1 =22

        //1. charAt(): This is used to find which character exists at a particular index

//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(16));

//        if(str.charAt(3)=='h')
//        {
////            System.out.println("This statement is correct....");
//        }
//        else
//        {
////            System.out.println("This is incorrect....");
//        }

        //2. indexOf(): This is reverse of charA(), character is given, we have to get its index.
//        System.out.println(str.indexOf('i'));// occurrence of first character
//        System.out.println(str.indexOf("Java"));
//        System.out.println(str.indexOf('i', str.indexOf('i')+1));
//
//        String m1= "Welcome Ashish";
//        if(m1.indexOf("Admin")==8)
//        {
//            System.out.println("Login is successful");
//        }
//        else
//        {
//            System.out.println("Login Failed....");
//        }

        //3. toUpperCase
        //System.out.println(str.toUpperCase());

        String uc = str.toUpperCase();

        //4. toLowerCase
        System.out.println(uc.toLowerCase());

        //5. trim
        String myStr = "            Hi I am Ashish  ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

        //6. replace
        System.out.println(myStr.replace(" ", "").toUpperCase());

        String dob = "25/12/1994"; // 25-12-1994
        System.out.println(dob.replace("/", "-"));

        //7. equals
        String s11 = "Hello Selenium ";
        String s22 = "Hello Selenium";
        System.out.println(s11.trim().equals(s22));// true/false

        //8. contains

        String tg = "welcome to Ashish training";
//        if(tg.indexOf("Ashish")==11)
//        {
//            System.out.println("This is correct...");
//        }

        System.out.println(tg.contains("Jason")?"This is correct...." : "This is incorrect...");

        //split

        String lang ="JAVA_PYTHON_RUBY_DOTNET";
        System.out.println(lang.length());


        String[] myLang= lang.split("_");
        System.out.println(myLang.length);
        System.out.println(Arrays.toString(myLang));

        String myStr1 = "SeleniumxXxxXCypressxXXToscaXPostManxX";
        String[] automationTools=myStr1.split("xX");
        System.out.println(automationTools.length);
        System.out.println(Arrays.toString(automationTools));
    }





}
