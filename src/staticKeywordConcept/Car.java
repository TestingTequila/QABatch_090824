package staticKeywordConcept;

public class Car
{
    String name;
    int price;
    String color;
    final static int wheels=4;

    public void start()
    {
        System.out.println("Car ------------START");
    }

    public void stop()
    {
        System.out.println("Car ------------STOP");
        Car.speedTest();
        Car.gearTest();

    }

    public  static void speedTest()
    {
        System.out.println("Car -----SPEED TEST");
        Car c4 = new Car();
        c4.stop();
        c4.stop();
    }

    public  static void gearTest()
    {
        System.out.println("Car -----GEAR TEST");

    }
}
