import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Shawn Bearam Jr
 * 
 */

class DayTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDays() 
	{
		assertEquals("MONDAY", Day.MONDAY.name());
		assertEquals("TUESDAY", Day.TUESDAY.name());
		assertEquals("WEDNESDAY", Day.WEDNESDAY.name());
		assertEquals("THURSDAY", Day.THURSDAY.name());
		assertEquals("FRIDAY", Day.FRIDAY.name());
		assertEquals("SATURDAY", Day.SATURDAY.name());
		assertEquals("SUNDAY", Day.SUNDAY.name());
	}

}
