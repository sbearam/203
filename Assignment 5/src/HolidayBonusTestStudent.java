
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents student test cases for a HolidayBonus object.
 * 
 * @author Shawn Bearam
 * 
 */
public class HolidayBonusTestStudent {

	private double[][] dataSet1 = { { 400, 50, 6}, { 10, 90 }, { 3, 7, 8} };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonus() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(8000.0, result[0], .001);
			assertEquals(7000.0, result[1], .001);
			assertEquals(7000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonus() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}

}
