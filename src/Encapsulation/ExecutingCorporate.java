package Encapsulation;

public class ExecutingCorporate
{
    public static void main(String[] args) {

        Corporate corp = new Corporate("Jason", 8000);
        corp.setName("Kerrie");
        corp.setSalary(9000);
        corp.printSalary();
//        System.out.println("Pay employee : " + corp.getName() + ", a Salary of : " +corp.getSalary() + "$");
    }
}
