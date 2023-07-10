
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("SHAWN"));
		assertTrue(CryptoManager.isStringInBounds("SHAWN IS FUN"));
		assertFalse(CryptoManager.isStringInBounds("shawn"));
		assertFalse(CryptoManager.isStringInBounds("{SHAWN"));
		//assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("why", 3));
		assertEquals("GHI", CryptoManager.caesarEncryption("DEF", 3));
		assertEquals("LWNSGJWL", CryptoManager.caesarEncryption("GRINBERG", 5));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("STUDENT", CryptoManager.caesarDecryption("UVWFGPV", 2));
		assertEquals("CO23", CryptoManager.caesarDecryption("FR56", 3));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("_WW\\!", CryptoManager.bellasoEncryption("SHAWN", "LOVESCS"));
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("LIFE", CryptoManager.bellasoDecryption("U\\[S", "ISUNPREDICTABLE"));

	}

}
