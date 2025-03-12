class Runner2
{
public static void main(String[] args)
{
Bag bag1 = new Bag();
Bag bag2 = new Bag();
Bag bag3 = new Bag();
Bag bag4 = new Bag();
Bag bag5 = new Bag();

bag1.brand="gucci";
bag1.zips=2;
bag1.shape='S';
bag1.quality="good";


System.out.println("bag 1 brand: "+ bag1.brand+  ",Bag 1 zips: " + bag1.zips+  ",Bag 1 shape: " + bag1.shape+  ",Bag 1 Quality: " + bag1.quality);    

bag2.brand="Lv";
bag2.zips=2;
bag2.shape='M';
bag2.quality="soft";


System.out.println("bag 2 brand: "+ bag2.brand+  ",Bag 2 zips: " + bag2.zips+  ",Bag 2 shape: " + bag2.shape+  ",Bag 2 Quality: " + bag2.quality);    

bag3.brand="coach";
bag3.zips=5;
bag4.shape='L';
bag4.quality="hard";


System.out.println("bag 3 brand: "+ bag3.brand+  ",Bag 3 zips: " + bag3.zips+  ",Bag 3 shape: " + bag3.shape+  ",Bag 3 Quality: " + bag3.quality);    

bag4.brand="MK";
bag4.zips=9;
bag4.shape='L';
bag4.quality="S";


System.out.println("bag 4 brand: "+ bag4.brand+  ",Bag 4 zips: " + bag4.zips+  ",Bag 4 shape: " + bag4.shape+  ",Bag 4 Quality: " + bag4.quality);    

bag5.brand="hermes";
bag5.zips=1;
bag5.shape='M';
bag5.quality="excellent";


System.out.println("bag 5 brand: "+ bag5.brand+  ",Bag 5 zips: " + bag5.zips+  ",Bag 5 shape: " + bag5.shape+  ",Bag 5 Quality: " + bag5.quality);    



}
}