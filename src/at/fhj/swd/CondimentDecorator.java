package at.fhj.swd;

/*
 * We need to be interchangeable with a Beverage,
 * so we extend the Beverage class.
 * 
 * We also require that the condiment decorators all 
 * reimplement the getDescription() method.
 */

public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
