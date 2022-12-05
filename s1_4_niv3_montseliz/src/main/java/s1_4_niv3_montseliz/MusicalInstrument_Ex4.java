package s1_4_niv3_montseliz;

public class MusicalInstrument_Ex4 {

	private String name;
	private String type; 
	
	public MusicalInstrument_Ex4(String name, String type) {
		this.name = name;
		this.type = type; 
	}
	
	public String getName() {
		return name; 
	}
	public String getType() {
		return type; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setType(String type) {
		this.type = type; 
	}

	@Override
	public String toString() {
		return "MusicalInstrument_Ex4 [name=" + name + ", type=" + type + "]";
	}
	
	
	
}
