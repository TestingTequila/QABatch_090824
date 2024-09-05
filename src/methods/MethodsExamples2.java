package methods;

public class MethodsExamples2
{
    public boolean launchBrowser(String browserName)
    {
        boolean flag = false;

        if(browserName.equals("Chrome"))
        {
            flag= true;
        }
        else if(browserName.equals("Firefox"))
        {
            flag= true;
        }
        else if(browserName.equals("IE"))
        {
            flag= true;
        }
        else if(browserName.equals("Edge"))
        {
            flag= true;
        }
        else if(browserName.equals("Opera"))
        {
            flag= true;
        }
        return flag;
    }
    public int getMarks(String studentName)
    {
        int marks =-1;

        if(studentName.equals("Neha"))
        {
            marks= 100;
        }

        else if(studentName.equals("Jason"))
        {
            marks= 56;
        }

        else if(studentName.equals("Karen"))
        {
            marks= 80;
        }

        else if (studentName.equals("Roger"))
        {
            marks= 33;
        }
        return marks;
    }
}
