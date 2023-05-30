package yahtzeeDice_DTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Yacht {

	ArrayList<Integer> counts = new ArrayList<>();
	
	
	public void countDices(ArrayList<Integer> dice) {
		counts.add(0);
		counts.add(0);
		counts.add(0);
		counts.add(0);
		counts.add(0);
		counts.add(0);
		
		
		for(int i = 0; i < dice.size(); i++) {
			counts.set(dice.get(i)-1, counts.get(dice.get(i)-1)+1);
		}
		
		
	}
	
	public int aces() {
		
		return counts.get(0) * 1;
	}
	
	public int deuces() {
		
		return counts.get(1) * 2;
	}
	
	public int threes() {
		
		return counts.get(2) * 3;
	}
	
	public int fours() {
		
		return counts.get(3) * 4;
	}
	
	public int fives() {
		
		return counts.get(4) * 5;
	}
	
	public int sixex() {
		
		return counts.get(5) * 6;
	}
	
	public void FullHouse() {
		
		
		
	}
	
	
	
}
