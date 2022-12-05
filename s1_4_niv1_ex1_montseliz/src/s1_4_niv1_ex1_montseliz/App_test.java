package s1_4_niv1_ex1_montseliz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App_test {
	
	@Test
	public void testPositions() {
		assertEquals(12, App.arrayMethod().size());
	}
	
	@Test
	public void testNull() {
		assertNotNull(App.arrayMethod().size());
	}
	
	@Test
	public void testPosition8() {
		assertEquals("Agost", App.arrayMethod().get(7)); 
	}
	
	
}
