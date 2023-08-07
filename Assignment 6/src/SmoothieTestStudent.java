import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class SmoothieTestStudent {
	Smoothie s, s1;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		s = new Smoothie("Banana", Size.MEDIUM, 5, false);
		s1 = new Smoothie("Strawberry", Size.LARGE, 2 , true);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		s = s1 = null;
	}

	@Test
	void testgetNumOfFruits() 
	{
		assertEquals(5, s.getNumOfFruits());
		assertEquals(2, s1.getNumOfFruits());
	}
	
	void testgetAddProtein() 
	{
		assertFalse(s.getAddProtein());
		assertTrue(s1.getAddProtein());
	}
	
	@Test
	void testCalcPrice()
	{
		assertEquals(5.5, s.calcPrice());
		assertEquals(6.5, s1.calcPrice());
	}
	
	@Test
	void testtoString()
	{
		assertEquals("Banana MEDIUM false 5 5.5", s.toString());
		assertEquals("Strawberry LARGE true 2 6.5", s1.toString());
	}
	
	@Test
	void testEquals()
	{
		assertFalse(s.equals(s1));
	}
}
