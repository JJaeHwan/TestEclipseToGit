package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int size = hs.size();
			System.out.print("입력(현재길이): " + size + "):");
			int inputData = sc.nextInt();
			if(hs.contains(inputData)) {
				System.out.println("중복!");
				continue;
			}
			hs.add(inputData);
			print(hs.iterator());
		}
	}

	private static void print(Iterator<Integer> it) {
		while(it.hasNext()) {
			Integer element = it.next();
			System.out.print(element + ",");
		}
		System.out.println();
	}

}
