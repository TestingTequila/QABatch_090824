package Constructors;

public class ExecutingMachine
{
    public static void main(String[] args) {
        Machine.engineType = "$ Stroke";
        Machine.machineCost=5000;
        Machine.start();
        Machine.refuel();
        Machine.brake();
        Machine.stop();
        System.out.println("System class has private constructor");

    }
}
