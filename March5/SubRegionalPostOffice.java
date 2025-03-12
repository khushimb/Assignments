class SubRegionalPostOffice{
public static void deliver1(String customername,String address)
{
System.out.println("Running deliver1 in SubRegionalPostOffice");

RegionalPostOffice.deliver(customername,address);
}
}