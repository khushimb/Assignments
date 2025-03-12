class Runner9 {
public static void main(String[] args)
{
Bullet bullet1 = new Bullet();
        Bullet bullet2 = new Bullet();
        Bullet bullet3 = new Bullet();
        Bullet bullet4 = new Bullet();
        Bullet bullet5 = new Bullet();

        bullet1.type = "9mm"; bullet1.weight = 7.5; bullet1.speed = 350; bullet1.explosive = false;
        bullet2.type = "5.56mm"; bullet2.weight = 4.0; bullet2.speed = 950; bullet2.explosive = false;
        bullet3.type = "7.62mm"; bullet3.weight = 10.0; bullet3.speed = 830; bullet3.explosive = true;
        bullet4.type = "12.7mm"; bullet4.weight = 43.0; bullet4.speed = 900; bullet4.explosive = true;
        bullet5.type = "Shotgun Shell"; bullet5.weight = 24.0; bullet5.speed = 400; bullet5.explosive = false;

        System.out.println("Bullet 1: " + bullet1.type + ", Weight: " + bullet1.weight + "g, Speed: " + bullet1.speed + "m/s, Explosive: " + bullet1.explosive);
        System.out.println("Bullet 2: " + bullet2.type + ", Weight: " + bullet2.weight + "g, Speed: " + bullet2.speed + "m/s, Explosive: " + bullet2.explosive);
        System.out.println("Bullet 3: " + bullet3.type + ", Weight: " + bullet3.weight + "g, Speed: " + bullet3.speed + "m/s, Explosive: " + bullet3.explosive);
        System.out.println("Bullet 4: " + bullet4.type + ", Weight: " + bullet4.weight + "g, Speed: " + bullet4.speed + "m/s, Explosive: " + bullet4.explosive);
        System.out.println("Bullet 5: " + bullet5.type + ", Weight: " + bullet5.weight + "g, Speed: " + bullet5.speed + "m/s, Explosive: " + bullet5.explosive);
		}
		}