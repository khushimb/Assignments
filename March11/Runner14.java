class Runner14{
public static void main(String[] args)
{ 
Road road1 = new Road();
        Road road2 = new Road();
        Road road3 = new Road();
        Road road4 = new Road();
        Road road5 = new Road();

        road1.type = "Highway"; road1.length = 500; road1.lanes = 6; road1.paved = true;
        road2.type = "Street"; road2.length = 5; road2.lanes = 2; road2.paved = true;
        road3.type = "Dirt Road"; road3.length = 10; road3.lanes = 1; road3.paved = false;
        road4.type = "Expressway"; road4.length = 100; road4.lanes = 4; road4.paved = true;
        road5.type = "Alley"; road5.length = 1; road5.lanes = 1; road5.paved = true;
		
		System.out.println("Road 1: Type - " + road1.type + ", Length - " + road1.length + " km, Lanes - " + road1.lanes + ", Paved - " + road1.paved);
		System.out.println("Road 2: Type - " + road2.type + ", Length - " + road2.length + " km, Lanes - " + road2.lanes + ", Paved - " + road2.paved);
		System.out.println("Road 3: Type - " + road3.type + ", Length - " + road3.length + " km, Lanes - " + road3.lanes + ", Paved - " + road3.paved);
		System.out.println("Road 4: Type - " + road4.type + ", Length - " + road4.length + " km, Lanes - " + road4.lanes + ", Paved - " + road4.paved);
		System.out.println("Road 5: Type - " + road5.type + ", Length - " + road5.length + " km, Lanes - " + road5.lanes + ", Paved - " + road5.paved);
		}
		}