import java.util.*;

public class Procedure 
{
	private String procedure, date, name;
	private double charge;
	
	Procedure(String p, String d, String n, double c)
	{
		procedure = p;
		date = d;
		name = n;
		charge = c;
	}
	
	public void setP(String p)
	{
		procedure = p;
	}
	
	public String getP()
	{
		return procedure;
	}
	
	public void setDate(String d)
	{
		date = d;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCharge(double c)
	{
		charge = c;
	}
	
	public double getCharge()
	{
		return charge;
	}
	
	
}
