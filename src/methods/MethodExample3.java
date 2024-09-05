package methods;

public class MethodExample3
{
//    public String[] employeeHoldingDevices(String empName)
//    {
//        if(empName.equals("Kerrie"))
//        {
//            String[] devices= {"macbook pro", "ipad", "iph14"};
//            return devices;
//        }
//        else if(empName.equals("Ankita"))
//        {
//            String[] devices= {"macbook", "Windows 10"};
//            return devices;
//        }
//
//        else if(empName.equals("Robert"))
//        {
//            String[] devices= {"Samsung S14", "Vodafone SIM"};
//            return devices;
//        }
//        return new String[0];
//    }


    public String[] employeeHoldingDevices(String empName)
    {
        String[] devices =new String[0];
        if(empName.equals("Kerrie"))
        {
            devices= new String[]{"macbook pro", "ipad", "iph14"};

        }
        else if(empName.equals("Ankita"))
        {
            devices= new String[]{"macbook", "Windows 10"};

        }
        else if(empName.equals("Robert"))
        {
            devices= new String[]{"Samsung S14", "Vodafone SIM"};

        }
        return devices;
    }
}
