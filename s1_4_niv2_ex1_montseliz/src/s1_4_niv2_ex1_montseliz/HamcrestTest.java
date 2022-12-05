package s1_4_niv2_ex1_montseliz;

import org.hamcrest.*;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

public class HamcrestTest {
	
	public static Matcher<String> lenghtMethod(Matcher<? super Integer> matcher) {
		return new FeatureMatcher<String, Integer>(matcher, "la cadena de llargada", 
				"llargada incorrecta") {
			
			@Override
			protected Integer featureValueOf(String word) {
				return word.length();
			}
			
		};
	}
	
	@Test
	public void lengthTest() {
		MatcherAssert.assertThat("Mordor", lenghtMethod(is(8))); 
	}
}
