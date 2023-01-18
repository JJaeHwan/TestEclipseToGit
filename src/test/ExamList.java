package test;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(1245);
		a1.add(113651);
		
		a1.add(1, 200);
		
		a1.remove(3);
		
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
	}

}
