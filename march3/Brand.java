class Brand
{
public static void gucci()
{
	System.out.println("Running gucci in Brand");
}
public static void coach()
{
	System.out.println("Running coach in Brand");
	
}public static void hermes()
{
	System.out.println("Running hermes in Brand");
}public static void rolex()
{
	gucci();
	coach();
	System.out.println("Running rolex in Brand");
	
}
}