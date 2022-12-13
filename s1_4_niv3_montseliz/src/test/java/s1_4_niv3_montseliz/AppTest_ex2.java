package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AppTest_ex2 {

	App app1 = new App(10); 
	App app2 = new App(10);
	
	@Test
	public void referenceIsNotTheSame() {
	    	
	    assertThat(app1).isNotEqualTo(app2); 
	       
	}
	
	@Test
	public void referenceIsTheSame() {
		app1 = app2;
	
		assertThat(app1).isEqualTo(app2); 
	}
}
