
public abstract class Beverage extends Object
{
	String bevN = "";
	Type t;
	Size s;
	final double BASE_PRICE = 2.0;
	final double SIZE_PRICE = 1.0;
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevN = bevName;
		this.t = type;
		this.s = size;
	}
	
	public double getBasePrice()
	{
		return BASE_PRICE;
	}
	
	public Type getType()
	{
		return this.t;
	}
	
	public String getBevName()
	{
		return this.bevN;
	}
	
	public Size getSize()
	{
		return this.s;
	}
	
	public double addSizePrice()
	{
		if(this.s == Size.SMALL)
		{
			return BASE_PRICE;
		}
		else if(this.s == Size.MEDIUM)
		{
			return BASE_PRICE + SIZE_PRICE;
		}
		else
			return BASE_PRICE + SIZE_PRICE*2;
	}
	
	public String toString()
	{
		return this.bevN + " " + this.s;
	}
	
	public boolean equals(Object anotherBev)
	{
		Beverage b = (Beverage) anotherBev;
		if(this.bevN == b.bevN && this.t == b.t && this.s == b.s)
			return true;
		else
			return false;
	}
	
	public abstract double calcPrice();
}
