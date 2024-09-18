package advanceInheritance;

public class TestCar
{
    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
//        vehicle.isAutoParking(); //Vehicle----auto parking
//
//        Car car = new Car();
//        car.start(); // Car ---start
//        car.stop();  // Car ---stop
//        car.refuel();// Car refuel
//        car.isAutoParking();// Vehicle----auto parking
//
//        BMW bmw = new BMW();
//        bmw.autoParking(); //BMW --auto parking
//        bmw.start();       //  BMW---start
//        bmw.stop();       //Car ---stop
//        bmw.refuel();     //Car ---refuel
//        bmw.isAutoParking();//Vehicle----auto parking
//        BMW.engine();

        //TOP CASTING -- Parent-Child Relationship b/w class

        Vehicle v = new Car();
        v.isAutomatic();

        Car c= new BMW();
        BMW.engine();
        //start();       //start();
        //stop();        //stop();
        //refuel();      //refuel();
        //isAutomatic(); //isAutomatic();
                         //autoParking();

        c.start(); // BMW--start
        c.stop();
        c.refuel();
        c.isAutomatic();


      BMW b  = (BMW)new Car();// Down casting is not possible in Java. If we make it possible through type casting, this will throw
                              // an exception 'ClassCastException' at runtime.


    }
}
