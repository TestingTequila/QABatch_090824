package arrays;

import java.util.Arrays;

public class ArrayTypes
{
    public static void main(String[] args) {
        //1. dataType[] arrayName = {value1, value2, value3.......valueN};

        // 13, 45, 56, 78, 60

       int[] numbers = {13, 45, 56, 78, 60, 100, 150, 53, 84, 72, 43, 11, 22,33,44,55,66,77,88,99};
//        System.out.println(Arrays.toString(numbers));
//        for(int i: numbers)
//        {
//            System.out.println(i);
//            if(i>=100)
//            {
//                System.out.println("Number is greater than or equal to 100");
//            }
//        }
//
//       System.out.println("=========================WHILE LOOP==========================");
//       int i =0;
//       while (i<numbers.length)
//       {
//           System.out.println(numbers[i]);
//           i++;
//       }
//
//        System.out.println("=========================FOR LOOP==========================");
//
//        for (int i2 =0;i2<numbers.length;i2++)
//        {
//            System.out.println(numbers[i2]);
//
//        }
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);

        // Length of an array: It many values an array is storing
        // NameOfArray.length
//        System.out.println(numbers.length);

        //Lowest Index = 0;
        //highest index = lengthOfArray-1

        // Ashish, Justin, Luxmi, Ron, Salma, Secoda - Group/String

//        System.out.println("=========================WHILE LOOP==========================");
//
        String[] javaStudents = {"Ashish", "Justin", "Luxmi", "Ron", "Salma", "Secoda"};
        System.out.println(Arrays.toString(javaStudents));
//        for(String s: javaStudents)
//        {
//            System.out.println(s);
//        }

//        int i=0;
//        while (i<javaStudents.length)
//        {
//            System.out.println(javaStudents[i]);
//            if(javaStudents[i]=="Ron")
//            {
//                System.out.println("He is a boxer...");
//                i++;
//            }
//            i++;
//        }
//
//        System.out.println("=========================FOR LOOP==========================");
//
//        for (int i1=0;i1<javaStudents.length;i1++)
//        {
//            System.out.println(javaStudents[i1]);
//
//        }
//        System.out.println(javaStudents[0]);
//        System.out.println(javaStudents[1]);
//        System.out.println(javaStudents[2]);
//        System.out.println(javaStudents[3]);
//        System.out.println(javaStudents[4]);
//        System.out.println(javaStudents[5]);
//
//        System.out.println(javaStudents.length);


        // a, e, i, o, u
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//
//        for(char c: vowels)
//        {
//            System.out.println(c);
//        }
//        System.out.println(vowels.length);
        //li = 0
        //hi = 4

//        System.out.println(vowels[0]);
//        System.out.println(vowels[1]);
//        System.out.println(vowels[2]);
//        System.out.println(vowels[3]);
//        System.out.println(vowels[4]);

        //while loop

//
//        for(int i =0;i<vowels.length;i++)
//        {
//            System.out.println(vowels[i]); //a,e, i,o,u
//
//        }

        //Ashish, 32, London, M, Unmarried, 69.5

//        Object[] myData = {"Ashish", 32, "London", 'M', false, 69.5};
//
//        System.out.println("=========================WHILE LOOP==========================");
//        int i=0;
//        while (i<myData.length)
//        {
//            System.out.println(myData[i]);
//            i++;
//        }
//
//        System.out.println("=========================FOR LOOP==========================");
//
//        for (int i1=0;i1<myData.length;i1++)
//        {
//            System.out.println(myData[i1]);
//
//        }
//
//        System.out.println("=========================ADVANCED FOR LOOP==========================");
//
//        for(Object o: myData)
//        {
//            System.out.println(o);
//        }
//
//        System.out.println("=========================JUST DISPLAY ARRAY VALUES==========================");
//
//        System.out.println(Arrays.toString(myData));


        //1. dataType[] arrayName = {value1, value2, value3.......valueN}; - When you know te exact values
        //2. dataType[] arrayName = new dataType[countOfValuesYouWantToStore]; - new keyword
//
//        int[] num = new int[8];
//        num[2]=55;
//        num[6]=127;
//        num[0]=34;
//
//        for(int i : num)
//        {
//            System.out.println(i);
//        }
//
//        int j;
//        j=10;


        // store name of 5 fruits

        String[] fruits = new String[6];
        fruits[3] = "Mango";
        fruits[0]="Apple";
        fruits[5]="Orange";
        fruits[6]="Grapes";
        System.out.println(Arrays.toString(fruits));

        //COLLECTIONS:

        //JAVA:
        //--> Statements - if-else, if-elseIf, Switch
        //--> Loops      - while, for loop, advanced for loop/for each loop
        //--> Arrays     - Static/Dynamic arrays
        //--> Methods    -
    }
}
