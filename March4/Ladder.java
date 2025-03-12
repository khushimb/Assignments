class Ladder{
public static void climb(int meter)
{
System.out.println("Running climb in Ladder");
System.out.println(meter);
}
public static void cut(int depth)
{
System.out.println("Running cut in Ladder");
System.out.println(depth);
}
public static void count(int numb)
{
System.out.println("Running count in Ladder");
System.out.println(numb);
}
public static void close(int a ,int b)
{
System.out.println("Running close in Ladder");
System.out.println(a + "" + b);
}
public static void open(String owner,String landLord)
{
System.out.println("Running open in Ladder");
System.out.println(owner + "" + landLord);

}
public static void stepDown(char h,int length,int width)
{
System.out.println("Running white in Ladder");
System.out.println(h + "" + length + "" + width);

}
public static void stepUp(int age,int e,int xyz)
{
System.out.println("Running black in Ladder");
System.out.println(age + "" + e + "" + xyz);
System.out.println(e);
System.out.println(xyz);
}
}