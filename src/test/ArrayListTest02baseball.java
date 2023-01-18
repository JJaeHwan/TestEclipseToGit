package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayListTest02baseball {
	List<Integer> comList;
	List<Integer> userList;
	int strike;
	int ball;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	private void start() {
		//난수 만드는 메서드 호출
		creatNum();
		
		System.out.println("난수: " + comList);
		
		int count = 0; // 몇번만에 성공했는지 체크
		do {
			count++;
			//입력메서드
			inputNum();
			
			//볼카운트메서
			ballCount();
			
		}while(strike !=3);
		System.out.println();
		System.out.println(count + "번째에 맞췄습니다.");
	}
	
	
	//난수 만드는 메서드 ( 1 ~ 9 사이의 서로 다른 난수 3개 만들기)
	// Set으로 만들고 List에 저장한다.
	public void creatNum() {
		Set<Integer> numSet = new HashSet();
		
		Random rnd = new Random();
		
		while(numSet.size() < 3) {
			numSet.add(rnd.nextInt(9)+1);  // numSet에 1~9사이에 만들어진 난수 3개 저장
		}
		// 전역변수로 선언해 놓은 리스트에 numSet을 담아준다
		comList = new ArrayList<Integer>(numSet);
		
		//데이터를 셔플해준다.
		Collections.shuffle(comList);
		
	}
	
	//사용자로부터 3개의 정수를 입력받아 List에 저장하는 메서드.
	public void inputNum() {
		int num1, num2, num3;  //3개의 정수 저장
		
		do {
			System.out.print("숫자입력: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			
			if(num1 == num2 || num1 == num3 || num2 == num3) {
				System.out.println("중복되는 숫자는 입력할 수 없습니다. 다시 입력해주세요.");
			}
			
		}while(num1 == num2 || num1 == num3 || num2 == num3);
		
		//입력 받은 데이터를 만들어 놓은 userList에 추가
		userList = new ArrayList<Integer>();
		userList.add(num1);
		userList.add(num2);
		userList.add(num3);
		
	}
	
	//스트라이크와 볼 판정
	public void ballCount() {
		strike = 0;
		ball = 0;
		
		for(int i = 0; i < comList.size(); i++ ) {
			for(int j = 0; i < userList.size(); j++) {
				if(comList.get(i) == userList.get(i)) {
					if(i == j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		System.out.println(userList.get(0) + ", " + userList.get(1) + ", " +
							userList.get(2)+ " ==> " + strike + "S" + ball + "B");
	}
	
	public static void main(String[] args) {
		new ArrayListTest02baseball().start();
		
	}

	
	
}







