import java.util.ArrayList;

public class BevShop extends Object implements BevShopInterface
{
	public ArrayList<Order> orders;
	int aD, index;
	final int MIN_AGE_FOR_ALCOHOL = 21;  //Minimum age for offering alcohol drink
	final int MAX_ORDER_FOR_ALCOHOL= 3;   /*Maximum number of alcohol beverages									that can be ordered within an order  */
	final int MIN_TIME= 8;				//earliest time for the order
	final int MAX_TIME= 23;				//latest  time for the order
	final int MAX_FRUIT = 5;
	
	public BevShop()
	{
		aD = 0;
		index = -1;
		orders = new ArrayList<Order>();
	}
	
	public boolean isValidTime(int time)
	{
		if(time >= 8 && time <= 23)
			return true;
		else
			return false;
	}
	
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits)
	{
		if(numOfFruits > MAX_FRUIT)
			return true;
		else
			return false;
	}
	
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore()
	{
		if(aD >= MAX_ORDER_FOR_ALCOHOL)
			return true;
		else
			return false;
	}
	
	public int getNumOfAlcoholDrink()
	{
		return aD;
	}
	
	public boolean isValidAge(int age)
	{
		if(age >= MIN_AGE_FOR_ALCOHOL)
			return true;
		else
			return false;
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		Order o = new Order(time, day, new Customer(customerName, customerAge));
		o.generateOrder();
		orders.add(o);
		index++;
		aD = 0;
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		orders.get(index).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName, Size size)
	{
		orders.get(index).addNewBeverage(bevName, size);
		aD++;
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		orders.get(index).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public int findOrder(int orderNo)
	{
		int i = 0;
		for(Order o: orders)
		{
			if(o.getOrderNo() == orderNo)
				i = orders.indexOf(o);
		}
		return i;
	}
	
	public double totalOrderPrice(int orderNo)
	{
		double t = 0;
		for(Order o: orders)
		{
			if(o.getOrderNo() == orderNo)
				t = o.calcOrderTotal();
		}
		return t;
	}
	
	public double totalMonthlySale()
	{
		double t = 0;
		for(Order o: orders)
		{
			t += o.calcOrderTotal();
			//System.out.println(o.calcOrderTotal());
		}
		return t;
	}
	
	public int totalNumOfMonthlyOrders()
	{
		return index + 1;
	}
	
	public Order getCurrentOrder()
	{
		return orders.get(index);
	}
	
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}
	
	public void sortOrders()
	{
		Order tempO;
		int minIndex, minValue, start, index;
		for (start = 0; start < (orders.size() - 1); start++)
		{ 
			Order o = orders.get(start);
			minIndex = start; 
			minValue = o.getOrderNo(); 
			for (index = start + 1; index < orders.size(); index++) 
			{ 
				Order oD = orders.get(index);
				if (oD.getOrderNo() < minValue) 
				{ 
				minValue = oD.getOrderNo(); 
				minIndex = index; 
				} 
			} 
		tempO = orders.get(minIndex);
		orders.add(minIndex, orders.get(start));
		orders.add(start,tempO);
		}
	}
	
	public String toString()
	{
		return orders.toString() + " \n Total Sale: " + totalMonthlySale();
	}
}
