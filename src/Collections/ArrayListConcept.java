package Collections;

import java.util.*;

public class ArrayListConcept
{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0]=12;
        numbers[1]=15;
        numbers[2]=34;
        numbers[9]=67;
        numbers[4]=15;

        //System.out.println(numbers[10]);

        String[] products = new String[10000];
        products[0]="Iphone10";
        products[1]= "Iphone13";
        products[2]="Laptop-Toshiba";

        //ArrayList
        List<Integer> list = new ArrayList();
        list.add(12);
        list.add(44);
        list.add(56);
        list.add(100);
        list.add(12);

        for(int i=0; i <list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("=====================FOR LOOP=============================");
        List<String> students = new ArrayList<>();
        students.add("Jason");
        students.add("Rohit");
        students.add("Kareem");
        students.add("Roger");
        students.add("Mohit");

        for(int i=0; i <students.size(); i++)
        {
            System.out.println(students.get(i));
        }

        System.out.println("=============WHILE LOOP==============================");
        int i=0;
        while ( i <students.size())
        {
            if(students.get(i).equals("Kareen"))
            {
                System.out.println("He has won the first prize...");
            }
            System.out.println(students.get(i));
            i++;
        }

        System.out.println("=============ADVANCED FOR LOOP==============================");
        for(String s: students)
        {
            System.out.println(s);
        }

        System.out.println("==================DIRECTLY USING ARRAYLIST================");
        System.out.println(Arrays.asList(students));

        List al = new ArrayList();
        al.add(12);
        al.add("Jason");
        al.add(12.45);
        al.add('M');
        al.add(true);

        for(Object o : al)
        {
            System.out.println(o);
        }

        List lst = new ArrayList<Integer>();

        //In ArrayList elements are added in an ordered way
        //ArrayList can hold duplicate value


        //HashSet

        System.out.println("===================HashSet============================");
        Set<Integer> empId = new HashSet<>();
        empId.add(1234);
        empId.add(34);
        empId.add(56);
        empId.add(567);
        empId.add(1234);
        empId.add(100);
        empId.add(105);
        empId.add(2005);
        empId.add(2024);

        for(Integer e : empId)
        {
            System.out.println(e);
        }

        //Order is not maintained in a Hash Set
        //HashSet cannot hold duplicate values


        //HashMap
        //Order is not maintained
        //Cannot hold duplicate values
        //It saves data as key-value pair....

    }
}
