package oopsconceptimplementation;

public class Executing
{
    public static void main(String[] args) {

        System.out.println("======================CLASS A=======================");
        A a = new A();
        a.addition(12,4);
        System.out.println("======================CLASS B=======================");
        B b = new B();
        b.addition(12,4);
        b.subtraction(12,4);

        System.out.println("======================CLASS C=======================");
        C c = new C();
        c.addition(12,4);
        c.subtraction(12,4);
        c.multiplication(12,4);


        System.out.println("======================CLASS D=======================");
        D d = new D();
        d.addition(12,4);
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);



    }
}
