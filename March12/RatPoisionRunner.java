class RatPoisionRunner
{

public static void main(String[] args)
{
RatPoision rat = new RatPoision(2,"hit","liquid");
System.out.println("RatPoision times: "+rat.times +",RatPoision brand :"+ rat.brand +",RatPoision state :"+rat.state);

RatPoision rat1 = new RatPoision(3,"hit","solid");
System.out.println("RatPoision times: "+rat1.times +",RatPoision brand :"+ rat1.brand +",RatPoision state :"+rat1.state);

RatPoision rat2 = new RatPoision(5,"hit","gas");
System.out.println("RatPoision times: "+rat2.times +",RatPoision brand :"+ rat2.brand +",RatPoision state :"+rat2.state);

RatPoision rat3 = new RatPoision(7,"hit","liquid");
System.out.println("RatPoision times: "+rat3.times +",RatPoision brand :"+ rat3.brand +",RatPoision state :"+rat3.state);

RatPoision rat4 = new RatPoision(8,"hit","gas");
System.out.println("RatPoision times: "+rat4.times +",RatPoision brand :"+ rat4.brand +",RatPoision state :"+rat4.state);


}
}