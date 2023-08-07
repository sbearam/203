import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class OrderTestStudent {
	Order o;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		Customer c = new Customer("Shawn", 17);
		o = new Order(11, Day.SUNDAY, c);
		o.generateOrder();
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		o = null;
	}

	@Test
	void testGetOrderTime() 
	{
		assertEquals(11, o.getOrderTime());
	}
	
	@Test
	void testAddNewBeverage() 
	{
		o.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertTrue(o.getBeverage(0).getType().equals(Type.COFFEE));
		o.addNewBeverage("Mohito", Size.SMALL);
		assertTrue(o.getBeverage(1).getType().equals(Type.ALCOHOL));
		assertTrue(o.getTotalItems() == 2);
	}
	
	@Test
	void testCalcOrderTotal() 
	{
		o.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		o.addNewBeverage("Mohito", Size.SMALL);
		assertEquals(4.6, o.calcOrderTotal());
	}
	
	
	@Test
	void testFindNumOfBeveType()
	{
		o.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		o.addNewBeverage("Mohito", Size.SMALL);
		o.addNewBeverage("Mohito", Size.SMALL);
		assertEquals(2, o.findNumOfBeveType(Type.ALCOHOL));
		assertEquals(1, o.findNumOfBeveType(Type.COFFEE));	
	}
	
	@Test
	void testCompareTo()
	{
//		Customer c1 = new Customer("Shawn", 17);
//		Order o1 = new Order(11, Day.SUNDAY, c1);
		assertEquals(0, o.compareTo(o));
	}
}
