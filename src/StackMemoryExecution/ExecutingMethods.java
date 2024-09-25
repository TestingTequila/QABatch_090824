package StackMemoryExecution;

public class ExecutingMethods
{
    public static void main(String[] args) {
        Application app = new Application();
        app.m1();
        app.m2();
        app.m2();
    }
}
