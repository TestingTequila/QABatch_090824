package typesOFMethodCalling;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee emp = new Employee();
//        int totalValue=emp.addition(12,8); // CallByValue
//
//        System.out.println(totalValue);

        System.out.println(emp.name + " : " + emp.age);

        emp.getInfo(emp); //Call by Reference

        System.out.println(emp.name + " : " + emp.age);
    }
}
