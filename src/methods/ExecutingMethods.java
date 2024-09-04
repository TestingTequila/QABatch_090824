package methods;

public class ExecutingMethods
{
    public static void main(String[] args)
    {

//        MethodsConcepts mc = new MethodsConcepts();
//        mc.x=12;
//        mc.y=8;
//        mc.addition();
//
//        MethodsConcepts mc1 = new MethodsConcepts();
//        mc1.fName = "Jason";
//        mc1.lName = "Hill";
//        mc1.printFullName();

//        MethodTypeTwo mt1 = new MethodTypeTwo();
//        mt1.addition(12,8);
//        mt1.printFullName("Jason", "Roger");
//        mt1.subtraction();//20
//
//        MethodTypeTwo mt2 = new MethodTypeTwo();
//        mt2.addition(32,88);
//        mt2.printFullName("Ashish", "Mishra");
//        mt2.subtraction();//20

//        MethodTypeThree mt3 = new MethodTypeThree();
//        //int total1 =mt3.addition1(12,8);//void
//
//        int total2= mt3.addition2(12,8);//int
//        System.out.println(total2*5);

        IDCard idc = new IDCard();
        String fName= idc.fullName("Ashish", "Mishra");
        System.out.println("Name on Id Card is : " + fName + " MEDMA");
    }
}
