package MethodTypes2;

public class B implements Base{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+b;
        System.out.println("addition by B: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 2*a-b;
        System.out.println("subtraction by B: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 2*a*b;
        System.out.println("multiplication by B: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 2*a/b;
        System.out.println("division by B: " + divide);
    }
}
