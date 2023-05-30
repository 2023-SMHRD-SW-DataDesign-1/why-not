package View;

import java.util.ArrayList;

import yahtzeeDice_DTO.Yacht;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yacht y = new Yacht();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		y.countDices(a);
		System.out.println(y.aces());
		System.out.println(y.fives());
	}

}
