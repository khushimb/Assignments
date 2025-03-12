class Runner6
{
public static void main(String[] args)
{
  Bottle bottle1 = new Bottle();
  Bottle bottle2 = new Bottle();
  Bottle bottle3 = new Bottle();
  Bottle bottle4 = new Bottle();
  Bottle bottle5 = new Bottle();

 bottle1.material = "Plastic"; bottle1.volume = 1.0; bottle1.color = "Black"; bottle1.insulated = false;
 bottle2.material = "Glass"; bottle2.volume = 0.5; bottle2.color = "Blue"; bottle2.insulated = true;
 bottle3.material = "Metal"; bottle3.volume = 2.0; bottle3.color = "Silver"; bottle3.insulated = true;
 bottle4.material = "Plastic"; bottle4.volume = 1.5; bottle4.color = "Red"; bottle4.insulated = false;
 bottle5.material = "Steel"; bottle5.volume = 1.2; bottle5.color = "Green"; bottle5.insulated = true;

        System.out.println("Bottle 1: " + bottle1.material + ", " + bottle1.volume + "L, " + bottle1.color + ", Insulated: " + bottle1.insulated);
        System.out.println("Bottle 2: " + bottle2.material + ", " + bottle2.volume + "L, " + bottle2.color + ", Insulated: " + bottle2.insulated);
        System.out.println("Bottle 3: " + bottle3.material + ", " + bottle3.volume + "L, " + bottle3.color + ", Insulated: " + bottle3.insulated);
        System.out.println("Bottle 4: " + bottle4.material + ", " + bottle4.volume + "L, " + bottle4.color + ", Insulated: " + bottle4.insulated);
        System.out.println("Bottle 5: " + bottle5.material + ", " + bottle5.volume + "L, " + bottle5.color + ", Insulated: " + bottle5.insulated);
       
}
}
