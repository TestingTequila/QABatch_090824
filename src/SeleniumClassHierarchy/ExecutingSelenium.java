package SeleniumClassHierarchy;

public class ExecutingSelenium
{
    public static void main(String[] args) {

       //ChromeDriver driver = new ChromeDriver();
       // FirefoxDriverDriver driver = new FirefoxDriverDriver();
       // IEDriverDriver driver = new IEDriverDriver();
//        SafariDriver driver = new SafariDriver();
//       driver.getChromeDriverVersion();

        String browserName ="IE";

        WebDriver driver;
        if(browserName.equals("Chrome"))
        {
             driver = new ChromeDriver();
        }
        else if (browserName.equals("IE"))
        {
             driver = new IEDriverDriver();
        }

        else if (browserName.equals("Firefox"))
        {
             driver = new FirefoxDriverDriver();
        }

        else
        {
             driver = new SafariDriver();
        }


    }
}
