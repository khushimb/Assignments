class Courier
{
	public static void pickup(String item)
	{
		System.out.println("Running pickup in courier");
		System.out.println(item);
		Station.send(item);
	}
}