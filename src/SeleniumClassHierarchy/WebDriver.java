package SeleniumClassHierarchy;

public interface WebDriver extends SearchContext
{
    @Override
    public void findElement(String elementName);
    @Override
    public void findElements(String[] elementNames);

    public void getText();
    public void getTitle();
    public void click();
}
