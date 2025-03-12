class Lipstick
{
public static void apply()
{
	System.out.println("Running apply in Lipstick");
}
public static void smell()
{
	System.out.println("Running smell in Lipstick");
}public static void color()
{
	apply();
	smell();
	System.out.println("Running color in Lipstick");
}public static void remove()
{
	System.out.println("Running brand in Lipstick");
}
}