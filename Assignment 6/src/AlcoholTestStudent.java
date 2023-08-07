import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class AlcoholTestStudent {
	Alcohol a, a1;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		a = new Alcohol("Beer", Size.MEDIUM, true);
		a1 = new Alcohol("Vodka", Size.SMALL, false);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		a = a1 = null;
	}

	@Test
	void testWeekend() 
	{
		assertTrue(a.isWeekend());
		assertFalse(a1.isWeekend());
	}
	
	@Test
	void testCalcPrice()
	{
		assertEquals(3.6, a.calcPrice());
		assertEquals(2.0, a1.calcPrice());
	}
	
	@Test
	void testtoString()
	{
		assertEquals("Beer MEDIUM true 3.6", a.toString());
		assertEquals("Vodka SMALL false 2.0", a1.toString());
	}
	
	@Test
	void testEquals()
	{
		assertFalse(a.equals(a1));
	}
}
