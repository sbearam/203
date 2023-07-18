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

public class ManagementCompany extends Object
{
	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	Property[] properties;
	Plot p;
	int numberOfProperties = 0;
	String name, taxID;
	double mgmFee;
	
	public ManagementCompany()
	{
		name = taxID = "";
		mgmFee = 0;
		properties = new Property[MAX_PROPERTY];
		p = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		p = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		p = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFee = otherCompany.getMgmFeePer();
		p = otherCompany.getPlot();
		properties = otherCompany.getProperties();
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		Property pO = new Property(name, city, rent, owner);
		if(numberOfProperties == MAX_PROPERTY)
			return -1;
		if(pO == null)
			return -2;
		if(!p.encompasses(pO.getPlot()))
			return -3;
		for(Property r: properties)
		{
			if(r == null)
				continue;
			if(r.getPlot().overlaps(pO.getPlot()))
				return -4;
		}
		properties[numberOfProperties] = pO;
		numberOfProperties++;
		return (numberOfProperties - 1);
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		Property pO = new Property(name, city, rent, owner, x, y, width, depth);
		if(numberOfProperties == MAX_PROPERTY)
			return -1;
		if(pO == null)
			return -2;
		if(!p.encompasses(pO.getPlot()))
			return -3;
		for(Property r: properties)
		{
			if(r == null)
				continue;
			if(r.getPlot().overlaps(pO.getPlot()))
				return -4;
		}
		properties[numberOfProperties] = pO;
		numberOfProperties++;
		return (numberOfProperties - 1);
	}
	
	public int addProperty(Property property)
	{
		Property pO = new Property(property);
		if(numberOfProperties == MAX_PROPERTY)
			return -1;
		if(property == null)
			return -2;
		if(!p.encompasses(pO.getPlot()))
			return -3;
		for(Property r: properties)
		{
			if(r == null)
				continue;
			if(r.getPlot().overlaps(pO.getPlot()))
				return -4;
		}
		properties[numberOfProperties] = pO;
		numberOfProperties++;
		return (numberOfProperties - 1);
	}
	
	public void removeLastProperty()
	{
		properties[numberOfProperties - 1] = null;
		numberOfProperties--;
	}
	
	public boolean isPropertiesFull()
	{
		if(numberOfProperties == MAX_PROPERTY)
			return true;
		else
			return false;
	}
	
	public int getPropertiesCount()
	{
		return this.numberOfProperties;
	}
	
	public double getTotalRent()
	{
		double tR = 0;
		for(Property pO: properties)
		{
			tR += pO.getRentAmount();
		}
		return tR;
	}
	
	public Property getHighestRentProperty()
	{
		Property hR = new Property();
		for(Property pO: properties)
		{
			if(pO.getRentAmount() > hR.getRentAmount())
				hR = pO;
		}
		return hR;
	}
	
	public boolean isManagementFeeValid()
	{
		if(mgmFee >= 0 && mgmFee <= 100)
		{
			return true;
		}
		return false;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getTaxID()
	{
		return this.taxID;
	}
	
	public Property[] getProperties()
	{
		return this.properties;
	}
	
	public double getMgmFeePer()
	{
		return this.mgmFee;
	}
	
	public Plot getPlot()
	{
		return this.p;
	}
	
	public String toString()
	{
		String s = "";
		for(Property pO: properties)
		{
			if(pO == null)
				continue;
			s += "Property Name: " + pO.getPropertyName() + "\nLocated in: " + pO.getCity() + "\nBelongs to: " + pO.getOwner() + "\nRent Amount: " + pO.getRentAmount()+ "\n";
		}
		return "List of the properties for " + name + ", taxID: " + taxID
		        + "\n_____________________________________________\n"
		        + s +  "\n_____________________________________________\n"
		        + "\ntotal management Fee: " + this.mgmFee;
	}
	
	
}
