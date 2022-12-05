package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest_ex3 {
	
	int[] values1 = {5, 10, 15, 20};
	int[] values2 = {5, 10, 15, 20}; 
	
	
	@Test
	public void identicalArrays() {
		
		assertThat(values1).isEqualTo(values2);
		
	}

}
