package test;

public class Info {
	private String name;
	private int age;
	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int hashCode() {
//		System.out.println("hashCode()");
//		return name.hashCode() + age;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals()");
//		Info tmp = (Info)obj;
//		if(name.equals(tmp.name) && age == tmp.age	) {
//			return true;
//		}
//		return false;
//	}
}
