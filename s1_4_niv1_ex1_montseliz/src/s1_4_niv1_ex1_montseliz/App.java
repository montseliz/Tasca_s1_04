package s1_4_niv1_ex1_montseliz;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println(arrayMethod());
	}
	
	public static ArrayList<String> arrayMethod() {
		
		ArrayList<String> arrayMonths = new ArrayList<String>();
		
		arrayMonths.addAll(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre")); 
		
		return arrayMonths;
	}

}
