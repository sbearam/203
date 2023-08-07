import java.util.ArrayList;
import java.util.Random;

public class Order extends Object implements OrderInterface, Comparable<Order>
{
	int oT;
	Day oD;
	Customer c;
	final int MAX_ORDER_NO = 90000;
	final int MIN_ORDER_NO = 10000;
	int orderNo = 0;
	public ArrayList<Beverage> b = new ArrayList<Beverage>();
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.oT = orderTime;
		this.oD = orderDay;
		c = cust;
	}
	
	public int generateOrder()
	{
		Random r = new Random();
		int oN = r.nextInt(MAX_ORDER_NO - MIN_ORDER_NO + 1) + MIN_ORDER_NO;
		orderNo = oN;
		return oN;
	}
	
	public int getOrderNo()
	{
		return orderNo;
	}
	
	public int getOrderTime()
	{
		return this.oT;
	}
	
	public Day getOrderDay()
	{
		return this.oD;
	}
	
	public Customer getCustomer()
	{
		return new Customer(c.getName(), c.getAge());
	}
	
	public Day getDay()
	{
		return this.oD;
	}
	
	public boolean isWeekend()
	{
		return this.oD == Day.SATURDAY || this.oD == Day.SUNDAY;		
	}
	
	public Beverage getBeverage(int itemNo)
	{
		return b.get(itemNo);
	}
	
	public int getTotalItems()
	{
		return b.size();
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		Coffee cF = new Coffee(bevName, size, extraShot, extraSyrup);
		b.add(cF);
	}
	
	public void addNewBeverage(String bevName, Size size)
	{
		Alcohol a = new Alcohol(bevName, size, isWeekend());
		b.add(a);
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addProtein);
		b.add(s);
	}
	
	public double calcOrderTotal()
	{
		double total = 0;
		for(Beverage bev: b)
		{
			total += bev.calcPrice();
			//System.out.println(bev.calcPrice());
		}
		return total;
	}
	
	public int findNumOfBeveType(Type type)
	{
		int n = 0;
		for(Beverage bev: b)
		{
			if(bev.getType() == type)
				n++;
		}
		return n;
	}
	
	public String toString()
	{
		return "\n-----------------------------------------------\n"
				+ "Order Number: " + getOrderNo() + " Time:" + getOrderTime()
				+ " for " + c.getName()
				+ "\nItems: " + getTotalItems() + "\nTotal: $" + calcOrderTotal()
				+ "\n-----------------------------------------------";
		//return orderNo + " " + oT + " " + oD + " " + c.getName() + " " + c.getAge() + " " + b;
	}
	
	public int compareTo(Order anotherOrder)
	{
		if(getOrderNo() == anotherOrder.getOrderNo())
			return 0;
		else if(getOrderNo() > anotherOrder.getOrderNo())
			return -1;
		else
			return 1;
	}
}
