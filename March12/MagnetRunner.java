class MagnetRunner
{

public static void main(String[] args)
{
Magnet magnet = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet.count +",Magnet direction :"+ magnet.direction +",Magnet color :"+magnet.color);

Magnet magnet1 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet1.count +",Magnet direction :"+ magnet1.direction +",Magnet color :"+magnet1.color);

Magnet magnet2 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet2.count +",Magnet direction :"+ magnet2.direction +",Magnet color :"+magnet2.color);

Magnet magnet3 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet3.count +",Magnet direction :"+ magnet3.direction +",Magnet color :"+magnet3.color);

Magnet magnet4 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet4.count +",Magnet direction :"+ magnet4.direction +",Magnet color :"+magnet4.color);


}
}