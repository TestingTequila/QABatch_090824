package methods;

//methodsWithoutReturnType(void)+methodsWithParameters
public class MethodTypeTwo
{
    // WAP to perform addition of two integer numbers


    public void addition(int x,int y )
    {
        int sum =x+y;
        System.out.println("Sum of numbers is: " + sum);
    }

    public void printFullName(String fName, String lName)
    {
        String fullName =fName+ " " + lName;
        System.out.println("Complete Name of Employee is: " + fullName);
    }

    public void subtraction()
    {
       int x=12;
       int y=8;
       int diff =x-y;
        System.out.println("Subtraction:" + diff);
    }

}
