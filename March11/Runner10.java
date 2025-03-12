class Runner10 {
public static void main(String[] args)
{
Flag flag1 = new Flag();
        Flag flag2 = new Flag();
        Flag flag3 = new Flag();
        Flag flag4 = new Flag();
        Flag flag5 = new Flag();

        flag1.country = "USA"; flag1.color = "Red, White, Blue"; flag1.height = 5; flag1.symbol = "Stars & Stripes";
        flag2.country = "India"; flag2.color = "Saffron, White, Green"; flag2.height = 6; flag2.symbol = "Ashoka Chakra";
        flag3.country = "Japan"; flag3.color = "White, Red"; flag3.height = 4; flag3.symbol = "Red Circle";
        flag4.country = "Germany"; flag4.color = "Black, Red, Yellow"; flag4.height = 7; flag4.symbol = "Horizontal Stripes";
        flag5.country = "Brazil"; flag5.color = "Green, Yellow, Blue"; flag5.height = 8; flag5.symbol = "Globe & Stars";

        System.out.println("Flag 1: " + flag1.country + ", Color: " + flag1.color + ", Height: " + flag1.height + "m, Symbol: " + flag1.symbol);
        System.out.println("Flag 2: " + flag2.country + ", Color: " + flag2.color + ", Height: " + flag2.height + "m, Symbol: " + flag2.symbol);
        System.out.println("Flag 3: " + flag3.country + ", Color: " + flag3.color + ", Height: " + flag3.height + "m, Symbol: " + flag3.symbol);
        System.out.println("Flag 4: " + flag4.country + ", Color: " + flag4.color + ", Height: " + flag4.height + "m, Symbol: " + flag4.symbol);
        System.out.println("Flag 5: " + flag5.country + ", Color: " + flag5.color + ", Height: " + flag5.height + "m, Symbol: " + flag5.symbol);
}
}