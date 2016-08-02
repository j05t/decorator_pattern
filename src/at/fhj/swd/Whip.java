package at.fhj.swd;

/*
 * Whip is a decorator, so we exend CondimentDecorator
 * (CondimentDecorator extends Beverage)
 */

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	/*
	 * We want our description not only to include the beverage, but also to
	 * include each item decorating the beverage. So, we first delegate to the
	 * object we are decorating to get its description, then append ", Mocha" to
	 * that description.
	 */
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	/*
	 * Now we need to compute the cost of our beverage. First we delegate the
	 * call to the object we're decorating so that it can compute the cost, then
	 * we add the cost of Whip to the result.
	 */
	public double cost() {
		return .10 + beverage.cost();
	}

}