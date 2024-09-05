package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

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

//        IDCard idc = new IDCard();
//        String fName= idc.fullName("Ashish", "Mishra");
//        System.out.println("Name on Id Card is : " + fName + " MEDMA");

        MethodsExamples me = new MethodsExamples();
//        int marksOfStudent= me.getMarks("Ashish");
//        if(marksOfStudent==-1)
//        {
//            System.out.println("Student Name not in the list.......");
//        }
//        else {
//            System.out.println("Marks scored by student is : " + marksOfStudent);
//        }



        System.out.println("==========================================================");

//        MethodsExamples2 me1 = new MethodsExamples2();
//        int marksOfStudent1= me.getMarks("Jason");
//        if(marksOfStudent1==-1)
//        {
//            System.out.println("Student Name not in the list.......");
//        }
//        else {
//            System.out.println("Marks scored by student is : " + marksOfStudent1);
//        }

//        boolean browserExists= me1.launchBrowser("RERA");
//        if(browserExists==true)
//        {
//            System.out.println("Launching the browser......");
//        }
//        else
//        {
//            System.out.println("Please provide a valid browser name");
//        }

        MethodExample3 me3 = new MethodExample3();
        String[] myDevices= me3.employeeHoldingDevices("Ashish");
        if(myDevices.length==0)
        {
            System.out.println("Not an employee of this company....");
        }
        System.out.println(Arrays.toString(myDevices));
    }
}
