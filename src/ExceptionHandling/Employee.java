package ExceptionHandling;

public class Employee
{
    public static void main(String[] args) {
        int i =9;
        int j =3;
        String name;
        try {
            int k = i / j;
            name = null;
            System.out.println(name.length());

        }


        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero exception happened....");
            e.printStackTrace();
        }

        catch (NullPointerException e)
        {
            System.out.println("Null pointer identified....");
            e.printStackTrace();
        }

        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound exception identified....");
            e.printStackTrace();
        }

        catch (Exception e)
        {
            System.out.println("Divide by zero exception happened....");
            e.printStackTrace();
        }
        System.out.println("I am executed......");
    }


}

//Exception: This occurs because of the code we write
