class Currency
{
public static void coin()
{
	System.out.println("Running coin in Currency");
}
public static void note()
{
	System.out.println("Running note in Currency");
	
}public static void dollar()
{
	coin();
	note();
	System.out.println("Running dollar in Currency");
}public static void money()
{
	System.out.println("Running money in Currency");
	
}
}