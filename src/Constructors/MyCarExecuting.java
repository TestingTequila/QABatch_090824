package Constructors;

public class MyCarExecuting
{
    public static void main(String[] args) {
        MyCar mc = new MyCar("Jeep", 50000);
        System.out.println(mc.name + ", " + mc.color+", " + mc.price+", " + mc.isAutomatic);//Jeep, null, 50k, false

        mc.name="Audi";
        mc.price=60000;
        System.out.println(mc.name + ", " + mc.color+", " + mc.price+", " + mc.isAutomatic);


    }
}
