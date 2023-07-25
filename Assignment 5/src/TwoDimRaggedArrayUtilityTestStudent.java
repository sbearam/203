
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents student test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Shawn Bearam
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = { { 400, 50, 6}, { 10, 90 }, { 3, 7, 8} };
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(100.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	
	/**
	 * Test getColumnTotal method
	 * Returns the total of all the elements of column 1.
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(147.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
	}
	
	/**
	 * Test getAverage method
	 * Returns the average of all the elements in dataSet1 array.
	 */
	@Test
	public void testGetAverage() {
		assertEquals(71.75,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	
	/**
	 * Test getLowestInArray method
	 * Returns the lowest of all the elements in dataSet1 array.
	 */
	@Test
	public void testGetLowestInArray() {
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}
}
