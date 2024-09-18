package MethodTypes2;

public class A implements Base{
    @Override
    public void addition(int a, int b) {
        int sum = a+b;
        System.out.println("addition by A: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = a-b;
        System.out.println("subtraction by A: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = a*b;
        System.out.println("multiplication by A: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = a/b;
        System.out.println("division by A: " + divide);
    }
}
