package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * key값과 value를 저장한다
 * key는 중복이 안된다. value는 어떤 key와 연결되있는 것이 중요해서 같은 값이 있어도 된다.
 * put으로 저장
 * get으로 가져옴
 * */
public class ExamMap01 {

	public static void main(String[] args) {
		HashMap<Integer, Info> hm = new HashMap<>();
		
//		hm.put("hello", 100);
//		hm.put(10, "tester");
		hm.put(1, new Info("홍길동1", 201));
		hm.put(1, new Info("홍길동2", 202));
		hm.put(1, new Info("홍길동3", 203));
		
		System.out.println(hm.get(10));
//		System.out.println(hm.get("hello"));
		System.out.println(hm.get(1));
		System.out.println(hm.get(1234));
		
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer o : keys) {
			System.out.println(o);
		}
		System.out.println("----------------------");
		
		Collection<Info> values = hm.values();
		for(Info o : values) {
			System.out.println(o);
		}
		System.out.println("----------------------");
		it =keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			Info value = hm.get(key);
			System.out.println(key + ":" + value);
		}
		
	}

}
