package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.Test;

public class AppTest_ex7 {
	
	Optional <App> value = Optional.empty(); 
	
	@Test
	public void optionalIsEmpty() {
		assertThat(value).isEmpty();
		
	}
	
	

}