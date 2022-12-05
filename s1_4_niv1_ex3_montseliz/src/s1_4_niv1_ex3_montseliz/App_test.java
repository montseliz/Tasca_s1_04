package s1_4_niv1_ex3_montseliz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class App_test {
	
	@Test
	public void testException() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, new Executable() {

			@Override
			public void execute() throws IndexOutOfBoundsException {
				App.exception(4);
			}
		});
		
	}

	
	/*@Test
	public void testException() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			App.exception(4);
		});
		
	}*/
	
}
