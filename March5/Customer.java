class Customer{
public static void buy(String vegetable,int quantity)
{
System.out.println("Running buy in Customer");
System.out.println(vegetable);
System.out.println(quantity);
Agent.purchase(vegetable,quantity);
}
}