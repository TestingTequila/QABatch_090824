package ConstructorsCalling;

public abstract class C
{
    int x;
    public abstract  void m1();

    public C()
    {
        x=0;
        System.out.println("Constructor of abstract class C");
    }
}


//Can abstract class have constructor