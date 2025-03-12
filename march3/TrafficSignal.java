class TrafficSignal
{
public static void green()
{
	System.out.println("Running green in TrafficSignal");
}
public static void yellow()
{
	System.out.println("Running yellow in TrafficSignal");
	
}public static void red()
{
	green();
	yellow();
	System.out.println("Running red in TrafficSignal");
}public static void light()
{
	System.out.println("Running light in TrafficSignal");
}
}