
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Shawn Bearam
 * 
 */
public class PlotTestStudent {
	private Plot p1, p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Plot(1, 2, 3, 4);
		p2 = new Plot(5, 6, 6, 5);
	}

	@After
	public void tearDown() throws Exception {
		p1 = p2 = null;
	}

	@Test
	public void testOverlaps() {
		assertFalse(p1.overlaps(p2));
	}
	
	@Test
	public void testToString() {
		assertEquals("5,6,6,5",p2.toString());	
	}

}
