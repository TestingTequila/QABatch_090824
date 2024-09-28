package ExceptionHandling;

public class FinallyBlock
{
    public static void main(String[] args) {
        try {
            int k = 9/0;
        }
        finally {
            System.out.println("I am finally block...and i will always be executed....");
            try {
                int j = 9 / 0;
            }
            catch (ArithmeticException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("I will be printed...if exception is handled...");
    }
}
