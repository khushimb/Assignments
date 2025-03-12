class Bitcoin
{
public static void value1()
{
	System.out.println("Running value1 in Bitcoin");
}
public static void value2()
{
	System.out.println("Running value2 in Bitcoin");
	
}public static void value3()
{
	value1();
	value2();
	System.out.println("Running value3 in Bitcoin");
}public static void value4()
{
	System.out.println("Running value4 in Bitcoin");
	
}
}