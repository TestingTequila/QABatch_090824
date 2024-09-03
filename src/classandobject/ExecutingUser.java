package classandobject;

public class ExecutingUser
{
    public static void main(String[] args) {
        User u1= new User();
        u1.name = "Ravi";
        u1.age=22;
        u1.city ="Delhi";

        User u2= new User();
        u2.name = "Anjali";
        u2.age=19;
        u2.city ="London";

        User u3= new User();
        u3.name = "Kareem";
        u3.age=32;
        u3.city ="NJ";

        System.out.println(u1.name + ", " + u1.age+ ", " + u1.city );
        System.out.println(u2.name + ", " + u2.age+ ", " + u2.city );
        System.out.println(u3.name + ", " + u3.age+ ", " + u3.city );

        System.out.println("***************************u1=u2*********************************");

        u1=u2; // u1 is breaking its connection and will start pointing where u2 is pointing

        System.out.println(u1.name + ", " + u1.age+ ", " + u1.city );//Anjali
        System.out.println(u2.name + ", " + u2.age+ ", " + u2.city );//Anjali
        System.out.println(u3.name + ", " + u3.age+ ", " + u3.city );//Kareem

        u2=u3;
        System.out.println("***************************u2=u3*********************************");

        System.out.println(u1.name + ", " + u1.age+ ", " + u1.city );//Anjali
        System.out.println(u2.name + ", " + u2.age+ ", " + u2.city );//Kareem
        System.out.println(u3.name + ", " + u3.age+ ", " + u3.city );//Kareem

        u3=u1;
        System.out.println("***************************u3=u1*********************************");
        System.out.println(u1.name + ", " + u1.age+ ", " + u1.city );//Anjali
        System.out.println(u2.name + ", " + u2.age+ ", " + u2.city );//Kareem
        System.out.println(u3.name + ", " + u3.age+ ", " + u3.city );//Anjali
    }
}
