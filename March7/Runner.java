class Runner{
	public static void main(String[] args){
		String[] emails = {"khushi@gmail.com","asha@gmail.com","bhuvanesh@gmail.com"};
		March7.printEmail(emails);
		System.out.println("==================================================================================");
		String[] countries = {"India","Germany","Australia","USA"};
		March7.printCountries(countries);
		System.out.println("==================================================================================");
		char[] aplhabets = {'z','a','d','u','f','x','y'};
		March7.printAlphabets(aplhabets);
		System.out.println("==================================================================================");
		String ingredients = March7.getIngredients(args[0]);
		System.out.println("Ingredients of "+args[0]+" Food Item are : "+ingredients);
		
	}
}