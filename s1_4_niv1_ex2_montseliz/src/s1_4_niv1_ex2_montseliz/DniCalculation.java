package s1_4_niv1_ex2_montseliz;

public class DniCalculation {
	
	public static void main(String[] args) {
	
		System.out.println(dniMethod(0));
	}
	
	public static char dniMethod (int dniNumber) {
		char[] dniValidation = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 
				 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
		int calculation = dniNumber % 23; 
		
		return dniValidation[calculation]; 
		
	}
	
}
