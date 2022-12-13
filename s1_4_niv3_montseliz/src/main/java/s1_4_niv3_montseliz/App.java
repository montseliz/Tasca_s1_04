package s1_4_niv3_montseliz;

public class App {
	
	private int value;
	private int[] values; 
	
	public App(int value) {
		this.value = value; 
	}
	public App (int[] values) {
		this.values = values; 
	}
	
	public int getValue() {
		return value; 
	}
	
	public int[] getValues() {
		return values;
	}
	
	public void setValue(int value) {
		this.value = value; 
	}
	
	public void setValues(int[] values) {
		this.values = values;
	}
    
}

	
