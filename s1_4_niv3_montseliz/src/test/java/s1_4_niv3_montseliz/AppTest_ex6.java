package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest_ex6 {
	
	int[] values = {5, 10, 15, 20};
	
	@Test
	public void exceptionTest() {
		Throwable thrown = catchThrowable(() -> System.out.println(values[4]));
		assertThat(thrown).isInstanceOf(ArrayIndexOutOfBoundsException.class);

	}
}
