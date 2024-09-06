package staticKeywordConcept;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="BMW";
        c1.price=90000;
        c1.color="Red";
        System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);

        Car c2 = new Car();
        c2.name="Audi";
        c2.price=80000;
        c2.color="White";
        System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + Car.wheels);

        Car c3 = new Car();
        c3.name = "Honda";
        c3.price = 50000;
        c3.color = "Black";
        System.out.println(c3.name + " " + c3.price + " " + c3.color + " " + Car.wheels);

        //Calling non-static method or variable inside other non static method
        //==> Since methods are non-static, we can call them internally using object reference or can also call them directly as they
        //    are part of same heap memory

        //Calling static method or variable inside other static method
        //==> Since static variables and methods are part of same CMA, we can call them directly within static methods or
        //    we can call them using class name

        // Calling static method/variable inside non-static method
        //==> We can call static method/variable inside non-static method using class name

        // Calling non-static method/variable inside static method
    }
}
