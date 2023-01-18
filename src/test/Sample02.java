package test;

import java.util.HashSet;

public class Sample02 {
	//중복
	public static void main(String[] args) {
		HashSet<Info> infos = new HashSet<>();
		
		Info info1 = new Info("홍길동", 20);
		Info info2 = new Info("이순신", 32);
		Info info3 = new Info("강감찬", 43);
		Info info4 = new Info("홍길동", 20);
		
		System.out.println(info1 == info4);
		
		infos.add(info1);//hashCode가 동일하면 
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		
		for(Info info : infos) {
			System.out.println(info);
		}
	}

}
