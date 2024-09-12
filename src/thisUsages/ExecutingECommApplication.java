package thisUsages;

public class ExecutingECommApplication
{
    public static void main(String[] args) {

        ECommApplication e1 = new ECommApplication();
        e1.login().doSearch("Iphone").logout();

        System.out.println("===========================================");

        e1.login().doSearch("Samsung Chip", 1200).
                saveForLater("Samsung Chip").
                makePayment("ashish@paypal").
                generateOrderId(1234).logout();

        System.out.println("===========================================");

        e1.login("ashish1234", "test@1234").doSearch("Laptop", "HP").makePayment(21321312, 1243).logout();

    }
}
