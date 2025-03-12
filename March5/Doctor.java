class Doctor{
public static void treatment(String patientname,String customer,int age)
{
System.out.println("Running treatment in Doctor");
System.out.println(patientname);
System.out.println(age);
Nurse.assist(customer);

}
}