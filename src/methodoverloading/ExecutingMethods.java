package methodoverloading;

public class ExecutingMethods
{
    public static void main(String[] args)
    {
           main(12,"Jason");
        ExecutingMethods.main(23, "Kerrie");
    }

    public static void main(String[] args, int a)
    {

    }

    public static void main(String[] args, String a)
    {

    }

    public static void main(int b, String a)
    {

    }
}
