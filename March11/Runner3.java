class Runner3
{
public static void main(String[] args)
{
Metro metro1 = new Metro();
Metro metro2 = new Metro();
Metro metro3 = new Metro();
Metro metro4 = new Metro();
Metro metro5 = new Metro();

metro1.area="jaynagar";
metro1.stops=2;
metro1.linecolor="green";
metro1.color="silver";

System.out.println("metro 1 area: "+ metro1.area+  ",metro 1 stops: " + metro1.stops+  ",Metro 1 line color: " + metro1.linecolor+  ",metro 1 color: " + metro1.color);    

metro2.area="RV road";
metro2.stops=3;
metro2.linecolor="green";
metro2.color="brown";

System.out.println("metro 2 area: "+ metro2.area+  ",metro 2 stops: " + metro2.stops+  ",Metro 2 line color: " + metro2.linecolor+  ",metro 2 color: " + metro2.color);    

metro3.area="jp nagar";
metro3.stops=5;
metro3.linecolor="green";
metro3.color="pink";

System.out.println("metro 3 area: "+ metro3.area+  ",metro 3 stops: " + metro3.stops+  ",Metro 3 line color: " + metro3.linecolor+  ",metro 3 color: " + metro3.color);    

metro1.area="rajajinagar";
metro1.stops=6;
metro1.linecolor="purple";
metro1.color="brown";

System.out.println("metro 4 area: "+ metro4.area+  ",metro 4 stops: " + metro4.stops+  ",Metro 4 line color: " + metro4.linecolor+  ",metro 4 color: " + metro4.color);    

metro1.area="majestic";
metro1.stops=8;
metro1.linecolor="purple";
metro1.color="black";

System.out.println("metro 5 area: "+ metro5.area+  ",metro 5 stops: " + metro5.stops+  ",Metro 5 line color: " + metro5.linecolor+  ",metro 5 color: " + metro5.color);    




}
}