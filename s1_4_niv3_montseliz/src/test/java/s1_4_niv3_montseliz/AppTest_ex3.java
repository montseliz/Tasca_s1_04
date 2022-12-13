package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest_ex3 {
	
	App values1 = new App (new int[] {5, 10, 15, 20});
	App values2 = new App (new int[] {5, 10, 15, 20});
	
	
	@Test
	public void identicalArrays() {
		
		assertThat(values1.getValues()).isEqualTo(values2.getValues());
		
	}

}
