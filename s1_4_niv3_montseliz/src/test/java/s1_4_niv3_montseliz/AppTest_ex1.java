package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class AppTest_ex1 {
   
	App app1 = new App(10); 
	App app2 = new App(10);
	App app3 = new App(5); 
    
    @Test
    public void valueIsTheSame() {
    	
    	assertThat(app1.getValue()).isEqualTo(app2.getValue()); 
    }
    
    @Test
    public void valueIsTheSame2() {
    	
    	assertThat(app1).usingRecursiveComparison().isEqualTo(app2);
    }
    
    @Test
    public void valueIsNotTheSame() {
    
    	assertThat(app2.getValue()).isNotEqualTo(app3.getValue());
    }
    
   
}
