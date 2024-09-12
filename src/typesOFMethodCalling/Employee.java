package typesOFMethodCalling;

public class Employee
{
    String name;
    int age;

    public  int addition(int a, int b)
    {
        int sum=a+b;
        return sum;
    }

    public  void getInfo(Employee e1)
    {
        this.name = "Jason";
        this.age=24;
    }
}
