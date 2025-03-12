class Broker{
public static void brokerage(String vegetable,int quantity)
{
System.out.println("Running brokerage in Broker");
System.out.println(vegetable);
System.out.println(quantity);
Farmer.farm(vegetable,quantity);
}
}