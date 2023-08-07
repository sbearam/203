
public class Smoothie extends Beverage
{
	String bevName = "";
	Size size;
	int numF = 0;
	boolean aP;
	final double PROTEIN = 1.50;
	final double FRUIT = 0.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.bevName = bevName;
		this.size = size;
		this.numF = numOfFruits;
		this.aP = addProtein;
	}
	
	public int getNumOfFruits()
	{
		return this.numF;
	}
	
	public boolean getAddProtein()
	{
		return this.aP;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size + " " + this.aP + " " + this.numF + " " + calcPrice();
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += super.addSizePrice(); //+ super.getBasePrice();
		if(getAddProtein())
			total += PROTEIN;
		total += getNumOfFruits() * FRUIT;
		return total;
	}
	
	public boolean equals(Object anotherBev)
	{
		Smoothie s = (Smoothie) anotherBev;
		return super.equals(anotherBev) && this.aP == s.aP && this.numF == s.numF;
	}
}
