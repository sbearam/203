/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: A program that manages a Management Company's properties and plots.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Shawn Bearam
*/
public class Property extends Object
{
	String propertyName, city, owner;
	double rentAmount;
	Plot p;
	
	public Property()
	{
		propertyName = city = owner = "";
		rentAmount = 0;
		p = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		p = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		p = new Plot(x, y, width, depth);
	}
	
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		this.p = otherProperty.getPlot();
	}
	
	public Plot getPlot()
	{
		return this.p;
	}
	
	public String getPropertyName()
	{
		return this.propertyName;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public double getRentAmount()
	{
		return this.rentAmount;
	}
	
	public String getOwner()
	{
		return this.owner;
	}
	
	public String toString()
	{
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
	}
}
