import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**@author Shawn Bearam Jr.
 * 
 */

class CustomerTestStudent {
	Customer c;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		c = new Customer("Shawn", 17);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		c = null;
	}

	@Test
	void testCopyConstructor() 
	{
		Customer c1 = new Customer(c);
		assertTrue(c.getAge() == c1.getAge());
		assertTrue(c.getName() == c1.getName());
	}
	
	@Test
	void testToString() 
	{
		assertEquals("Shawn 17", c.toString());
	}
	
}