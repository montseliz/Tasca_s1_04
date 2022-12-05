package s1_4_niv1_ex2_montseliz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DniCalculation_Test {
	
	@ParameterizedTest
	@CsvSource ({"43566370, T", "38072437, P", "29533288, T", "72198143, Q", "62927996, L", "66315140, E", 
		"11556362, H", "22281164, G", "64968006, N", "68427636, M"}) 
	public void dniCorrect (int dniNumber, char word) {
	    char answer = DniCalculation.dniMethod(dniNumber); 
	    assertEquals (word, answer); 
	}

}
