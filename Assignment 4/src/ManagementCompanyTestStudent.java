
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Shawn Bearam
 * 
 */

public class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany mgCo ; 
	
	@Before
	public void setUp() throws Exception {
		mgCo = new ManagementCompany("Bearam", "2222222",4);
	}

	@After
	public void tearDown() throws Exception {
		mgCo=null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Beach", "Ocean City", 500, "Shawn Jr",2,5,2,2);		 
		assertEquals(mgCo.addProperty(sampleProperty),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Beach", "Ocean City", 500, "Shawn Jr",2,5,2,2);		 
		assertEquals(mgCo.addProperty(sampleProperty),0,0);	
		assertEquals(mgCo.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		sampleProperty = new Property ("Beach", "Ocean City", 500, "Shawn Jr",2,5,2,2);		 
		assertEquals(mgCo.addProperty(sampleProperty),0,0);
		assertEquals("List of the properties for Bearam, taxID: 2222222\n_____________________________________________\n"
				+ "Property Name: Beach\nLocated in: Ocean City\nBelongs to: Shawn Jr\nRent Amount: 500.0\n\n_____________________________________________\n\ntotal management Fee: 4.0", mgCo.toString());
				
	}


 
}