class Station
{
	public static void send(String item)
	{
		System.out.println("Running send in Station");
		System.out.println(item);
		DeliveryGuy.accept(item);
	}
}