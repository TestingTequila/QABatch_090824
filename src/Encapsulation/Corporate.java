package Encapsulation;

public class Corporate
{
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  Corporate(String name, double salary)
    {
        this.name = name;
        this.salary=salary;
    }

    public void printSalary()
    {
        if(getName().equals("Kerrie"))
        {
            System.out.println("Not an employee of this Company");
        }
        else
        {
            System.out.println("Pay the Employee: " + getName());
            if(getSalary()>10000)
            {
                System.out.println("Invalid salary....PLease check...");
            }
            else
            {
                System.out.println("A Salary of: " + getSalary());
            }
        }
    }

}
