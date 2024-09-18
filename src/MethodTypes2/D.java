package MethodTypes2;

public class D implements Base{
    @Override
    public void addition(int a, int b) {
        int sum = 4*a+b;
        System.out.println("addition by D: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 4*a-b;
        System.out.println("subtraction by D: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 4*a*b;
        System.out.println("multiplication by D: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 4*a/b;
        System.out.println("division by D: " + divide);
    }
}
