package yahtzeeDice_DTO;

import java.util.ArrayList;
import java.util.Arrays;

public class asdf {

	public static void main(String[] args) {
		Yacht y = new Yacht();
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,3,3,4));
		
		y.countDices(a);
		System.out.println(y.fullHouse());
		System.out.println(y.deuces());
		System.out.println(y.littleStraight());

	}

}
