package s1_4_niv3_montseliz;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest_ex4 {
	
	MusicalPlayer_Ex4 player1 = new MusicalPlayer_Ex4("Marc", 25);
	MusicalPlayer_Ex4 player2 = new MusicalPlayer_Ex4("Montse", 30);
	MusicalPlayer_Ex4 player3 = new MusicalPlayer_Ex4("Anna", 28);
	
	MusicalInstrument_Ex4 instrument1 = new MusicalInstrument_Ex4("Guitarra", "Corda");
	MusicalInstrument_Ex4 instrument2 = new MusicalInstrument_Ex4("Flauta", "Vent");
	MusicalInstrument_Ex4 instrument3 = new MusicalInstrument_Ex4("Piano", "Corda");
	MusicalInstrument_Ex4 instrument4 = new MusicalInstrument_Ex4("Tambor", "Percussió");
	
	ArrayList <Object> myArray = new ArrayList<>(); 
	
	public void addArrayMethod() {
		
		myArray.add(player1); myArray.add(player2); myArray.add(player3); 
		myArray.add(instrument1); myArray.add(instrument2); myArray.add(instrument3); 
		
	}
	
	@Test
	public void verifyOrder() {
		addArrayMethod(); 
		assertThat(myArray).containsExactly(player1, player2, player3, instrument1, instrument2, instrument3);
		
	}
	
	@Test
	public void containsInAnyOrder() {
		addArrayMethod(); 
		assertThat(myArray).contains(player1, instrument3, instrument1, player3, instrument2, player2); 
	}
	
	@Test
	public void addOnlyOnce() {
		addArrayMethod(); 
		assertThat(myArray).containsOnlyOnce(instrument3);
	}
	
	@Test
	public void notContains() {
		addArrayMethod(); 
		assertThat(myArray).doesNotContain(instrument4); 
	}
	
}
