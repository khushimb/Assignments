class Runner11{
public static void main(String[] args)
{
 Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate();
        Chocolate chocolate3 = new Chocolate();
        Chocolate chocolate4 = new Chocolate();
        Chocolate chocolate5 = new Chocolate();

        chocolate1.brand = "Cadbury"; chocolate1.type = "Milk Chocolate"; chocolate1.weight = 100; chocolate1.sweet = true;
        chocolate2.brand = "Lindt"; chocolate2.type = "Dark Chocolate"; chocolate2.weight = 150; chocolate2.sweet = false;
        chocolate3.brand = "Hershey's"; chocolate3.type = "White Chocolate"; chocolate3.weight = 120; chocolate3.sweet = true;
        chocolate4.brand = "Ferrero Rocher"; chocolate4.type = "Hazelnut Chocolate"; chocolate4.weight = 200; chocolate4.sweet = true;
        chocolate5.brand = "Toblerone"; chocolate5.type = "Swiss Chocolate"; chocolate5.weight = 250; chocolate5.sweet = true;

        System.out.println("Chocolate 1: " + chocolate1.brand + ", Type: " + chocolate1.type + ", Weight: " + chocolate1.weight + "g, Sweet: " + chocolate1.sweet);
        System.out.println("Chocolate 2: " + chocolate2.brand + ", Type: " + chocolate2.type + ", Weight: " + chocolate2.weight + "g, Sweet: " + chocolate2.sweet);
        System.out.println("Chocolate 3: " + chocolate3.brand + ", Type: " + chocolate3.type + ", Weight: " + chocolate3.weight + "g, Sweet: " + chocolate3.sweet);
        System.out.println("Chocolate 4: " + chocolate4.brand + ", Type: " + chocolate4.type + ", Weight: " + chocolate4.weight + "g, Sweet: " + chocolate4.sweet);
        System.out.println("Chocolate 5: " + chocolate5.brand + ", Type: " + chocolate5.type + ", Weight: " + chocolate5.weight + "g, Sweet: " + chocolate5.sweet);
		}
		}