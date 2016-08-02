package at.fhj.swd;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		/*
		 * Order an espresso, no condiments and print
		 * its description and price.
		 */
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		
		Beverage beverage2 = new DarkRoast();	// make a DarkRoast object
		beverage2 = new Mocha(beverage2);		// wrap it with a Mocha
		beverage2 = new Mocha(beverage2);		// Wrap it in a second Mocha
		beverage2 = new Whip(beverage2);		// Wrap it in a Whip

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		
		/*
		 * Finally, give us a HouseBlend
		 * with Soy, Mocha and Whip.
		 */
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
