package Constructors;

public class MyCar
{
    String name;
    String color;
    int price;
    boolean isAutomatic;

    public  MyCar(String name, String color, int price, boolean isAutomatic)
    {
        this.name=name;
        this.color=color;
        this.price=price;
        this.isAutomatic=isAutomatic;
    }

    public MyCar(String name, String color)
    {
        this.name=name;
        this.color=color;
    }

    public  MyCar(String name, int price)
    {
        this.name=name;
        this.price=price;
    }
}
