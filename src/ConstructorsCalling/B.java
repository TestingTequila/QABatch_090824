package ConstructorsCalling;

public class B extends A
{
    public B()
    {
        System.out.println("Constructor of Class B");
    }

    public B(String s)
    {
        System.out.println("Parametrized Constructor of Class B with String " + s);
    }
}
