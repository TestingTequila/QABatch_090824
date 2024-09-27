package ManagingStringImmutability;

public class StringBufferStringBuilder
{
    public static void main(String[] args) {

        String s1 = new String("Selenium");//Selenium
        s1.concat(" Automation Class"); // Selenium Automation Class
        System.out.println(s1);// Selenium

        System.out.println("==========================================================");
        //StringBuffer and StringBuilder: to make String Mutable

        StringBuilder sb = new StringBuilder("Cypress"); // Cypress
        sb.append(" Automation Class"); // Cypress Automation Class
        System.out.println(sb);

        System.out.println("=========================================================");

        StringBuilder sbdr = new StringBuilder("Postman");
        sbdr.append(" Automation Class");
        System.out.println(sbdr);

        //StringBuffer(1.0) Vs StringBuilder(1.5)
        //Synchronized          Non-Synchronized
        //Thread-Safe           Not Thread-Safe
        //Slower                Faster




    }
}
