class AreaPostOffice{
public static void deliver2(String customername,String address)
{
System.out.println("Running deliver2 in AreaPostOffice");

SubRegionalPostOffice.deliver1(customername,address);
}
}