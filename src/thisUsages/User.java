package thisUsages;

public class User
{
    String name; // Ashish
    int age;// 29
    String city; //Mumbai

    public  User(String name, int age, String city) //Ashish, 29, Delhi
    {
        this(name, age);//Ashish, 29
    }

    public  User(String name, int age) //Ashish, 29
    {
        this("Mumbai");
      this.name =name;
      this.age=age;
    }

    public  User(String city) //Mumbai
    {
       this.city=city;
    }

    public  User(String name, String city)
    {
       this.name=name;
       this.city=city;
    }

//    public  void m1()
//    {
//        this("Pune");
//    }

    //Constructors can be called within constructors only and not inside the method.


    public  void m1()
    {
        System.out.println("m1 method...");
        this.m2();
    }

    public  void m2()
    {
        System.out.println("m2 method...");
    }

    public  void m3()
    {
        System.out.println("m3 method...");
    }
}
