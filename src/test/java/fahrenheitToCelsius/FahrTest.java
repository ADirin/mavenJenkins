package fahrenheitToCelsius;

import static org.junit.Assert.*;

import org.junit.Test;

public class FahrTest {
	
	@Test
	public void testFarCel () {
		assertEquals(7.22, FahrToCel.fahrCel(), 15.11);
		
	}

}
