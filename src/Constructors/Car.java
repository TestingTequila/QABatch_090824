package Constructors;

public class Car
{
    public Car()
    {
        System.out.println("Constructor is called......");
    }

    String name;
    int age;
    boolean isMarried;

    public void m2(String name, int age, boolean isMarried)
    {
        this.name=name;
        this.age =age;
        this.isMarried = isMarried;
        System.out.println("This is method....");
    }

    public void m1(boolean isMarried, int age)
    {
        this.isMarried= isMarried;
        this.age = age;
        System.out.println("This is method....");
    }
}
