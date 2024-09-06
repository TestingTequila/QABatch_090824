package Constructors;

public class ExecutingConstructors
{
    public static void main(String[] args) {
//        ConstructorBasics cb = new ConstructorBasics();
//        cb.length =55;
//        System.out.println(cb.length);
//        System.out.println(cb.salary);
//        System.out.println(cb.age);
//        System.out.println(cb.mobileNumber);
//        System.out.println(cb.carLength);
//        System.out.println(cb.plotSize);
//        System.out.println(cb.gender);
//        System.out.println(cb.isMarried);
//        System.out.println(cb.name);

        Car c1 = new Car();
        c1.m2("Jason", 32, false);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.isMarried);

        System.out.println("=========================================================");
        c1.m1(true, 29);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.isMarried);


    }
}
