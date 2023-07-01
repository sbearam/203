import java.io.*;

public class Patient 
{
	private String fName, lName, mName, address, city, state, number, eName, eNum, zip;
	
	Patient()
	{
		fName = zip = lName = mName = address = city = state = number = eName = eNum = null;
	}
	
	Patient(String fname, String lname, String mname, String Address, String City, String State, String Zip, String Number, String ename, String Enum)
	{
		fName = fname;
		lName = lname;
		mName = mname;
		address = Address;
		city = City;
		state = State;
		zip = Zip;
		number = Number;
		eName = ename;
		eNum = Enum;
	}
	
	public void setfName(String name)
	{
		fName = name;
	}
	
	public String getfName()
	{
		return fName;
	}
	
	public void setlName(String name)
	{
		lName = name;
	}
	
	public String getlName()
	{
		return lName;
	}
	
	public void setmName(String name)
	{
		mName = name;
	}
	
	public String getmName()
	{
		return mName;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setCity(String c)
	{
		city = c;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setState(String s)
	{
		state = s;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setZip(String z)
	{
		zip = z;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public void setNum(String n)
	{
		number = n;
	}
	
	public String getNum()
	{
		return number;
	}
	
	public void setEnum(String e)
	{
		eNum = e;
	}
	
	public String getEnum()
	{
		return eNum;
	}
	
	public void setEname(String e)
	{
		eName = e;
	}
	
	public String getEname()
	{
		return eName;
	}
	
}
