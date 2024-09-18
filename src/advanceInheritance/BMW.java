package advanceInheritance;

public class BMW extends Car
{

    public  void autoParking()
    {
        System.out.println("BMW---auto parking");
    }

    @Override
    public  void start()
    {
        System.out.println("BMW -----start");
    }

    @Override
    public void isAutomatic()
    {
        System.out.println("BMW----automatic");
    }

    public  static  void engine()
    {
        System.out.println("BMW ----Engine");
    }

    @Override
    public  void refuel(int gearType)
    {
        System.out.println("BMW -----refuel" + gearType);
    }

    public  void refuel(int gearType, String Logo)
    {
        System.out.println("BMW -----refuel" + gearType);
    }

//    @Override
//    public  static  void engine(int i)
//    {
//        System.out.println("Car ----Engine");
//    }

}
