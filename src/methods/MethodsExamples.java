package methods;

public class MethodsExamples
{
    public int getMarks(String studentName)
    {
        if(studentName.equals("Neha"))
        {
            return 100;
        }

        else if(studentName.equals("Jason"))
        {
            return 56;
        }

        else if(studentName.equals("Karen"))
        {
            return 80;
        }

        else if (studentName.equals("Roger"))
        {
            return 33;
        }
        else {
            return -1;
        }
    }
}
