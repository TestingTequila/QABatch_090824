package MethodTypes2;

public interface Base
{
    public void addition(int a, int b);

    public void subtraction(int a, int b);

    public void multiplication(int a, int b);

    public void division(int a, int b);
}

//normal class  --> can hold only concrete methods [inheritance through extends keyword]
//abstract class--> can hold both concrete and abstract methods [inheritance through extends keyword]
//interface     --> can hold only and only abstract methods [inheritance through implements keyword]
