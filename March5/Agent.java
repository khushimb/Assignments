class Agent{
public static void purchase(String vegetable,int quantity)
{
System.out.println("Running purchase in Agent");
System.out.println(vegetable);
System.out.println(quantity);
Broker.brokerage(vegetable,quantity);
}
}