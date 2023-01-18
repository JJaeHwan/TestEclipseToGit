package test;

import java.util.HashSet;
import java.util.Iterator;

public class ExamSet02 {
	/* Set 인터페이스
	 * 순서가 없고 중복된 데이터를 허용하지 않음
	 * HastSet
	 * TreeSet
	 * LinkedHashSet(순서유지기능존재)
	 * */
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(); //자료형 명시 <>제네릭 형식 Generic
		
//		hs.add("hello");
		hs.add(10); // new Integer(10) auto-boxing
		hs.add(20); 
		hs.add(30); 
//		hs.add(new Info("홍길동", 20));
		
		System.out.println("-------------------------------------");
		Iterator<Integer> it = hs.iterator(); //반복자라는 애를 사용해야 한다.
		while(it.hasNext()) { // 순회
			System.out.println(it.next()); //순서가 랜덤은 아닌데 의미없이 뭔가 뭐라는겨 대체 암튼 동일 데이터 저장안함
		}
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty()); // 비었냐? 아니 
		System.out.println(hs.remove(30)); // 30 지워
		System.out.println(hs.contains(30)); // 30들어있냐? 아니
		System.out.println(hs.size()); // 몇개야?
		
		System.out.println("-------------------------------------");
		
		it = hs.iterator(); // 그래서 다시 생성해야한다
		while(it.hasNext()) {//순회
			System.out.println(it.next()); // 출력안됌 iterator가 next 한다는건 끝까지 이동을 해버려서 안나옴 
		}
	}

}
