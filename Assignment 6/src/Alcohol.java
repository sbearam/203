
public class Alcohol extends Beverage
{
	String bevName = "";
	Size size;
	boolean iW;
	final double WEEKEND = 0.60;
	
	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL, size);
		this.bevName = bevName;
		this.size = size;
		this.iW = isWeekend;
	}
	
	public boolean isWeekend()
	{
		return this.iW;
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += super.addSizePrice(); //+ super.getBasePrice();
		if(isWeekend())
			total += WEEKEND;
		return total;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size + " " + isWeekend() + " " + calcPrice();
	}
	
	public boolean equals(Object anotherBev)
	{
		Alcohol a = (Alcohol)anotherBev;
		return super.equals(anotherBev) && this.iW == a.iW;
	}
}
