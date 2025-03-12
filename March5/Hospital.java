class Hospital{
public static void checkup(String patientname,int age,long L1,String email,String sickness)
{
System.out.println("Running checkup in Hospital");
System.out.println(patientname);
System.out.println(age);
System.out.println(L1);
System.out.println(email);
System.out.println(sickness);
Doctor.treatment(patientname,age);
}
}