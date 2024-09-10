package Encapsulation;

public class LaunchBrowser
{
    private void checkRam()
    {
        System.out.println("checking RAM......");
    }

    private void checkVersion()
    {
        System.out.println("checking VERSION....");
    }

    private void checkOs()
    {
        System.out.println("checking OS....");
    }

    private void checkBrowserServices()
    {
        System.out.println("checking BrowserServices....");
    }

    public void browserLaunching()
    {
        checkRam();
        checkVersion();
        checkOs();
        checkBrowserServices();
        System.out.println("Launching the browser.......");
    }

}
