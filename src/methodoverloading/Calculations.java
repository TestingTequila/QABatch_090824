package methodoverloading;

public class Calculations
{
    public void addition(int a, int b)
    {
        int sum =a+b;
        System.out.println("Sum of two integer numbers: " + sum);
    }

    public void addition(double a, int b)
    {
        double sum =a+b;
        System.out.println("Sum of double integer numbers: " + sum);
    }

    public void addition(int a, double b)
    {
        double sum =a+b;
        System.out.println("Sum of int double numbers: " + sum);
    }


    public void addition(double a, double b)
    {
        double sum =a+b;
        System.out.println("Sum of two double double numbers: " + sum);
    }

    public void addition(int a, int b, int c)
    {
        int sum =a+b+c;
        System.out.println("Sum of 3 integer numbers: " + sum);
    }

    //login

    public  void login(String un, String pw)
    {

    }

    public  void login(String un, String pw, int otp)
    {

    }

    public  void login(String un, String pw, String Captcha)
    {

    }

    public  void login(String api)
    {

    }

    public  void login(int OTP)
    {

    }


    //Search

    public  void search(String category)
    {

    }

    public  void search(String category, String brands)
    {

    }

    public  void search(String category, String brands, double price)
    {

    }

    public  void search(String brands, double price)
    {

    }

    public  void search(double ramSize, double price)
    {

    }


    public  void move(String leftKey)
    {
        System.out.println("Hero will move left");
    }

    public  void move(String leftKey, String topKey)
    {
        System.out.println("Hero will fire");
    }

    public  void move(String leftKey, int anyNumber)
    {
        System.out.println("Hero will vanish");
    }


}
