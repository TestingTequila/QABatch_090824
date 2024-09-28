package ExceptionHandling;

public class ErrorExample
{
    public static void main(String[] args) {
        ErrorExample ee = new ErrorExample();
        ee.m1();

        System.out.println("I will be printed if exception is handled...");
    }

    public  void m1()
    {
        System.out.println("m1 method...");
        try {
            m2();
        }

        catch (Exception e)
        {
            System.out.println("Divide by zero exception occurred...");
        }

        finally {
            System.out.println("I am finally block and i will definitely be executed....");
        }

    }

    public  void m2() throws ArithmeticException
    {
        System.out.println("m2 method...");
        m3();

    }

    public  void m3() throws ArithmeticException
    {
        System.out.println("m3 method...");
        int i = 9 / 0;
    }
}
