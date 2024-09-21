package SeleniumClassHierarchy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoteWebDriver implements WebDriver, JavaScriptExecutor, TakeScreenShot
{

    @Override
    public void findElement(String elementName) {
        System.out.println("Element name: " + elementName);
    }

    @Override
    public void findElements(String[] elementNames) {
        System.out.println(Arrays.toString(elementNames));
    }

    @Override
    public void getText() {
        System.out.println("getText");
    }

    @Override
    public void getTitle() {
        System.out.println("getTitle");
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    public void doubleClick()
    {
        System.out.println("doubleClick");
    }

    @Override
    public void javaScriptWebElements() {
        System.out.println("javaScriptWebElements");
    }

    @Override
    public void takePicture() {
        System.out.println("takePicture");
    }
}
