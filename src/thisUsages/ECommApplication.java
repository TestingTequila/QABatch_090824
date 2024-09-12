package thisUsages;

public class ECommApplication
{
//    public  ECommApplication login()
//    {
//        System.out.println("Login to application....");
//        return new ECommApplication();
//    }

    //Above method will generate a new object, this type of method creation is not appreciated.

    public  ECommApplication login()
    {
        System.out.println("Login to application....");
        return new ECommApplication();
    }


    public ECommApplication login (String un, String pw)
    {
        System.out.println("Login into application using " + un +" / "+ pw);
        return this;
    }

    public  ECommApplication doSearch(String productName)
    {
        System.out.println("Searching the " + productName);
        return this;
    }

    public  ECommApplication doSearch(String productName, double price)
    {
        System.out.println("Searching the " + productName + " and Pricing as " + price);
        return this;
    }

    public  ECommApplication doSearch(String productName, String brand)
    {
        System.out.println("Searching the " + productName + " and brand as " + brand);
        return this;
    }

    public ECommApplication addToCart(String productName)
    {
        System.out.println("Adding " + productName + " into the cart...");
        return this;
    }

    public  ECommApplication saveForLater(String productName)
    {
        System.out.println("Saving " + productName + " to buy later...");
        return this;
    }


    public  ECommApplication makePayment(int ccDetails, int cvv)
    {
        System.out.println("Making payment using the credit card with number as : " + ccDetails + " and CVV as " + cvv);
        return this;
    }

    public  ECommApplication makePayment(String payPalId)
    {
        System.out.println("Making payment using the Paypal with Id as : " +payPalId);
        return this;
    }

    public  ECommApplication generateOrderId(int orderId)
    {
        System.out.println("This will generate the order id as : " + orderId);
        return this;
    }

    public ECommApplication logout()
    {
        System.out.println("Logout from the application....");
        return this;
    }
}
