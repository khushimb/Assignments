class Runner1
{
public static void main(String[] args)
{
Star star1 = new Star(); 
Star star2 = new Star(); 
Star star3 = new Star(); 
Star star4 = new Star(); 
Star star5 = new Star(); 

star1.name="sun";
star1.counts=5;
star1.shape='M';
star1.color="yellow";

System.out.println("Star1 name: "+ star1.name+  ",Star1 counts: " + star1.counts+  ",Star1 shape: " + star1.shape+  ",Star1 color: " + star1.color );    

star2.name="mars";
star2.counts=6;
star2.shape='L';
star2.color="orange";

System.out.println("Star2 name: "+ star2.name+  ",Star2 counts: " + star2.counts+  ",Star2 shape: " + star2.shape+  ",Star2 color: " + star2.color );    

star3.name="neptune";
star3.counts=8;
star3.shape='S';
star3.color="Blue";

System.out.println("Star3  name: "+ star3.name+  ",Star3 counts: " + star3.counts+  ",Star3 shape: " + star3.shape+  ",Star3 color: " + star3.color );    

star4.name="jupyter";
star4.counts=7;
star4.shape='X';
star4.color="Brown";

System.out.println("Star4  name: "+ star4.name+  ",Star4 counts: " + star4.counts+  ",Star4 shape: " + star4.shape+  ",Star4 color: " + star4.color );    

star5.name="saturn";
star5.counts=3;
star5.shape='S';
star5.color="Red";

System.out.println("Star4  name: "+ star4.name+  ",Star4 counts: " + star4.counts+  ",Star4 shape: " + star4.shape+  ",Star4 color: " + star4.color );    


}
}