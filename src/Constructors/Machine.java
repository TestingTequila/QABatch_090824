package Constructors;

public class Machine
{
    static String engineType;
    static int machineCost;

    private Machine(String engineType, int machineCost)
    {
        this.engineType=engineType;
        this.machineCost=machineCost;
    }

    public static void start()
    {
        System.out.println("Machine start......");
    }

    public static void stop()
    {
        System.out.println("Machine stop......");
    }

    public static void refuel()
    {
        System.out.println("Machine refuel......");
    }

    public static void brake()
    {
        System.out.println("Machine break......");
    }

}
