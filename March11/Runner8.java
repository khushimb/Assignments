class Runner8 {
public static void main(String[] args)
{
Earth earth1 = new Earth();
Earth earth2 = new Earth();
Earth earth3 = new Earth();
Earth earth4 = new Earth();
Earth earth5 = new Earth();

        earth1.continent = "Asia"; earth1.ocean = "Pacific"; earth1.population = 4600000000L; earth1.isHabitable = true;
        earth2.continent = "Europe"; earth2.ocean = "Atlantic"; earth2.population = 747000000L; earth2.isHabitable = true;
        earth3.continent = "Africa"; earth3.ocean = "Indian"; earth3.population = 1340000000L; earth3.isHabitable = true;
        earth4.continent = "North America"; earth4.ocean = "Arctic"; earth4.population = 592000000L; earth4.isHabitable = true;
        earth5.continent = "Antarctica"; earth5.ocean = "Southern"; earth5.population = 1000L; earth5.isHabitable = false;

        System.out.println("Earth 1: " + earth1.continent + ", Ocean: " + earth1.ocean + ", Population: " + earth1.population + ", Habitable: " + earth1.isHabitable);
        System.out.println("Earth 2: " + earth2.continent + ", Ocean: " + earth2.ocean + ", Population: " + earth2.population + ", Habitable: " + earth2.isHabitable);
        System.out.println("Earth 3: " + earth3.continent + ", Ocean: " + earth3.ocean + ", Population: " + earth3.population + ", Habitable: " + earth3.isHabitable);
        System.out.println("Earth 4: " + earth4.continent + ", Ocean: " + earth4.ocean + ", Population: " + earth4.population + ", Habitable: " + earth4.isHabitable);
        System.out.println("Earth 5: " + earth5.continent + ", Ocean: " + earth5.ocean + ", Population: " + earth5.population + ", Habitable: " + earth5.isHabitable);
       
}
}