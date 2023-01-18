package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("서로 다른 길이의 별명을 5번 입력하시오!");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 별명: ");
			String nickName = sc.nextLine();
			list.add(nickName);
		}
		// 가장 긴 별명이 저장될 변수를 선언하고 List의 첫번째 별명을 초기화 한다.
		String longName = list.get(0);  // 가장 긴 사람 한명
		int longLength = list.get(0).length(); // 가장 긴 사람 여러명
		for(int i = 0; i < list.size(); i++) {
			if(longName.length() < list.get(i).length()) {
				longName = list.get(i);
			}
		}
		
//		System.out.println("별명이 가잔 긴 사람 : " + longName);
		
		System.out.println("제일 긴 별명들");
		for(int i = 1; i < list.size(); i++) {
			if(longLength == list.get(i).length()) {
				System.out.println(list.get(i));
			}
		}
		
		
		
	}

}
