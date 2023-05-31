package Controller;

import java.util.HashMap;

import yahtzeeDice_DTO.Yacht;

public class HashMapController {
	
	Yacht ya = new Yacht();
	
	public void makeHashMap() {
		
		HashMap<Integer, Integer> yaMap = new HashMap<Integer, Integer>();
		yaMap.put(1, ya.aces());
		yaMap.put(2, ya.deuces());
		yaMap.put(3, ya.threes());
		yaMap.put(4, ya.fours());
		yaMap.put(5, ya.fives());
		yaMap.put(6, ya.sixex());
		yaMap.put(8, ya.choice());
		yaMap.put(9, ya.fourOfAKind());
		yaMap.put(10, ya.fullHouse());
		yaMap.put(11, ya.littleStraight());
		yaMap.put(12, ya.bigStraight());
		yaMap.put(13, ya.Yacht());
		
	}
	

}
