package ExceptionHandling;

public class Student
{
    public static int getMarks(String name)
    {
        if(name.equals("Rashmi"))
        {
            try {
                int i = 9 / 0;

            }
            catch (Exception e)
            {
                System.out.println("This is Catch block....");
                return 55;
            }
            finally {
                System.out.println("This is finally block....");
                return 77;
            }
           // return 100;
        }
        else if (name.equals("Tom"))
        {
            return 95;
        }

        else if (name.equals("Ravi"))
        {
            return 70;
        }
        else
        {
            System.out.println("Student Not found....");
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks = getMarks("Rashmi");
        System.out.println("marks : " + marks);
    }
}
