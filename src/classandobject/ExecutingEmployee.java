package classandobject;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name ="Jason";
        emp1.age =28;
        emp1.city ="London";
        emp1.salary =3000;

        System.out.println("==================EMP1=====================================");
        System.out.println("NAME: "+ emp1.name + " AGE: " +emp1.age + " CITY: " + emp1.city + " SALARY: " + emp1.salary);

        System.out.println("==================EMP2=====================================");
        Employee emp2 = new Employee();
        emp2.name ="Roger";
        System.out.println("NAME: "+ emp2.name + " AGE: " +emp2.age + " CITY: " + emp2.city + " SALARY: " + emp2.salary);

        System.out.println("==================EMP3=====================================");

        Employee emp3 = new Employee();
        emp3=null;
        System.out.println(emp3.name); //NPE

        emp3 = new Employee();

        System.out.println("===============================OBJECT WITHOUT REFERENCE=================");

        new Employee().name="Ashish";
        new Employee().age = 29;
        new Employee().city ="Delhi";
        new Employee().salary =75000;

        Employee emp4 =new Employee();
        emp4 =null;

        System.gc();

    }
}
