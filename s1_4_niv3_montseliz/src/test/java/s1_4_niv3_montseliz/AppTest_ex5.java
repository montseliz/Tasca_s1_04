package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;

import org.junit.Test;

public class AppTest_ex5 {
	
	@Test
	public void itHasTheKey() {
		HashMap <Integer, String> myApps = new HashMap<>(); 
		myApps.put(1, "Discord"); 
		myApps.put(2, "Twitter");
		myApps.put(3, "BeReal"); 
		myApps.put(4, "Instagram"); 
		myApps.put(5, "Facebook"); 
		
		assertThat(myApps).containsKey(4); 
	}
	
	
	
 
}
