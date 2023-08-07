import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class BevShopTestStudent {
	BevShop b;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		b = new BevShop();
		b.startNewOrder(7, Day.SUNDAY, "Shawn", 21);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		b = null;
	}

	@Test
	void testProcessCoffeeOrder() 
	{
		Coffee cf = new Coffee("Frappe", Size.MEDIUM, true, false);
		b.processCoffeeOrder("Frappe", Size.MEDIUM, true, false);
		assertEquals(cf, b.orders.get(0).getBeverage(0));
	}
	
	@Test
	void testProcessAlcoholOrder() 
	{
		Alcohol a = new Alcohol("Beer", Size.MEDIUM, true);
		b.processAlcoholOrder("Beer", Size.MEDIUM);
		assertEquals(a, b.orders.get(0).getBeverage(0));
	}
	
	@Test
	void testProcessSmoothieOrder() 
	{
		Smoothie sm = new Smoothie("Banana", Size.MEDIUM, 5, false);
		b.processSmoothieOrder("Banana", Size.MEDIUM, 5, false);
		assertEquals(sm, b.orders.get(0).getBeverage(0));
	}
	
	
	@Test
	void testTotalOrderPrice()
	{
		b.processAlcoholOrder("Beer", Size.MEDIUM);
		b.processSmoothieOrder("Banana", Size.MEDIUM, 5, false);
		b.processCoffeeOrder("Frappe", Size.MEDIUM, true, false);
		assertEquals(12.6, b.totalOrderPrice(b.orders.get(0).getOrderNo()), .01);
	}
	
	@Test
	void testTotalMonthlySale()
	{
		b.processAlcoholOrder("Beer", Size.MEDIUM);
		b.processSmoothieOrder("Banana", Size.MEDIUM, 5, false);
		b.processCoffeeOrder("Frappe", Size.MEDIUM, true, false);
		
		b.startNewOrder(8, Day.SUNDAY, "James", 21);
		b.processAlcoholOrder("Beer", Size.MEDIUM);
		b.processSmoothieOrder("Banana", Size.MEDIUM, 5, false);
		
		assertEquals(21.7, b.totalMonthlySale(), .01);
	}
}
