package methods;

public class MethodsConcepts {
    // WAP to add to integer numbers
    int x; //Class or global variables
    int y; //Class or global variables

    //methodsWithoutReturnType(void)+methodsWithoutParameters
    public void addition()
    {
        int sum =x+y;
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
    }

    public  void subtraction()
    {
        int diff= x-y;
    }

    public  void multiplication()
    {
        int multiply= x*y;
    }

    // WAP to print the full name of a person

    String fName;
    String lName;

    //methodsWithoutReturnType(void)+methodsWithoutParameters
    public void printFullName()
    {
        String fullName =fName + " " + lName;
        System.out.println("FULL NAME OF EMPLOYEE IS: " + fullName);
    }
}
