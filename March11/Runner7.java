class Runner7
{
public static void main(String[] args)
{
Lamp lamp2 = new Lamp();
Lamp lamp3 = new Lamp();
Lamp lamp4 = new Lamp();
Lamp lamp5 = new Lamp();

lamp1.type = "LED"; lamp1.brightness = 800; lamp1.color = "White"; lamp1.isOn = true;
lamp2.type = "Incandescent"; lamp2.brightness = 600; lamp2.color = "Yellow"; lamp2.isOn = false;
lamp3.type = "Halogen"; lamp3.brightness = 1000; lamp3.color = "Warm White"; lamp3.isOn = true;
lamp4.type = "Fluorescent"; lamp4.brightness = 700; lamp4.color = "Cool White"; lamp4.isOn = false;
lamp5.type = "Smart"; lamp5.brightness = 1200; lamp5.color = "RGB"; lamp5.isOn = true;

        System.out.println("Lamp 1: " + lamp1.type + ", Brightness: " + lamp1.brightness + " lumens, Color: " + lamp1.color + ", On: " + lamp1.isOn);
        System.out.println("Lamp 2: " + lamp2.type + ", Brightness: " + lamp2.brightness + " lumens, Color: " + lamp2.color + ", On: " + lamp2.isOn);
        System.out.println("Lamp 3: " + lamp3.type + ", Brightness: " + lamp3.brightness + " lumens, Color: " + lamp3.color + ", On: " + lamp3.isOn);
        System.out.println("Lamp 4: " + lamp4.type + ", Brightness: " + lamp4.brightness + " lumens, Color: " + lamp4.color + ", On: " + lamp4.isOn);
        System.out.println("Lamp 5: " + lamp5.type + ", Brightness: " + lamp5.brightness + " lumens, Color: " + lamp5.color + ", On: " + lamp5.isOn);
}
}