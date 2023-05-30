package yahtzeeDice_DTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Yacht {

	ArrayList<Integer> counts;
	
	public void countDices(ArrayList<Integer> dice) {
		Collections.fill(counts,0);
		
		for(int i = 0; i < dice.size(); i++) {
			counts.set(dice.get(i)-1, (dice.get(i)-1)+1);
		}
	}
	
	public void FullHouse() {
		
		
		
	}
	
	
	
}
