package Constructors;

public class LoginPage
{
    static String  username;
    static  String password;
    int otp;
    String api;

    int captcha;

    public LoginPage(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    public LoginPage(String username, String password, int otp)
    {
        this.username=username;
        this.password=password;
        this.otp=otp;
    }

    public LoginPage(String username, String password, int otp, int captcha)
    {
        this.username=username;
        this.password=password;
        this.otp=otp;
        this.captcha= captcha;
    }

    public LoginPage(String api)
    {
        this.api=api;
    }

    public static void doLogin()
    {
        System.out.println("Entered credentials: " + username + ": " + "********");
        System.out.println("Click on Login Button.....");
        System.out.println("Login is successful for user :" + username );
    }



}
