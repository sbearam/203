import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class CoffeeTestStudent {
	Coffee c, c1;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		c = new Coffee("Frappe", Size.MEDIUM, true, false);
		c1 = new Coffee("Dark", Size.SMALL, false, true);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		c = c1 = null;
	}

	@Test
	void testgetExtraShot() 
	{
		assertTrue(c.getExtraShot());
		assertFalse(c1.getExtraShot());
	}
	
	void testgetExtraSyrup() 
	{
		assertFalse(c.getExtraSyrup());
		assertTrue(c1.getExtraSyrup());
	}
	
	@Test
	void testCalcPrice()
	{
		assertEquals(3.5, c.calcPrice());
		assertEquals(2.5, c1.calcPrice());
	}
	
	@Test
	void testtoString()
	{
		assertEquals("Frappe MEDIUM true false 3.5", c.toString());
		assertEquals("Dark SMALL false true 2.5", c1.toString());
	}
	
	@Test
	void testEquals()
	{
		Coffee c2 = new Coffee("Frappe", Size.MEDIUM, true, false);
		assertTrue(c.equals(c2));
	}
}
