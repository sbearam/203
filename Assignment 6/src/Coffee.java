
public class Coffee extends Beverage
{
	String bevN = "";
	Size s;
	boolean extraSh;
	boolean extraS;
	final double EXTRA = 0.50; 
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.bevN = bevName;
		this.s = size;
		this.extraSh = extraShot;
		this.extraS = extraSyrup;
	}
	
	public boolean getExtraShot()
	{
		return extraSh;
	}
	
	public boolean getExtraSyrup()
	{
		return extraS;
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += super.addSizePrice(); //+ super.getBasePrice();
		if(getExtraShot())
			total += EXTRA;
		if(getExtraSyrup())
			total += EXTRA;
		return total;
	}
	
	public String toString()
	{
		return this.bevN + " " + this.s + " " + this.extraSh + " " + this.extraS + " " + calcPrice();
	}
	
	public boolean equals(Object anotherBev)
	{
		Coffee c = (Coffee) anotherBev;
		return super.equals(anotherBev) && this.extraS == c.extraS && this.extraSh == c.extraSh;
				
	}
}
