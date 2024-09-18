package advanceInheritance;

public class Car extends Vehicle
{
    public  void start()
    {
        System.out.println("Car -----start");
    }

    public  void stop()
    {
        System.out.println("Car -----stop");
    }

    public  void refuel()
    {
        System.out.println("Car -----refuel");
    }

    public  void refuel(int gearType)
    {
        System.out.println("Car -----refuel");
    }

    @Override
    public void isAutomatic()
    {
        System.out.println("Car----automatic");
    }

    public final void carLogo()
    {
        System.out.println("Car -----logo");
    }

    public  static  void engine()
    {
        System.out.println("Car ----Engine");
    }

    public  static  void engine(int i)
    {
        System.out.println("Car ----Engine");
    }
}
