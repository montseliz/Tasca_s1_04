package s1_4_niv1_ex3_montseliz;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
	}	
	
	public static String exception(int numApp) throws IndexOutOfBoundsException{
		ArrayList <String> arrayApps = new ArrayList <String>(); 
		arrayApps.addAll(Arrays.asList("Discord ","Instagram ","Youtube ","Twitter ")); 
		
		return arrayApps.get(numApp); 
	
	} 
}
