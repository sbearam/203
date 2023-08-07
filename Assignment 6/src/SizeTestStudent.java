import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Shawn Bearam Jr
 * 
 */
class SizeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSize() 
	{
		assertEquals("SMALL", Size.SMALL.name());
		assertEquals("MEDIUM", Size.MEDIUM.name());
		assertEquals("LARGE", Size.LARGE.name());
	}

}
