package s1_4_niv3_montseliz;

public class MusicalPlayer_Ex4 {

	private String name; 
	private int age; 
	
	public MusicalPlayer_Ex4(String name, int age) {
		this.name = name; 
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setAge(int age) {
		this.age = age; 
	}

	@Override
	public String toString() {
		return "MusicalPlayer_Ex4 [name=" + name + ", age=" + age + "]";
	}
	
	
}
