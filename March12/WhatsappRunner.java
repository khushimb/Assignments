class WhatsappRunner
{

public static void main(String[] args)
{
Whatsapp wats = new Whatsapp(2,"papa","informal");
System.out.println("message time : "+wats.time +",Messaging person :"+ wats.person +",Message type :"+wats.type);

Whatsapp wats1 = new Whatsapp(4,"mom","informal");
System.out.println("message time : "+wats1.time +",Messaging person :"+ wats1.person +",Message type :"+wats1.type);

Whatsapp wats2 = new Whatsapp(6,"sister","formal");
System.out.println("message time : "+wats2.time +",Messaging person :"+ wats2.person +",Message type :"+wats2.type);

Whatsapp wats3 = new Whatsapp(8,"frnd","informal");
System.out.println("message time : "+wats3.time +",Messaging person :"+ wats3.person +",Message type :"+wats3.type);

Whatsapp wats4 = new Whatsapp(12,"grandpa","formal");
System.out.println("message time : "+wats4.time +",Messaging person :"+ wats4.person +",Message type :"+wats4.type);


}
}